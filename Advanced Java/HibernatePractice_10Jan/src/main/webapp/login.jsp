<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
<div>
<form action="LoginServlet" method="post">
Username <input type="text" name="uname"><br>
Password <input type="password" name="pass"><br>
<br>
<input type="submit" value="Login">&nbsp
<input type="reset" value="Reset">
</form>

</div>
</body>
</html>