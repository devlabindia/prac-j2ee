<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
	<body>
		<h2>Login here...</h2>
		<form action="LoginController" Method="post">
		Username:<input type="text" name="email">
		Password:<input type="password" name="password">
		<input type="submit" value="Login">
		</form>	
		<%
		if(request.getAttribute("errorMsg")!=null){
			out.println(request.getAttribute("errorMsg"));
		}
		%>
	</body>
</html>