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

	<h1>This is home page</h1>
	<h1>Home Controller</h1>
	
	<%
		String name = (String)request.getAttribute("name");
		List<String> fd = (List<String>) request.getAttribute("f");
	%>
	
	<h1>My name is <%=name%></h1>
	<%
		for(String s: fd){
	%>
	<h1><%=s%></h1>		
	<%
		}
	%>

</body>
</html>