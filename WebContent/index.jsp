<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate Random Numbers</title>
</head>
<body>
	<h1>Generate Random Numbers</h1>
	<form action="randomServlet" method="post">
	How many random numbers do you need (1-10): <input type="number" name="inputNum" size="2">
	<input type="submit" value="Call Servlet" />
	</form>
</body>
</html>