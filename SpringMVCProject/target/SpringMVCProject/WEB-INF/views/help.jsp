<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Help Page</title>
</head>
<body>

 <%
 	/*String name = (String)request.getAttribute("name");
 	LocalDateTime dateTime = (LocalDateTime)request.getAttribute("time");*/
 %>
 
 <h1>My name is
 	<%--<%=name%> --%>	
 	${name}
 </h1>
 <br>
 <h2>${time }</h2>
 <br>
 
	<c:forEach var="item" items="${mk }">
	<h1>${item }</h1>
	</c:forEach>
 
 <%--
 <h2>Current Time is <%=dateTime.toString()%></h2>
  --%>

</body>
</html>