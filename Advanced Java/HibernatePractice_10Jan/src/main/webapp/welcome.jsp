<%@page import="study.entity.EmployeeEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body>

<% EmployeeEntity nuser=(EmployeeEntity) session.getAttribute("user");

%>
	<h2><center> Welcome <%=nuser.getUsername() %></center></h2>
	
</body>
</html>