<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload='document.loginForm.j_username.focus():'>
<h3>Custom login page</h3>
<%
	String errorString = (String) request.getAttribute("error");
	if(errorString != null && errorString.trim().equals("true")){
		out.println("<span class=\'errorblock\'>Incorrect login name or password. Please try again!! ");
	}

%>
<form name='loginForm' action="<c:url value='login'></c:url>" method="post">
<table>
         <tr>
          <td>User:</td>
          <td><input type="text" name='username' value=''></td>
         </tr>
         <tr>
          <td>Password: </td>
          <td><input type="password" name='password' ></td>
         </tr>
         
         <tr>
            <td><input name="submit" type="submit" value="submit" ></td>
            <td><input name="reset" type="reset"></td>
         </tr>
      </table>
</form>
</body>
</html>