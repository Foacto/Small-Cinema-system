/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vvt
 */
public class Ticket {
    private static final long serialVersionUID = 109999L;
    
    private int id;
    private String des;
    private double price;
    private Boolean sold;
    private ShowTimes st;
    private FilmRoomChair c;
    private Bill bill;

    public Ticket() {
    }

    public Ticket(int id, String des, double price, Boolean sold, FilmRoomChair c, Bill bill) {
        this.id = id;
        this.des = des;
        this.price = price;
        this.sold = sold;
        this.c = c;
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean isSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    public ShowTimes getSt() {
        return st;
    }

    public void setSt(ShowTimes st) {
        this.st = st;
    }

    public FilmRoomChair getC() {
        return c;
    }

    public void setC(FilmRoomChair c) {
        this.c = c;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
    
    
}
