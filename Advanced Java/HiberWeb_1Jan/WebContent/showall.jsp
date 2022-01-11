<%@page import="study.HibernateDAO"%>
<%@page import="study.entity.ProductEntity"%>
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
<table>

<tr>
<th>Product id </th>
<th>Product Name </th>
<th>Product  Desc</th>
<th>Product unit </th>
<th>Product cost </th>
<th>Product expity date </th>
</tr>
<%
HibernateDAO obj=new HibernateDAO();
List<ProductEntity> list= obj.allProducts();
for(ProductEntity p: list)
{
%>
	 <tr>
	 <td><%= p.getProduct_id() %></td>
 	 <td><%= p.getProduct_name() %></td>
 	  <td><%= p.getProduct_desc() %></td>
 	   <td><%= p.getProduct_unit()%></td>
 	    <td><%= p.getProduct_cost() %></td>
 	    <td><%= p.getProduct_expiryDate() %></td>
 	    </tr>
<%} %>	

</table> 
</body>
</html>