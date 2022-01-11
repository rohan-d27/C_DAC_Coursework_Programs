<%@page import="study.dao.BookPojo"%>
<%@page import="study.dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search by Book ID</title>
</head>
<body>

<form>
Enter the book ID<input type="number" name="book_id" />
<input type="submit"  value="show book info"  />
</form>

<%
	String id = request.getParameter("book_id");
	if(id != null)
	{
		
		BookDAO dao = new BookDAO();
		BookPojo  pojo = dao.getBookInfo(Integer.parseInt(id));		
	
%>
	<%= pojo %>

<% } %>


</body>
</html>