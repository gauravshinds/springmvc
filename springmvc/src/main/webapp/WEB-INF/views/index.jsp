<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Home Page Design</h1>
	
	<%
		String s = (String) request.getAttribute("name");
		List<String> allNames = (List<String>) request.getAttribute("list");
	%>
	
	<h1> My Name is <%=s %></h1>
	
	<%
		for(String str : allNames){
	%>	
	
		<h1><%=str%></h1>	
		
	<% 	
		}
	%>

</body>
</html>