package com.jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	public static void main(String a[]){

    	 try {
    		 Class.forName("com.mysql.jdbc.Driver");  
           Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","testuser", "password");
             Statement stmt = con.createStatement();
             System.out.println("Created DB Connection....");
         } catch (ClassNotFoundException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
    
}
	}
