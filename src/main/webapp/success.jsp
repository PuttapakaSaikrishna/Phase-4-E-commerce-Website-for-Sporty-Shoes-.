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
<h1>Welcome Admin </h1><br>
<form action="getall">
<input type="submit" value="See All The Products">
</form><br>
<a href="add.jsp"><button >Add The Product</button></a><br><br>
<a href="update.jsp"><button >Update The Product</button></a><br><br>
<a href="delete.jsp"><button >Delete The Product</button></a><br><br>

<form action="all">
<input type="submit" value="See All Users">
<br><br>

</form>
<div class="footer" align="center">By saikrishna</div>

</body>
</html>