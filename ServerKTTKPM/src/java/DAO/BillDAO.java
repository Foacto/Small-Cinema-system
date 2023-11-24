/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Bill;

/**
 *
 * @author vvt
 */
public class BillDAO extends DAO{
    public Bill add(Bill bill) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            for (int i = 0; i < bill.getListT().size(); i++) {
                PreparedStatement pscheck = con.prepareStatement("SELECT billid FROM tblticket WHERE id = ?");
                pscheck.setInt(1, bill.getListT().get(i).getId());
                
                ResultSet rscheck = pscheck.executeQuery();
                if(rscheck.next()){
                    int billId = rscheck.getInt("billid");
                    if(!rscheck.wasNull())
                        return null;
                }
            }
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO tblbill(sellDate, note, paid,"
                    + " customerid, employeeid) VALUES(?,?,?,?,?)", 
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dateFormat.format(new Date()));
            if(bill.getNote() == null)
                ps.setNull(2, Types.NULL);
            else
                ps.setString(2, bill.getNote());
            ps.setString(3, "n");
            ps.setInt(4, bill.getCustomer().getId());
            if(bill.getEmployee() == null)
                ps.setNull(5, Types.NULL);
            else
                ps.setInt(5, bill.getEmployee().getId());
            
            ps.executeUpdate();
            
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if(generatedKeys.next()){
                bill.setId((int) generatedKeys.getLong(1));
                TicketDAO td = new TicketDAO();
                for (int i = 0; i < bill.getListT().size(); i++) {
                    td.updateTicketToBill(bill.getId(), bill.getListT().get(i).getId());
                }
                
                return bill;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public void updatePay(int billId) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE tblbill SET paid = ? WHERE id=?");
            ps.setString(1, "y");
            ps.setInt(2, billId);
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
