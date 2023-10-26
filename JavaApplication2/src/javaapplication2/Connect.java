/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author arindamp
 */
public class Connect {
    
    public static void connect() {
        
    Login l = new Login();
        l.setVisible(true);
        
    }
    public static void main(String[] args) {
        connect();
    }
}
