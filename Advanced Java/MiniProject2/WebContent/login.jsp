<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="external.css">
</head>
<body><center>
<div><h2><center>Login Details</center></h2></div>
<div class="div"><form action="LoginServlet" method="post">
<center>
User name: <input type="text" id="uname" name="uname"><br>
Password: <input type="password" id="pass" name="pass"><br>
<input type="submit" value="Submit">&nbsp
<input type="reset" value="Reset">
</center>
</form>
</div>

</center>

</body>
</html>