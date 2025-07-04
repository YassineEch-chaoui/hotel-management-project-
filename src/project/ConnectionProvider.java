/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
             return DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?serverTimezone=UTC", "root", "root");
              } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}









           
  
