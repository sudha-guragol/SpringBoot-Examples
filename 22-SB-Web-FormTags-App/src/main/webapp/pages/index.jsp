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
<div align="center" >
<h3>Product Form with form tags</h3>

<!-- modelAttribute is used to bind the form data to object and object to form data(two way data binding) -->
<form:form action="saveProduct" modelAttribute="key" method="post">

  <form:label path="productId">Product Id</form:label>
  <form:input path="productId" /><br/><br/>

  <form:label path="productName">Product Name</form:label>
  <form:input path="productName"/> <br/><br/>

  <form:label path="productPrice">Product Price</form:label>
  <form:input path="productPrice"/> <br/><br/>
  
  <form:button>Save</form:button>


</form:form>
</div>
</body>
</html>