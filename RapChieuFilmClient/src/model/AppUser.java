/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.htc.test.ws.User;
import javax.swing.JFrame;

/**
 *
 * @author vvt
 */
public class AppUser {
    private static AppUser instance = null;
    private String cinemaID = "1999900";
    private User user;
    private JFrame home;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public JFrame getHome() {
        return home;
    }

    public void setHome(JFrame home) {
        this.home = home;
    }

    public String getCinemaID() {
        return cinemaID;
    }
    
    public synchronized static AppUser getInstance() {
        if(instance == null)
            instance = new AppUser();
        
        return instance;
    }
}
