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
	<label><h2>All User Details</h2></label>
	<br>
	<br>
	<%
	List<User> s = (List<User>) request.getAttribute("list");
	%>
	<table border="1">
		<tr>
			<th>id</th>
			<th>email</th>
			<th>password</th>
			<th>username</th>
			
		</tr>

		<%
		for (User ss : s) {
		%>

		<tr>
			<td><%=ss.getId()%></td>
			<td><%=ss.getEmail()%></td>
			<td><%=ss.getPassword()%></td>
			<td><%=ss.getUsername()%></td>
			
		</tr>

		<%
		}
		%>
	</table>
	<div class="footer" align="center">By saikrishna</div>
</body>
</html>