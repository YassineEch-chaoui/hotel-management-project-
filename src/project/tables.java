/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class tables {
    public static void main(String[] args)
    {
        Connection con=null;
        Statement st=null;
        try 
        {
            con = ConnectionProvider.getCon(); 
            st=con.createStatement();
            st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(20),securityQuestion varchar(200),answer varchar(200),address varchar(200),status varchar(200))");
            st.executeUpdate("create table room(roomNO varchar(200),roomType varchar(200),bed varchar(200),price int,status varchar(200))");
            st.executeUpdate("create table customer(id int,name varchar(200),mobileNumber varchar(20),nationality varchar(20),gender varchar(20),email varchar(200),idProof varchar(200),address varchar(200),checkIn varchar(200),roomNO varchar(200),bed varchar(200),roomType varchar(200),pricePerDay int(10),numberOfDayStay int(10),totalAmount varchar(200),checkout varchar(200))");


            JOptionPane.showMessageDialog(null, "Table Created Successfully ");
            
            
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
           try {
            
        } catch (Exception e) 
        {} 
        }
        
        
    }
    
}
