<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.error
{
color:red}
</style>
</head>
<body>
<h3>User Registration Form</h3>

<form:form action="saveUser" modelAttribute="user" method="post">
<table>

<tr>
<td> Name <td>
<td> <form:input path="uname"/> </td>
<td><form:errors path="uname" class="error"/></td>
</tr>

<tr>
<td> Password <td>
<td> <form:input path="password"/> </td>
<td><form:errors path="password" class="error"/></td>
</tr>
<tr>
<td> Email <td>
<td> <form:input path="email"/> </td>
<td><form:errors path="email" class="error"/></td>

</tr>
<tr>
<td> Phone Number <td>
<td> <form:input path="phoneNo"/> </td>
<td><form:errors path="phoneNo" class="error"/></td>
</tr>


<tr>
<td></td>
<td><input type="submit" value="Save"/></td>
</tr>


</table>






</form:form>

</body>
</html>