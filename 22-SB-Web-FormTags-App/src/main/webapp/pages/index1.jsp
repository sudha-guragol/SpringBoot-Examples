<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Product Form</h3>
</body>
<!-- modelAttribute is used to bind the form data to object and object to form data(two way data binding) -->
<form:form action="saveProduct" modelAttribute="key" method="post">
<table>
<tr>
<td>Product ID</td>
<td><form:input path="productId" /></td>

</tr>

<tr>
<td>Product Name</td>
<td><form:input path="productName"/> </td>
</tr>

<tr>
<td>Product Price</td>
<td><form:input path="productPrice"/> </td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Save"/>  </td>
</tr>
</table>
</form:form>
</html>