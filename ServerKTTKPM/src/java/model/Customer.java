/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author vvt
 */
public class Customer extends User implements Serializable {
    private static final long serialVersionUID = 109999L;
    
    private String phonenumber, des;
    private long point;

    public Customer() {
    }

    public Customer(User user, String phonenumber, String des, long point) {
        super(user);
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + getId() + ", name=" + getName() + ", username=" + getUsername() + ", type=" + getType() + ", status=" + isStatus() + "phonenumber=" + phonenumber + ", des=" + des + ", point=" + point + '}';
    }
}
