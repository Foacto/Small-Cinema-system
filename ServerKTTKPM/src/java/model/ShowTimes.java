/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author vvt
 */
public class ShowTimes {
    private static final long serialVersionUID = 109999L;
    
    private int id;
    private Film film;
    private FilmRoom filmRoom;
    private Date timeStart;
    private Date timeEnd;
    @XmlElement(name="ticket")
    @XmlElementWrapper(name="list-ticket")
    private List<Ticket> listT = new ArrayList<>();

    public ShowTimes() {
    }

    public ShowTimes(int id, Film film, FilmRoom filmRoom, Date timeStart) {
        this.id = id;
        this.film = film;
        this.filmRoom = filmRoom;
        this.timeStart = timeStart;
        
        String[] times = this.film.getLength().split(" ");
        
        int hrs = 0, min = 0;
        
        try {
            hrs = timeStart.getHours() + Integer.parseInt(times[0]);
            min = timeStart.getMinutes() + Integer.parseInt(times[2]);
            if(min >= 60) {
                min -= 60;
                hrs += 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        timeEnd = new Date(timeStart.getYear(), timeStart.getMonth(), timeStart.getDate(), hrs, min, 0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public FilmRoom getFilmRoom() {
        return filmRoom;
    }

    public void setFilmRoom(FilmRoom filmRoom) {
        this.filmRoom = filmRoom;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public List<Ticket> getListT() {
        return listT;
    }
}
