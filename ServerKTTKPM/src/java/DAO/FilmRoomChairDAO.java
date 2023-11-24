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
import model.Ticket;

/**
 *
 * @author vvt
 */
public class FilmRoomChairDAO extends DAO{
    public void addChairToRoom(ShowTimes showTimes) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tblfilmroomchair WHERE filmroomid = ?");
            ps.setInt(1, showTimes.getFilmRoom().getId());

            ResultSet rs = ps.executeQuery();
                
            while(rs.next()) {
                String status = "n";
                int id = rs.getInt("id");
                
                for (Ticket ticket : showTimes.getListT()) {
                    if(ticket.getC().getId() == id){
                        if(ticket.isSold())
                            status = "y";
                        ticket.setC(showTimes.getFilmRoom().addChair(id, rs.getString("location"), rs.getString("type"),
                                status, rs.getString("des")));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
