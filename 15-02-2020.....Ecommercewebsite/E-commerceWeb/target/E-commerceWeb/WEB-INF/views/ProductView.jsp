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
<%@ include file="Header.jsp" %>
<c:url var="productUrl" value="/product/save"></c:url>
<form:form action="${productUrl}" modelAttribute="productmodel">

	<table>
	  		<c:if test="${!empty product.productName }">
	<tr>
	<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id" readonly="true" disabled="true"/>
			<form:hidden path="id"/></td>
	</tr>
	</c:if>
		<tr>
			<td><form:label path="productName">ProductName</form:label></td>
			<td><form:input path="productName"/></td>
		</tr>
		<tr>
			<td><form:label path="description">Description</form:label></td>
			<td><form:input path="description"/></td>
		</tr>
		
		 	<tr>
			<td><form:label path="price">PriceOfProduct</form:label></td>
			<td><form:input path="price"/></td>
		</tr>
		 
		<tr>
			<td></td>
			<td>
			<c:if test="${empty product.productName}">
			<input type="submit" value="ADD"/>
			</c:if>
			<c:if test="${!empty product.productName}">
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
<th>ProductName</th>
<th>Description</th>
<th>PriceOfProduct</th>
<th>Actions</th>


</tr>
<c:forEach var="product" items="${productslist }">
<tr>

<td>${product.id }</td>
<td>${product.productName}</td>
<td>${product.description }</td>
<td>${ipo.price }</td>


<td> <a href="<c:url value='/removeproduct/${product.id }'/>" >Remove</a> |
<a href="<c:url value='/updateproduct/${product.id }'/>">Update</a>

</tr>


</c:forEach>

</table>
</body>
</html>