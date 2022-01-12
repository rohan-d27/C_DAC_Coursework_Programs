<%@page import="java.util.*,study.entity.*" %>

<html>
<title>view book</title>
<body>
<div>
<% 
List<BookEntity> list = (List<BookEntity>)request.getAttribute("books"); 
BookEntity b=new BookEntity();
%>Book list to get details<br>
<form action="showFromDB" method="post">
<select name="bookname">


<% 
for(BookEntity be : list ){
%>


<option><%=be.getBookName() %></option>


<% }//end of for %>
</select>
<br>
<input type="submit" value="Submit">
</form>
</div>
<div>

<br>
Books for delete
<form action="deletefromDB" method="post">
<select name="bookname" >
<% List <BookEntity> list1=(List <BookEntity>)request.getAttribute("books");
  
    for (BookEntity b1 : list1) 
    {
	   %>
	  <option> <%=b1.getBookName() %> </option> 
	   <%
	}
%>
</select>
<br>
<br>
<input type="submit" value="Submit">
</form>


</div>
</body>
</html>