/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.flyweight.ChairType;

/**
 *
 * @author vvt
 */
public class FilmRoomChair {
    private static final long serialVersionUID = 109999L;
    
    private int id;
    private String location;
    private ChairType type;

    public FilmRoomChair() {
    }

    public FilmRoomChair(int id) {
        this.id = id;
    }

    public FilmRoomChair(int id, String location, ChairType type) {
        this.id = id;
        this.location = location;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ChairType getType() {
        return type;
    }

    public void setType(ChairType type) {
        this.type = type;
    }
}
