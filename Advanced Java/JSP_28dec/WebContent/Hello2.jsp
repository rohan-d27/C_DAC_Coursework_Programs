<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method=post> 
	
	How many times hello to be printed: <input type="number"  name="num"/>
	<input type="submit"  value ="ok"  />

</form>
<%
	String v = request.getParameter("num");
	if(v!=null)
	{
		int x = Integer.parseInt(v);
 		for(int i=0;i<x;i++) 
 		{
 		%> <p> <%=i %> Hello </p><% 
 	}
	} 
  %>



</body>
</html>