<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER DETAILS</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<c:url var="userUrl" value="/user/save"></c:url>
<form:form action="${userUrl}" modelAttribute="usermodel">

	<table>
	  		<c:if test="${!empty user.username }">
	<tr>
	<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id" readonly="true" disabled="true"/>
			<form:hidden path="id"/></td>
	</tr>
	</c:if>
	<tr>
			<td><form:label path="name">Name</form:label></td>
			<td><form:input path="name"/></td>
		</tr>
	<tr>
			<td><form:label path="username">UserName</form:label></td>
			<td><form:input path="username"/></td>
		</tr>
		
		<tr>
			<td><form:label path="password">Password</form:label></td>
			<td><form:input path="password"/></td>
		</tr>
		
		 	<tr>
			<td><form:label path="address">Address</form:label></td>
			<td><form:input path="address"/></td>
		</tr>
		
		<tr>
			<td><form:label path="phone">Phone</form:label></td>
			<td><form:input path="phone"/></td>
		</tr>
		
		 
		<tr>
			<td></td>
			<td>
			<c:if test="${empty user.username}">
			<input type="submit" value="ADD"/>
			</c:if>
			<c:if test="${!empty user.username}">
			<input type="Submit" value="Update"/>
			</c:if>
			</td>
			
		</tr>
		
	</table>
	</form:form>
	 
	<br>
<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>UserName</th>
<th>Password</th>
<th>Address</th>
<th>Actions</th>


</tr>
<c:forEach var="user" items="${userslist }">
<tr>

<td>${user.id }</td>
<td>${user.name}</td>
<td>${user.username }</td>
<td>${user.password }</td>
<td>${user.address }</td>


<td> <a href="<c:url value='/removeuser/${user.id }'/>" >Remove</a> |
<a href="<c:url value='/updateuser/${user.id }'/>">Update</a>

</tr>


</c:forEach>

</table>
</body>
</html>