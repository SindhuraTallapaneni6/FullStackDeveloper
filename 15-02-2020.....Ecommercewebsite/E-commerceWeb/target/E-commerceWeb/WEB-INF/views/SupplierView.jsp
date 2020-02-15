<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SUPPLIER DETAILS</title>
</head>
<body>

<%@ include file="Header.jsp" %>
<c:url var="supplierUrl" value="/supplier/save"></c:url>
<form:form action="${supplierUrl}" modelAttribute="suppliermodel">

	<table>
	  		<c:if test="${!empty supplier.supplierName }">
	<tr>
	<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id" readonly="true" disabled="true"/>
			<form:hidden path="id"/></td>
	</tr>
	</c:if>
	
	<tr>
			<td><form:label path="supplierName">SupplierName</form:label></td>
			<td><form:input path="supplierName"/></td>
		</tr>
		
		<tr>
			<td><form:label path="supplierAddress">SupplierAddress</form:label></td>
			<td><form:input path="supplierAddress"/></td>
		</tr>
		
		 	<tr>
			<td><form:label path="supplierPhone">SupplierPhone</form:label></td>
			<td><form:input path="supplierPhone"/></td>
		</tr>
		 
		<tr>
			<td></td>
			<td>
			<c:if test="${empty supplier.supplierName}">
			<input type="submit" value="ADD"/>
			</c:if>
			<c:if test="${!empty supplier.supplierName}">
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
<th>SupplierName</th>
<th>SupplierAddress</th>
<th>SupplierPhone</th>
<th>Actions</th>


</tr>
<c:forEach var="supplier" items="${supplierslist }">
<tr>

<td>${supplier.id }</td>
<td>${supplier.supplierName}</td>
<td>${user.supplierAddress }</td>
<td>${user.supplierPhone }</td>



<td> <a href="<c:url value='/removeuser/${supplier.id }'/>" >Remove</a> |
<a href="<c:url value='/updateuser/${supplier.id }'/>">Update</a>

</tr>


</c:forEach>

</table>
</body>
</html>