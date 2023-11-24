/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;

/**
 *
 * @author vvt
 */
public class Bill {
    private static final long serialVersionUID = 109999L;
    
    private int id;
    private double total;
    private Date sellDate;
    private String note;
    private Employee employee;
    private Customer customer;
    @XmlElement(name="ticket")
    @XmlElementWrapper(name="list-ticket")
    private List<Ticket> listT = new ArrayList<>();
//    @XmlList()
//    private List<BuyProduct> listBP = new ArrayList<>();
//    @XmlList()
//    private List<GiftedProduct> listGP = new ArrayList<>();

    public Bill() {
    }

    public Bill(double total, Date sellDate, String note, Employee employee, Customer customer) {
        this.total = total;
        this.sellDate = sellDate;
        this.note = note;
        this.employee = employee;
        this.customer = customer;
    }

    public Bill(int id, double total, Date sellDate, String note, Employee employee, Customer customer) {
        this.id = id;
        this.total = total;
        this.sellDate = sellDate;
        this.note = note;
        this.employee = employee;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Ticket> getListT() {
        return listT;
    }
}
