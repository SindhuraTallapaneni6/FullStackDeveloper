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
String name=request.getParameter("user");  
out.print("welcome "+name);  
%>
</body>
</html>