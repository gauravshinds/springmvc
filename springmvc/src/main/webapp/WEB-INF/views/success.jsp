<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h>${Header }</h>
<p> ${Dese }</p>
<hr>
	<%--
	<h3>your email Address ${us.email }</h3>
	<h3>your Username ${us.userName }</h3>
	<h3>your Password ${us.userPassword }</h3>
	--%>
	 
	<h3>your email Address ${user.email }</h3>
	<h3>your Username ${user.userName }</h3>
	<h3>your Password ${user.userPassword }</h3>
	
</body>
</html>