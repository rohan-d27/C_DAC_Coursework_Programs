<%@page import="java.util.*,study.entity.*" %>
We will see the books Here : -
<table border=1>
<%

List<BookEntity> list = (List<BookEntity>)request.getAttribute("books"); 

%><th>Book id</th><th>Book name</th><th>Book cost</th>

<% 
for(BookEntity be : list ){
%>

<tr><td><%=be.getBookId() %></td>
<td><%=be.getBookName() %></td>
<td><%=be.getBookCost() %></td></tr>

<% }//end of for %>
</table>