package com.cts.activity.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.PreparedStatement;


public class EmployeeMain {
	public static void main(String args[])throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("enter name:");
		String name=sc.nextLine();	
		System.out.println("enter address");
		String addr=sc.nextLine();
		System.out.println("enter phone");
		long phone=Long.parseLong(sc.nextLine());
		Class.forName("com.mysql.jdbc.Driver");
		
		
		
		//Establish the connection with database
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="admin";
		Connection conn=DriverManager.getConnection(url, username, password);
		String query="insert into employeee values(?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setString(3, addr);
		ps.setLong(4, phone);
		int result=ps.executeUpdate();
		if(result>0)
		{
			System.out.println("data inserted successfully");
		}
		else
		{
			System.out.println("try again");
		}
		
		
		//create statement
		Statement stmt=conn.createStatement();
		//String query="insert into employeee values(103,'sindhu','ap',9876856474)";
//		String query1="update employeee set name='tanu' where id=104";
//		int result=stmt.executeUpdate(query1);
		//if(result>0)
		//{
			//System.out.println("data inserted successfully");
			
		//}
//		else
//		{
//			System.out.println("Try again");
//		}
//		System.out.println("connection established");
//		String query="select * from employeee";
//		ResultSet rs=stmt.executeQuery(query);
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getLong(4));
//		}
//		
		
}
}
