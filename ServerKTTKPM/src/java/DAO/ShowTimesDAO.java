/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Film;
import model.FilmRoom;
import model.ShowTimes;

/**
 *
 * @author vvt
 */
public class ShowTimesDAO extends DAO{
    public List<ShowTimes> getShowTimesOfFilm(Film film) {
        FilmRoomDAO frdao = new FilmRoomDAO();
        List<ShowTimes> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tblshowtimes WHERE filmid = ? AND timestart >= curdate()");
            ps.setInt(1, film.getId());

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                list.add(new ShowTimes(rs.getInt("id"), film, frdao.getFilmRoomById(rs.getInt("filmroomid")), rs.getTimestamp("timestart")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
}
