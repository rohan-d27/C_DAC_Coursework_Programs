<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>insert</title>
</head>
<body>
<form action="insert" method="post">
Movie Name:<input type="text" name="name" id="name"/><br>
Movie Rating: 1 star <input type="radio" name ="rating"/> &nbsp
		2 star <input type="radio" name ="rating"/> &nbsp
		3 star <input type="radio" name ="rating"/> &nbsp
		4 star <input type="radio" name ="rating"/> &nbsp
		5 star <input type="radio" name ="rating"/> &nbsp
		<br>
Movie Category: <select name="category">
<option value="comedy"> Comedy</option>
<option value="action"> Action</option>
<option value="family"> Family</option>
<option value="adventure"> Adventure</option>
<option value="war"> War</option>
</select>
<br>
<input type="submit" value="Submit">
&nbsp
<input type="reset" value="Reset">
</form>
</body>
</html>