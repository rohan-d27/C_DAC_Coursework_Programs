<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method=post> 
	
	Book Id: <input type="number"  name="id"/>
	<br>
	Book Name:<input type="text"  name="name"/><br>
	Book Cost: <input type="number"  name="cost"/><br>
	
	<input type="submit"  value ="ok"  />

</form>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String cost = request.getParameter("cost");
	if(id!=null)
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url = "jdbc:mysql://localhost:3306/db1";
		String uname ="root";
		String pass= "Rohan@16161035";
		Connection con = DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("connection to DB is successful "+con);
		String sql = "insert into book2 values(?,?,?)"; 
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(id));
		pstmt.setString(2, name); 
		pstmt.setInt(3, Integer.parseInt(cost));
		pstmt.executeUpdate();
		%> <p>  Book inserted Successfully </p><% 
		
		 
} 
 %>

</body>
</html>