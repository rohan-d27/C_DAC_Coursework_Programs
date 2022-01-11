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
	String msg  = request.getParameter("message");
	if(msg != null){
%>

	<font color="red"><%=msg %></font>

<%}//end of if %>


<form action="check_palindrome.jsp">
Enter the name :<input type="text" name="name"  />
<input type="submit" value="check palindrome"  />
</form>
</body>
</html>