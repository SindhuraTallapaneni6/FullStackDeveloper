<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CATEGORY DETAILS</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<c:url var="categoryUrl" value="/category/save"></c:url>
<form:form action="${categoryUrl}" modelAttribute="categorymodel">

	<table>
	  		<c:if test="${!empty category.categoryName }">
	<tr>
	<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id" readonly="true" disabled="true"/>
			<form:hidden path="id"/></td>
	</tr>
	</c:if>
	
	<tr>
			<td><form:label path="categoryName">CategoryName</form:label></td>
			<td><form:input path="categoryName"/></td>
		</tr>
		
		
		 
		<tr>
			<td></td>
			<td>
			<c:if test="${empty category.categoryName}">
			<input type="submit" value="ADD"/>
			</c:if>
			<c:if test="${!empty category.categoryName}">
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
<th>CategoryName</th>
<th>Actions</th>


</tr>
<c:forEach var="category" items="${categorylist }">
<tr>

<td>${category.id }</td>
<td>${category.categoryName}</td>




<td> <a href="<c:url value='/removecategory/${category.id }'/>" >Remove</a> |
<a href="<c:url value='/updatecategory/${category.id }'/>">Update</a>

</tr>


</c:forEach>

</table>
</body>
</html>