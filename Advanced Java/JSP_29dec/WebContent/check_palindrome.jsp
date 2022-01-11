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
	String sn = request.getParameter("name");

	StringBuffer sb = new StringBuffer(sn);
	sb.reverse();
	if(sn.equals(sb.toString()))
	{
%>
	<jsp:forward page="welcome.jsp" />
<% }//end of if
	else{
%>
	<jsp:forward page="one.jsp">
	<jsp:param value="Not a palindrome , Try again" name="message"/>
	</jsp:forward>

<% }//end of else %>
</body>
</html>

