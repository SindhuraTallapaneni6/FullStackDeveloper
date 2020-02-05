
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="Header.jsp" %>
<title>Insert title here</title>
</head>
<body>
<% 
	Date date = new Date();


%>
<%=date %>
<br>
<%= getSum(3,4) %>
<%!
	public static int getSum(int a, int b){
	return a+b;
}
%>

</body>
</html>