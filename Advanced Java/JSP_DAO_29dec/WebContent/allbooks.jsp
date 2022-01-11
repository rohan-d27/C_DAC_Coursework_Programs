<%@page import="study.dao.BookPojo"%>
<%@page import="java.util.List"%>
<%@page import="study.dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Books</title>
</head>
<body>

<table border=1>
<thead>
<tr><th>book id</th><th>book cost</th><th>book name</th></tr>
</thead>
<tbody>

<%
 

BookDAO dao = new BookDAO();
List<BookPojo> list = dao.getAllBooks();
for(BookPojo bp : list){
%>

<tr><td><%=bp.getBookid()%></td><td><%=bp.getBookcost()%></td><td><%=bp.getBookname() %></td></tr>

<% }  %>

</tbody>
</table>
</body>
</html>