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
import model.Film;
import model.FilmCategory;

/**
 *
 * @author vvt
 */
public class FilmDAO extends DAO{

    public FilmDAO() {
    }
    
    public Boolean add(Film film) {
        FilmCategoryDAO fcd = new FilmCategoryDAO();
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO tblfilm(name, des, rate,"
                    + " director, length, filmproviderid) VALUES(?,?,?,?,?,?)", 
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, film.getName());
            ps.setString(2, film.getDes());
            ps.setInt(3, film.getRate());
            ps.setString(4, film.getDirector());
            ps.setString(5, film.getLength());
            ps.setInt(6, film.getFp().getId());
            
            ps.executeUpdate();
            
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if(generatedKeys.next()){
                for (int i = 0; i < film.getCategory().size(); i++) {
                    fcd.addFilmCategory((int) generatedKeys.getLong(1), film.getCategory().get(i).getId());
                }
                
                return Boolean.TRUE;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return Boolean.FALSE;
    }
    
    public List<Film> getAllFilm() {
        FilmProviderDAO fpdao = new FilmProviderDAO();
        
        List<Film> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tblfilm");

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                Film film = new Film(rs.getInt("id"), rs.getString("name"), rs.getString("des"),
                        rs.getInt("rate"), rs.getString("director"), rs.getString("length"), fpdao.getById(rs.getInt("filmproviderid")));
                
                PreparedStatement ps2 = con.prepareStatement("SELECT categoryid FROM tblfilmcategory WHERE filmid = " + film.getId());

                ResultSet rs2 = ps2.executeQuery();
                
                while(rs2.next()) {
                    PreparedStatement ps3 = con.prepareStatement("SELECT * FROM tblcategory WHERE id = " + rs2.getInt("categoryid"));

                    ResultSet rs3 = ps3.executeQuery();
                    if(rs3.next())
                        film.getCategory().add(new FilmCategory(rs3.getInt("id"), rs3.getString("name")));
                }
                
                list.add(film);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public List<Film> search(String name) {
        FilmProviderDAO fpdao = new FilmProviderDAO();
        List<Film> list = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tblfilm WHERE name LIKE '%" + name + "%'");

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                Film film = new Film(rs.getInt("id"), rs.getString("name"), rs.getString("des"),
                        rs.getInt("rate"), rs.getString("director"), rs.getString("length"), fpdao.getById(rs.getInt("filmproviderid")));
                
                PreparedStatement ps2 = con.prepareStatement("SELECT categoryid FROM tblfilmcategory WHERE filmid = " + film.getId());

                ResultSet rs2 = ps2.executeQuery();
                
                while(rs2.next()) {
                    PreparedStatement ps3 = con.prepareStatement("SELECT * FROM tblcategory WHERE id = " + rs2.getInt("categoryid"));

                    ResultSet rs3 = ps3.executeQuery();
                    if(rs3.next())
                        film.getCategory().add(new FilmCategory(rs3.getInt("id"), rs3.getString("name")));
                }
                
                list.add(film);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
}
