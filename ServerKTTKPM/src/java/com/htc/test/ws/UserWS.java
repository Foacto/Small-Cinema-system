/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.htc.test.ws;

import DAO.BillDAO;
import DAO.FilmCategoryDAO;
import DAO.FilmDAO;
import DAO.FilmRoomChairDAO;
import DAO.ShowTimesDAO;
import DAO.TicketDAO;
import DAO.UserDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Bill;
import model.Customer;
import model.Employee;
import model.Film;
import model.FilmCategory;
import model.ShowTimes;
import model.User;

/**
 *
 * @author vvt
 */
@WebService(serviceName = "UserWS")
public class UserWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "login")
    public User login(@WebParam(name = "user") User user) {
        UserDAO userDAO = new UserDAO();
        User u = userDAO.CheckLogin(user);
        return u;
    }
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "register")
    public String register(@WebParam(name = "customer") Customer customer) {
        UserDAO userDAO = new UserDAO();
        return userDAO.register(customer);
    }
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "logout")
    public void logout(@WebParam(name = "user") User user) {
        UserDAO userDAO = new UserDAO();
        userDAO.Logout(user);
    }
    
    @WebMethod(operationName = "getEmp")
    public Employee getEmp() {
        //TODO write your implementation code here:
        return new Employee();
    }
    
    @WebMethod(operationName = "getCus")
    public Customer getCus() {
        //TODO write your implementation code here:
        return new Customer();
    }
    
    @WebMethod(operationName = "getListFilm")
    public List<Film> getListFilm() {
        FilmDAO fd = new FilmDAO();
        return fd.getAllFilm();
    }
    
    @WebMethod(operationName = "searchFilm")
    public List<Film> searchFilm(@WebParam(name = "name") String name) {
        FilmDAO fd = new FilmDAO();
        return fd.search(name);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getListFilmCategory")
    public List<FilmCategory> getListFilmCategory() {
        FilmCategoryDAO fcd = new FilmCategoryDAO();
        return fcd.getListCategory();
    }
    
    @WebMethod(operationName = "getListShowTimesOfFilm")
    public List<ShowTimes> getListShowTimesOfFilm(@WebParam(name = "film")Film film) {
        ShowTimesDAO stdao = new ShowTimesDAO();
        return stdao.getShowTimesOfFilm(film);
    }
    
    @WebMethod(operationName = "getShowTimesDetails")
    public ShowTimes getShowTimesDetails(@WebParam(name = "showTimes")ShowTimes showTimes) {
        TicketDAO td = new TicketDAO();
        td.getAllTicketInShowTime(showTimes);
        
        FilmRoomChairDAO cdao = new FilmRoomChairDAO();
        cdao.addChairToRoom(showTimes);
        
        return showTimes;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getBill")
    public Bill getBill() {
        return new Bill();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addBill")
    public Bill addBill(@WebParam(name = "bill") Bill bill) {
        BillDAO bd = new BillDAO();
        return bd.add(bill);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updatePaidBill")
    public void updatePaidBill(@WebParam(name = "billId") int billId) {
        BillDAO bd = new BillDAO();
        bd.updatePay(billId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getFilm")
    public Film getFilm() {
        //TODO write your implementation code here:
        return new Film();
    }
    
    
}
