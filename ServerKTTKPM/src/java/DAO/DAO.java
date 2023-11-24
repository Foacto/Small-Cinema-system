/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
