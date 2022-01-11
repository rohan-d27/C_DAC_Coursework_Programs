<%@page import="com.java.miniproject.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
<link rel="stylesheet" href="external.css">
</head>
<body><center>
<div>

<% User nuser=(User) session.getAttribute("user");
String uname=nuser.getFname();
%>
	<h2><center> Welcome <%=nuser.getUname() %></center></h2>
	
	<br>	</div>
	<div class="div">
	<center>
	<button onclick="window.location.href='http://localhost:8080/MiniProject/addHobby.jsp;'"> Add Hobby</button>  &nbsp
	<button onclick="window.location.href='http://localhost:8080/MiniProject/ViewHobbyServlet;'"> View Hobby</button> &nbsp
	<button onclick="window.location.href='http://localhost:8080/MiniProject/SignoutServlet;'"> Sign Out</button> <br>
	</center>
	</div>
	</center>

</body>
</html>