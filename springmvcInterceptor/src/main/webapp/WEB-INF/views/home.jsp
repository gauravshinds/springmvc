<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
<style>
	
	.container{
		font-size: 30px;
		text-align: center;
		padding-top:30px;
	}
	
	input,button{
	font-size:30px;
	 
	}
</style>
</head>
<body>


	<div class="container">

		<form action="welcome">

			<input type="text" name="user" placeholder="Enter your name here" />

			<button type="submit">Say Hello !</button>

		</form>

	</div>


</body>
</html>