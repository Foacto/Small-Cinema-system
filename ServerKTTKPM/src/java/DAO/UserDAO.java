/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Customer;
import model.Employee;
import model.User;

/**
 *
 * @author vvt
 */
public class UserDAO extends DAO{

    public UserDAO() {
    }
    
    public User CheckLogin(User user) {
         try {
            PreparedStatement ps = con.prepareStatement("Select id, name, status, type from tbluser Where username=? And password=?");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            
            System.out.println("User: " + user.getUsername() + " is login!");
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                if(rs.getInt("status") == 1)
                    return null;
                else{
                    PreparedStatement psx = con.prepareStatement("UPDATE tbluser SET status = 1 WHERE id=?");
                    psx.setInt(1, user.getId());
                    
                    psx.executeUpdate();
                }
                user.setType(rs.getString("type"));
                
                if(user.getType().equals("emp") || user.getType().equals("man")) {
                    PreparedStatement ps2 = con.prepareStatement("Select salary from tblemployee Where id=?");
                    ps2.setInt(1, user.getId());
                    
                    ResultSet rs2 = ps2.executeQuery();
                    if(rs2.next())
                        return new Employee(user, rs2.getDouble("salary"));
                }
                else if(user.getType().equals("cus")) {
                    PreparedStatement ps2 = con.prepareStatement("Select phonenumber, des, point from tblcustomer Where id=?");
                    ps2.setInt(1, user.getId());
                    
                    ResultSet rs2 = ps2.executeQuery();
                    if(rs2.next())
                        return new Customer(user, rs2.getString("phonenumber"), rs2.getString("des"), rs2.getInt("point"));
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public String register(Customer customer) {
        try {
            PreparedStatement ps = con.prepareStatement("Select id from tbluser Where username=?");
            ps.setString(1, customer.getUsername());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) 
                return "This username is already registed!";
            else {
                PreparedStatement ps2 = con.prepareStatement("INSERT INTO tbluser(name, username, password, type) VALUES(?,?,?,?)", 
                    Statement.RETURN_GENERATED_KEYS);
                ps2.setString(1, customer.getName());
                ps2.setString(2, customer.getUsername());
                ps2.setString(3, customer.getPassword());
                ps2.setString(4, "cus");

                ps2.executeUpdate();

                ResultSet generatedKeys = ps2.getGeneratedKeys();
                if(generatedKeys.next()){
                    PreparedStatement ps3 = con.prepareStatement("INSERT INTO tblcustomer(id, phonenumber, des) VALUES(?,?,?)", 
                    Statement.RETURN_GENERATED_KEYS);
                    ps3.setInt(1, (int) generatedKeys.getLong(1));
                    ps3.setString(2, customer.getPhonenumber());
                    ps3.setString(3, customer.getDes());

                    ps3.executeUpdate();

                    ResultSet generatedKeys3 = ps3.getGeneratedKeys();
                    
                    if(generatedKeys3.next()) {
                        return "Regist success!";
                    }
                }
                else
                    return "Regist new user fail";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return "Regist new user fail";
    }
    
    public void Logout(User user) {
        try {
            System.out.println("User: " + user.getUsername() + " is logout!");
            PreparedStatement ps = con.prepareStatement("UPDATE tbluser SET status = 0 WHERE id=?");
            ps.setInt(1, user.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
