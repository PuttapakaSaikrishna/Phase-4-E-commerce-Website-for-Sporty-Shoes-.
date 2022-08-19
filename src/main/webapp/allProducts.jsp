<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.demo.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<label><h2>All Product Details</h2></label>
	<br>
	<br>
	<%
	List<Product> s = (List<Product>) request.getAttribute("list");
	%>
	<table border="1">
		<tr>
		    <th>number</th> 
			<th>product</th>
			<th>price</th>
			<th>description</th>
			<th>quantity</th>
		</tr>

		<%
		for (Product ss : s) {
		%>

		<tr>
			 <td><%=ss.getId()%></td> 
			<td><%=ss.getProduct()%></td>
			<td><%=ss.getPrice()%></td>
			<td><%=ss.getDescription()%></td>
			<td><%=ss.getQuantity()%></td>
		</tr>

		<%
		}
		%>
	</table>
	<div class="footer" align="center">By saikrishna</div>

</body>
</html>