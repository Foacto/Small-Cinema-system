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
import model.FilmCategory;

/**
 *
 * @author vvt
 */
public class FilmCategoryDAO extends DAO{
    public List<FilmCategory> getListCategory() {
        List<FilmCategory> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tblcategory");

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                list.add(new FilmCategory(rs.getInt("id"), rs.getString("name")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public void addFilmCategory(int filmId, int categoryId) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO tblfilmcategory(filmid, categoryid) VALUES(?,?)");
            ps.setInt(1, filmId);
            ps.setInt(2, categoryId);
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
