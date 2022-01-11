<%@page import="com.java.miniproject.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="external.css">
<title>Add Hobby</title>
</head>
<body>
<center>
<div><h2><center>Add Hobby</center></h2></div>
<div class="div">
<form action="AddHobbyServlet">
<% 
User nuser=(User) session.getAttribute("user");

%>
Hobby Name: <input type="text" id="hobby1" name="hobby1"> <br>
 <input type="text" id="hobby2" name="hobby2">  <br>
  <input type="text" id="hobby3" name="hobby3"> <br>
   <input type="text" id="hobby4" name="hobby4">  <br>
	<input type="submit" value="Submit"/>
	</form>
</div>
	</center>
</body>
</html>