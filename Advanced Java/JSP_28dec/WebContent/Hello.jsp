<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String v = request.getParameter("num");
	if(v!=null)
	{
		int x = Integer.parseInt(v);
 		for(int i=0;i<x;i++) {%> 
  		<p> <%=i %> Hello </p>
 <% }//end of for
	} //end of if
  %>
</body>
</html>