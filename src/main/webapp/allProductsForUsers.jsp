<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.demo.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<label><h2>product details</h2></label><br>
<h3>select the product to buy</h3><br>
<h3>click on the "buy this" for buy the product</h3><br>
<%List<Product> s=(List<Product>)request.getAttribute("list") ;%>
<table border="1">
<tr><th>id</th><th>product</th><th>price</th><th>description</th><th>quantity</th><th>option</th></tr>

<%for(Product ss:s){ %>

<tr ><td><%=ss.getId() %></td><td><%=ss.getProduct() %></td><td><%=ss.getPrice() %></td><td><%=ss.getDescription() %></td><td><%=ss.getQuantity() %></td><td>buy this</td></tr>

<%} %>
</table> 
 <div class="footer" align="center">By saikrishna</div>

</body>
</html>