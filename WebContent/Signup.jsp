<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ecom : signup</title>
</head>
<body>

	<h2>Signup</h2>
	<form action="SignupServlet" method="post">
		FirstName: <input type="text" name="firstName" /><br> <br>
		Email: <input type="text" name="email" /><br> <br>
		Password: <input type="text" name="password" /><br> <br>
		Gender: Male<input type="radio" name="gender" value="male">
		Female<input type="radio" name="gender" value="female"> <br>
		<br> <input type="submit" value="Register">

	</form>
</body>
</html>