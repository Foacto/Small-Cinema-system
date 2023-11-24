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
public class User implements Serializable{
    private static final long serialVersionUID = 109999L;
    
    private int id;
    private String name, username, password, type;
    private boolean status;

    public User() {
    }
    
    public User(User user) {
        this.id = user.id;
        this.name = user.name;
        this.username = user.username;
        this.password = user.password;
        this.type = user.type;
        this.status = user.status;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id, String name, String username, String password, String type, boolean status) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.type = type;
        this.status = status;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", type=" + type + ", status=" + status + '}';
    }
}
