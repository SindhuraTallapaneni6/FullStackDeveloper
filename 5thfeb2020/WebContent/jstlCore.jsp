<%@ include file="Header.jsp" %>
<c:out value="hello world" />
<br/>
<c:set var="name" value="Aneena"/>
<c:out value="${name}"/></br>


<%-- Loop:<br/>
<c:forEach var="i" begin="1" end="10" step="1">
<h2>${i}</h2>
</c:forEach> --%>

<%-- Loop with Array:<br/>
<c:forEach var="i" items="1,3,4,56,78,11,23,43,6,23">
<c:if test="${i%2 == 0 }">
  <p>The number: <c:out value="${i}"/> is even<p>  
</c:if>
<h2>${i}</h2>
</c:forEach>
<c:import var="data" url="http://www.javatpoint.com"/>  
<c:out value="${data}"/>  
 --%>
 
 <c:catch var ="catchtheException">  
   <% int x = 2/0;%>  
</c:catch>  
  
<c:if test = "${catchtheException != null}">  
   <p>The type of exception is : ${catchtheException} <br />  
   There is an exception: ${catchtheException.message}</p> 
   
    
   <c:set var="income" scope="session" value="${4000*4}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  
</c:if>  
</body>
</html>