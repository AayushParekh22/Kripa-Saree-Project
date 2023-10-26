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
 
 */
public class Warehouse {
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:\\Users\\arindamp\\Desktop\\IAComSc\\Aayush\\ia\\Database.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
     public void insert(String Item, int NumberItems) {
        String sql = "INSERT INTO Warehouse(ItemID,ItemNumber) VALUES(?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, Item);
            pstmt.setDouble(2, NumberItems);
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
