/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.FilmProvider;

/**
 *
 * @author vvt
 */
public class FilmProviderDAO extends DAO{

    public FilmProviderDAO() {
    }
    
    public List<FilmProvider> getAll() {
        List<FilmProvider> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tblfilmprovider");

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                list.add(new FilmProvider(rs.getInt("id"), rs.getString("name"), rs.getString("des")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public Boolean add(FilmProvider filmProvider) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO tblfilmprovider(name, des) VALUES(?,?)", 
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, filmProvider.getName());
            ps.setString(2, filmProvider.getDes());
            
            ps.executeUpdate();
            
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if(generatedKeys.next()){
                return Boolean.TRUE;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return Boolean.FALSE;
    }
    
    public FilmProvider getById(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tblfilmprovider WHERE id = " + id);

            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {                
                return new FilmProvider(rs.getInt("id"), rs.getString("name"), rs.getString("des"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public List<FilmProvider> search(String name) {
        List<FilmProvider> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tblfilmprovider WHERE name LIKE '%" + name + "%'");

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                list.add(new FilmProvider(rs.getInt("id"), rs.getString("name"), rs.getString("des")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
}
