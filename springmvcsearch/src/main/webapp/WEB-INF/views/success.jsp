<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
</head>
<body>

	<h3>Name is ${student.name }</h3>
	<h3>Student Id is ${student.id }</h3>
	<h3>Student DOB is ${student.date }</h3>
	<h3>Courses is ${student.courses }</h3>
	<h3>Student gender is ${student.gender }</h3>
	<h3>Student type is ${student.type }</h3>
	<hr>
	<h3>Address Street is ${student.address.street }</h3>
	<h3>Address City is ${student.address.city }</h3>

</body>
</html>