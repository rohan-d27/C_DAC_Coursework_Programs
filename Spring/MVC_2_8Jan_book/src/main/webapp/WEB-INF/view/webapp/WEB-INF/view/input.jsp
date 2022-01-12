<html>
<body>
<%
	String msg = (String)request.getAttribute("errorMsg");
	if(msg!=null) { 
%>
<font color="red"> <%=msg%>  </font>
<br><br>
<%  }%>

<form action="verify2"  method = "post">
   Enter name :<input type="text" name="uname"  />
   Enter password : <input type="text" name="pass"  />
   <input type="submit" value="login"  />
</form>
</body>


</html>