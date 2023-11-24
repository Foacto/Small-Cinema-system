/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.flyweight;

/**
 *
 * @author vvt
 */
public class ChairType {
    private static final long serialVersionUID = 109999L;
    
    private String type, status, des;

    public ChairType() {
    }

    public ChairType(String type, String status, String des) {
        this.type = type;
        this.status = status;
        this.des = des;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
}
