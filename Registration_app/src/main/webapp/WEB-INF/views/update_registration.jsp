<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Registration</title>
</head>
	<body>
	<h2>Update Registration</h2>
	<form action ="" method="post">
		<table>
			<tr>
				<td>Email:</td> <td><input type ="text" name="email" value ="<%=request.getAttribute("email")%>"></td>
			</tr>
			<tr>
				<td>Mobile:</td> <td><input type="text" name="mobile" value="<%=request.getAttribute("mobile")%>"></td>
			</tr>
			<tr><td><input type="submit" value="Update"></td></tr>
		</table>				
	</form>
	</body>
</html>