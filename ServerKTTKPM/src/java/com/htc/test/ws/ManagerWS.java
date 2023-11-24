/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.htc.test.ws;

import DAO.FilmDAO;
import DAO.FilmProviderDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Film;
import model.FilmProvider;

/**
 *
 * @author vvt
 */
@WebService(serviceName = "ManagerWS")
public class ManagerWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllFilmProvider")
    public List<FilmProvider> getAllFilmProvider() {
        FilmProviderDAO fpd = new FilmProviderDAO();
        return fpd.getAll();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchFilmProvider")
    public List<FilmProvider> searchFilmProvider(@WebParam(name = "name") String name) {
        FilmProviderDAO fpd = new FilmProviderDAO();
        return fpd.search(name);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addFilm")
    public Boolean addFilm(@WebParam(name = "film") Film film) {
        FilmDAO fd = new FilmDAO();
        return fd.add(film);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addNewFilmProvider")
    public Boolean addNewFilmProvider(@WebParam(name = "filmProvider") FilmProvider filmProvider) {
        FilmProviderDAO fpdao = new FilmProviderDAO();
        return fpdao.add(filmProvider);
    }
    
    
}
