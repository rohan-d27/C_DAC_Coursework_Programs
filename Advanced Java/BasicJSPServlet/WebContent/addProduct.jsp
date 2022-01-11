<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="AddProductServlet" method="post">
<h3>Add Product Details: </h3>
Product id: <input type="text" name="id"/><br>
Product Name: <input type="text" name="name"/><br>
Product Description: <input type="text" name="desc"/><br>
Product unit: <input type="text" name="unit"/><br>
Product cost: <input type="text" name="cost"/><br>
Product expiry date: <input type="text" name="date"/><br>
<input type="submit" name="add"/>
</form>
</body>
</html>