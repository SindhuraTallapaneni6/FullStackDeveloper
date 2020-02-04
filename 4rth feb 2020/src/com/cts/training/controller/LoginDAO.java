package com.cts.training.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql:// localhost:3306/cts","root","admin");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from Register where uname=? and rpwd=?");  
		ps.setString(1,name);  
		ps.setString(2,pass);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  

}
