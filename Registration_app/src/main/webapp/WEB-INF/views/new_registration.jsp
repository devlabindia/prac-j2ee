<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
	<body>
	<h2>Create New Registration</h2>
	<form action ="RegistrationController" method="post">
		<table>
			<tr>
				<td>Name:</td> <td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Course:</td> <td><input type ="text" name="course"></td>
			</tr>
			<tr>
				<td>Email:</td> <td><input type ="text" name="email"></td>
			</tr>
			<tr>
				<td>Mobile:</td> <td><input type="text" name="mobile"></td>
			</tr>
			<tr><td><input type="submit" value="Save"></td></tr>
		</table>				
	</form>
	
	<%
		if(request.getAttribute("saveMsg")!=null){
			out.println(request.getAttribute("saveMsg"));
		}
	%>
	
	</body>
</html>