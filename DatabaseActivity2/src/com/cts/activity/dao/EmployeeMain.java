package com.cts.activity.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class EmployeeMain {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/cts";
	String username="root";
	String password="admin";
	Connection conn=DriverManager.getConnection(url,username,password);
	System.out.println("connected");
	Statement stmt=conn.createStatement();
	String query="insert into employeee values(200,'arjun','kerala',7869564738)";
	String query1="update employeee set address='Telangana' where id=200";
	String query2="delete employee where id=104";
	int result=stmt.executeUpdate(query2);
	if(result>0)
	{
		System.out.println("deleted");
	}
	else
		System.out.println("tryagain");
//	if(result>0)
//	{
//		System.out.println("values inserted successfully");
//	}
//	else
//		System.out.println("not inserted");
//	if(result>0)
//	{
//		System.out.println("udated successfully");
//	}
//	else
//		System.out.println("try again");
}

}
