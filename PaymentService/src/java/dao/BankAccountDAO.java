/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.BankAccount;

/**
 *
 * @author vvt
 */
public class BankAccountDAO extends DAO{
    public BankAccount getBankAccount(String bankType, BankAccount bankAccount) {
        String sql = "";
        switch (bankType) {
            case "VISA":
                sql = "SELECT name, money FROM tblvisaaccount WHERE cardnumber = ? AND cvc =?";
                break;
            case "MASTER CARD":
                sql = "SELECT name, money FROM tblmastercardaccount WHERE cardnumber = ? AND cvc =?";
                break;
            default:
                throw new AssertionError();
        }
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, bankAccount.getCardNumber());
            ps.setString(2, bankAccount.getCvc());

            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {                
                bankAccount.setName(rs.getString("name"));
                bankAccount.setMoney(rs.getDouble("money"));
                
                return bankAccount;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public void makePayment(String bankType, BankAccount bankAccount, double payMoney) {
        String sql = "";
        switch (bankType) {
            case "VISA":
                sql = "UPDATE tblvisaaccount SET money = ? WHERE cardnumber = ? AND cvc =?";
                break;
            case "MASTER CARD":
                sql = "UPDATE tblmastercardaccount SET money = ? WHERE cardnumber = ? AND cvc =?";
                break;
            default:
                throw new AssertionError();
        }
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, bankAccount.getMoney() - payMoney);
            ps.setString(2, bankAccount.getCardNumber());
            ps.setString(3, bankAccount.getCvc());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
