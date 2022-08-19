<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding a product</title>
</head>
<body>
<h2>Add the products </h2>
<form action="add">

<label>Description</label><br><br>
<input type="text" name="description" placeholder="Enter the product Description"><br><br>

<label>Price</label><br><br>
<input type="number" name="price" placeholder="Enter the product price"><br><br>

<label>Product</label><br><br>
<input type="text" name="product" placeholder="Enter the product name"><br><br>

<label>Quantity</label><br><br>
<input type="number" name="quantity" placeholder="Enter quantity"><br><br>

<input type="submit" value="Add">

</form>
 <div class="footer" align="center">By saikrishna</div>

</body>
</html>