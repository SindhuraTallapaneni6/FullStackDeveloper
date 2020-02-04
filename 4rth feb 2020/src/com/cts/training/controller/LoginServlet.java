package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
			LoginDAO dao=new LoginDAO();
		 if(dao.validate(username, password)){  
		        RequestDispatcher rd=request.getRequestDispatcher("Welcome.html");  
		        rd.forward(request,response);  
		    }  
		    else{  
		        out.print("Sorry username or password error");  
		        RequestDispatcher rd=request.getRequestDispatcher("Login.html");  
		        rd.include(request,response);  
		    }  
		          
		    out.close();
}
}
