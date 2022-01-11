<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Read Product</title>
</head>
<body>
<%
Connection  connect=null;            
            
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java","root","Rohan@16161035");
	System.out.println("Connection with Database Successful!!!");
} catch (ClassNotFoundException | SQLException e) {

	e.printStackTrace();
}
  String sql="SELECT * FROM PRODUCT3";
  Statement stmt=connect.createStatement();
  ResultSet rs=stmt.executeQuery(sql);
  while(rs.next())
  {
	  String id=rs.getString(1);
	  String name=rs.getString(2);
	  String desc=rs.getString(3);
	  String unit=rs.getString(4);
	  String cost=rs.getString(5);
	  String date=rs.getString(6);
	  System.out.println(id+" , "+name+" , "+desc+" , "+unit+" , "+cost+" , "+date);
	  String str=id+" , "+name+" , "+desc+" , "+unit+" , "+cost+" , "+date;
              
%>
		<h3><%=str%></h3>
	
		<% 
		}
		%>
</body>
</html>