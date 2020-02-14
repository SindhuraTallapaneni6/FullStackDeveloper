package com.cts.training.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
public class LoginServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		RequestDispatcher rd = null;
		if(user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin@123"))
		{
		  rd = req.getRequestDispatcher("admin.jsp");
		  rd.forward(req, resp);
		}else {
			out.println("<h2 style=\"color:red;\">Something went wrong........Please try again</h2>");
			rd= req.getRequestDispatcher("loginPage.jsp");
			rd.include(req, resp);
		}
	}
}










