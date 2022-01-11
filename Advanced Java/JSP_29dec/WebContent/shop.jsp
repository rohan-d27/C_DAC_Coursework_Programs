<%@page import="java.util.ArrayList"%>
<html>
<body>

<ol>
<%
if(session.isNew())
{
	session.setAttribute("shopping_cart", new ArrayList<String>());
}
else
{
	String item = request.getParameter("item");
	ArrayList<String> al = (ArrayList)session.getAttribute("shopping_cart");
	if(al == null)
	{
		al = new ArrayList<String>();
	}
	al.add(item);
	session.setAttribute("shopping_cart", al);
	
	for(String purchased_item : al){
%>

<li><%=purchased_item%></li>

<%		
	}
}

%>

</ol>

<form >
Enter the item to purchase :<select name="item"  >
<option>ghee</option>
<option>butter</option>
<option>jacket</option>
<option>shoes</option>
<option>pen drive</option>
<option>mouse</option>
<option>sugar</option>
<option>socks</option>
<option>power bank</option>
<option>tshirt</option>
<option>tea</option>
<option>lan cable</option>
</select>
<input type="submit" value="add to cart"  />
</form>

</body>
</html>