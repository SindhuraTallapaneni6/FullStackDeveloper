package com.cts.training.controller;

//public class DatabaseCo {
//	
//
//}
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
  
// This class can be used to initialize the database connection 
public class DatabaseCo { 
    protected static Connection initializeDatabase() 
        throws SQLException, ClassNotFoundException 
    { 
        // Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql:// localhost:3306/"; 
        // Database name to access 
        String dbName = "cts"; 
        String dbUsername = "root"; 
        String dbPassword = "admin"; 
  
        Class.forName(dbDriver); 
        Connection con = DriverManager.getConnection(dbURL + dbName, 
                                                     dbUsername,  
                                                     dbPassword); 
        return con; 
    } 
} 