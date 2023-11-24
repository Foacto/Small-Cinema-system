/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import model.FilmRoomChair;
import model.ShowTimes;
import model.Ticket;

/**
 *
 * @author vvt
 */
public class TicketDAO extends DAO{
    public List<Ticket> getAllTicketInShowTime(ShowTimes showTime) {
        showTime.getListT().clear();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tblticket WHERE showtimesid = ?");
            ps.setInt(1, showTime.getId());

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int chairId = rs.getInt("filmroomchairid");
                
                int billId = rs.getInt("billid");
                if(rs.wasNull())
                    showTime.getListT().add(new Ticket(rs.getInt("id"), rs.getString("des"), rs.getDouble("price"), Boolean.FALSE, new FilmRoomChair(rs.getInt("filmroomchairid")), null));
                else
                    showTime.getListT().add(new Ticket(rs.getInt("id"), rs.getString("des"), rs.getDouble("price"), Boolean.TRUE, new FilmRoomChair(rs.getInt("filmroomchairid")), null));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return showTime.getListT();
    }
    
    public void updateTicketToBill(int billId, int ticketId) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE tblticket SET billid = ? WHERE id=?");
            ps.setInt(1, billId);
            ps.setInt(2, ticketId);
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
