<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="companyUrl" value="/company/save"></c:url>
<form:form action="${companyUrl}" modelAttribute="company">

	<table>
	  	<c:if test="${!empty company.companyname }">
	<tr>
	<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id" readonly="true" disabled="true"/>
			<form:hidden path="id"/></td>
	</tr>
	</c:if>
		<tr>
			<td><form:label path="companyname">Companyname</form:label></td>
			<td><form:input path="companyname"/></td>
		</tr>
		<tr>
			<td><form:label path="sector">Sector</form:label></td>
			<td><form:input path="sector"/></td>
		</tr>
		<tr>
			<td><form:label path="ceo">CEOname</form:label></td>
			<td><form:input path="ceo"/></td>
		</tr>
		<tr>
			<td><form:label path="bod">Board of Directories</form:label></td>
			<td><form:input path="bod"/></td>
		</tr>
		 	<tr>
			<td><form:label path="turnover">TurnOver</form:label></td>
			<td><form:input path="turnover"/></td>
		</tr>
		
		 
		<tr>
			<td></td>
			<td>
			<c:if test="${empty company.companyname}">
			<input type="submit" value="ADD"/>
			</c:if>
			<c:if test="${!empty company.companyname}">
			<input type="Submit" value="Update"/>
			</c:if>
			</td>
			
		</tr>
		
		
	</table>
	
	<br>
	<table border="1">
<tr>
<th>ID</th>
<th>BoardOfDirectories</th>
<th>CEOName</th>
<th>CompanyName</th>
<th>Sector</th>
<th>TurnOver</th>
<th>Actions<th>


</tr>
<c:forEach var="company" items="${list1 }">
<tr>

<td>${company.id }</td>
<td>${company.bod}</td>
<td>${company.ceo }</td>
<td>${company.companyname }</td>
<td>${company.sector}</td>
<td>${company.turnover }</td>
<td> <a href="<c:url value='/removecompany/${company.id }'/>" >Remove</a> |
<a href="<c:url value='/updatecompany/${company.id }'/>">Update</a>

</tr>


</c:forEach>

</table>
</form:form>
</body>
</html>