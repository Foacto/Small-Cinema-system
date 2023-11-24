/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import model.flyweight.FilmRoomFlyweight;

/**
 *
 * @author vvt
 */
public class FilmRoom {
    private static final long serialVersionUID = 109999L;
    
    private int id;
    private String note;
    @XmlElement(name="chair")
    @XmlElementWrapper(name="list-chair")
    private List<FilmRoomChair> listC = new ArrayList<>();

    public FilmRoom() {
    }

    public FilmRoom(int id, String note) {
        this.id = id;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<FilmRoomChair> getListC() {
        return listC;
    }
    
    public FilmRoomChair addChair(int id, String location, String type, String status, String des) {
        FilmRoomChair chair = new FilmRoomChair(id, location, FilmRoomFlyweight.getChairType(type, status, des));
        listC.add(chair);
        
        return chair;
    }
}
