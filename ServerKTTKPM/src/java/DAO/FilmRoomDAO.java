/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.FilmRoom;
import model.ShowTimes;

/**
 *
 * @author vvt
 */
public class FilmRoomDAO extends DAO{
    public FilmRoom getFilmRoomById(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT note FROM tblfilmroom WHERE id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
                
            if(rs.next()) {
                FilmRoom filmRoom = new FilmRoom(id, rs.getString("note"));
                return filmRoom;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
