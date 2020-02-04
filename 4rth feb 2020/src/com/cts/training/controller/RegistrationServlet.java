package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		String username = request.getParameter("uname");
		String password = request.getParameter("rpwd");
		String repass=request.getParameter("repwd");
		String email = request.getParameter("email");
		int otp = Integer.parseInt(request.getParameter("otp"));
		long phone= Long.parseLong(request.getParameter("phone"));
		try { 
			  
            // Initialize the database 
            Connection con = DatabaseCo.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            PreparedStatement st = con 
                   .prepareStatement("insert into Register values(?, ?, ?, ?, ?, ?, ?, ?, ?)"); 
  
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
            st.setInt(1, id); 
  
            // Same for second parameter 
            st.setString(2,firstname); 
            st.setString(3,lastname); 
            st.setString(4,username); 
            st.setString(5,password); 
            st.setString(6,repass); 
            st.setString(7,email);
            st.setInt(8,otp);
            st.setLong(9,phone); 
  
            // Execute the insert command using executeUpdate() 
            // to make changes in database 
            st.executeUpdate(); 
  
            // Close all the connections 
            st.close(); 
            con.close(); 
  
            // Get a writer pointer  
            // to display the successful result 
            //PrintWriter outer = response.getWriter(); 
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>"); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
//		out.println("Id : "+id);
//		out.println("Firstname : "+firstname);
//		out.println("Lastname : "+lastname);
//		out.println("Username : "+username);
//		out.println("Password : "+password);
//		out.println("email : "+email);
//		out.println("OTP : "+otp);
//		out.println("Phone : "+phone);
		
		
	}
}
