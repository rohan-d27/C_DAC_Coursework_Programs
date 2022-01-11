<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signup page</title>
</head>
<body>
<div>
<form action="AddUserServlet" method="post">
Name:<input type="text" name="name"><br>
Job:<input type="text" name="job"><br>
Salary:<input type="number" name="salary"><br>
Username:<input type="text" name="uname"><br>
Password <input type="text" name="pass"><br>
<br>
<input type="submit" value="Submit">&nbsp
<input type="reset" value="Reset">

</form>

</div>

</body>
</html>