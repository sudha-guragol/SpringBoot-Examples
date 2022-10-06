<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- displaying object gives values in json format(Product(productId=101, productName=keyboard, productPrice=500.5) -->
<%-- ${product} --%>


<h2>Product Data</h2>

<!-- product.productId(internally calls getter method of getProductId() to get that value) -->
Product Id:${product.productId}<br/>
product Name:${product.productName}<br/>
product price:${product.productPrice}<br/>

<a href="/">Home</a>
</body>
</html>