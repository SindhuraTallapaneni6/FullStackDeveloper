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
<c:url var="ipoUrl" value="/ipo/save"></c:url>
<form:form action="${ipoUrl}" modelAttribute="ipomodel">

	<table>
	  		<c:if test="${!empty ipomodel.companyName }">
	<tr>
	<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id" readonly="true" disabled="true"/>
			<form:hidden path="id"/></td>
	</tr>
	</c:if>
		<tr>
			<td><form:label path="companyName">CompanyName</form:label></td>
			<td><form:input path="companyName"/></td>
		</tr>
		<tr>
			<td><form:label path="pricePerShare">PricePerShare</form:label></td>
			<td><form:input path="pricePerShare"/></td>
		</tr>
		<tr>
			<td><form:label path="remarks">Remarks</form:label></td>
			<td><form:input path="remarks"/></td>
		</tr>
		<tr>
			<td><form:label path="stockExchange">StockExchange</form:label></td>
			<td><form:input path="stockExchange"/></td>
		</tr>
		 	<tr>
			<td><form:label path="totalStocks">TotalStocks</form:label></td>
			<td><form:input path="totalStocks"/></td>
		</tr>
		<tr>
			<td><form:label path="openDateTime">OpenDateTime</form:label></td>
			<td><form:input path="openDateTime"/></td>
		</tr>
		
		 
		 
		<tr>
			<td></td>
			<td>
			<c:if test="${empty ipo.companyName}">
			<input type="submit" value="ADD"/>
			</c:if>
			<c:if test="${!empty ipo.companyName}">
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
<th>CompanyName</th>
<th>PricePerShare</th>
<th>Remarks</th>
<th>StockExchange</th>
<th>TotalStocks</th>
<th>OpenDateTime</th>
<th>Actions</th>


</tr>
<c:forEach var="ipo" items="${list3 }">
<tr>

<td>${ipo.id }</td>
<td>${ipo.companyName}</td>
<td>${ipo.pricePerShare }</td>
<td>${ipo.remarks }</td>
<td>${ipo.stockExchange}</td>
<td>${ipo.totalStocks }</td>
<td>${ipo.openDateTime }</td>

<td> <a href="<c:url value='/removeipo/${ipo.id }'/>" >Remove</a> |
<a href="<c:url value='/updateipo/${ipo.id }'/>">Update</a>

</tr>


</c:forEach>

</table>
</body>
</html>
