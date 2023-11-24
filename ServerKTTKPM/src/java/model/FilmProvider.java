/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author vvt
 */
public class FilmProvider implements Serializable{
    private static final long serialVersionUID = 109999L;
    
    private int id;
    private String name, des;
    @XmlElement(name="film")
    @XmlElementWrapper(name="list-film")
    private List<Film> listF = new ArrayList<>();

    public FilmProvider() {
    }

    public FilmProvider(int id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public List<Film> getListF() {
        return listF;
    }
}
