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
import javax.xml.bind.annotation.XmlList;

/**
 *
 * @author lcmin
 */
public class Film implements Serializable{
    private static final long serialVersionUID = 109999L;
    
    private int id;
    private String name;
    private String des;
    private int rate = 0;
    private String director;
    private String length;
    @XmlElement(name="film-category")
    @XmlElementWrapper(name="list-film-category")
    private List<FilmCategory> category = new ArrayList<>();
    private FilmProvider fp;
    @XmlElement(name="show-time")
    @XmlElementWrapper(name="list-show-time")
    private List<ShowTimes> listst = new ArrayList<>();

    public Film() {
    }

    public Film(int id, String name, String des, int rate, String director, String length, FilmProvider fp) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.rate = rate;
        this.director = director;
        this.length = length;
        this.fp = fp;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public List<FilmCategory> getCategory() {
        return category;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    public int getRate() {
        return rate;
    }

    public String getDirector() {
        return director;
    }

    public FilmProvider getFp() {
        return fp;
    }

    public void setFp(FilmProvider fp) {
        this.fp = fp;
    }

    public List<ShowTimes> getListst() {
        return listst;
    }
}
