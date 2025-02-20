<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%--
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" 
--%>     


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>This is Help Page</title>
</head>
<body>

    <%-- Retrieving attributes from request scope --%>
    <% 
   	 	/*
        String sname = (String) request.getAttribute("name");
        LocalDateTime t = (LocalDateTime) request.getAttribute("time");
        */
    %>

    <h1> My Name is: ${name}</h1>
    
    <br>
    
    <h1> Current Date and Time: ${time}</h1>

    <br>

    <%-- Displaying another attribute --%>
    
    <c:forEach var="item" items="${mkr }">
    	<h2> Additional Data: ${item}</h2>
    </c:forEach>
    

</body>
</html>





