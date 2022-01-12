<%@page import="study.entity.BookEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
List<BookEntity> list=(List<BookEntity>)request.getAttribute("books");
 for(BookEntity b:list)
 {	 
 %>
 <%=b %>
<%} %>

</body>
</html>