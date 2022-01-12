<%@page import="study.BookDoa"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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
Book List

<br>
<form action="deletefromDB" method="post">
<select name="bookname" >
<% List <BookEntity> list=(List <BookEntity>)request.getAttribute("books");
  
    for (BookEntity b : list) 
    {
	   %>
	  <option> <%=b.getBookName() %> </option> 
	   <%
	}
%>
</select>
<br>
<br>
<input type="submit" value="Submit">
</form>

</body>
</html>