<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ecom : Login</title>
</head>
<body>
	<h2>Login</h2>

	<form action="LoginServlet" method="post">

		Email: <input type="text" name="email" /><br> <br>
		Password: <input type="text" name="password" /><br> <br> <br>
		<input type="submit" value="Login">

	</form>
	<br>
	${error}
</body>
</html>