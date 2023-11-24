/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vvt
 */
public class CreateDBConnection {
    private Connection con;
    
    private static CreateDBConnection instance;
    
    private final String jdbcURL = "jdbc:mysql://localhost:3306/db_bank";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "27012001";

    public CreateDBConnection() {
        if(con == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    
    public synchronized static CreateDBConnection getInstance() {
        if(instance == null)
            instance = new CreateDBConnection();
        
        return instance;
    }

    public Connection getCon() {
        return con;
    }
    
    
}
