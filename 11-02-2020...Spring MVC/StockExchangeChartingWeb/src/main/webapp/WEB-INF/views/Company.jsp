<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>
<hr>
${message }

<table border="1">
<tr>
<th>ID</th>
<th>BoardOfDirectories</th>
<th>CEOName</th>
<th>CompanyName</th>
<th>Sector</th>
<th>TurnOver</th>


</tr>
<c:forEach var="user1" items="${list1 }">
<tr>

<td>${user1.id }</td>
<td>${user1.bod}</td>
<td>${user1.ceo }</td>
<td>${user1.companyname }</td>
<td>${user1.sector}</td>
<td>${user1.turnover }</td>


</tr>


</c:forEach>

</table>
</body>
</html>
