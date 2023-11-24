/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;

/**
 *
 * @author vvt
 */
public class DAO {
    public static Connection con;
    
    public DAO() {
        con = CreateDBConnection.getInstance().getCon();
    }
}
