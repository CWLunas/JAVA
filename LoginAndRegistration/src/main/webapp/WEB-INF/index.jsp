<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Index</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
	<h1>Registration</h1>
	
	<form:form action="registration" method="post" modelAttribute="newUser">
		<div class="form-group">
			<form:label path="userName">User Name</form:label>
			<form:errors path="userName"></form:errors>
			<form:input class="form-control" path="userName"></form:input> 
		</div>
		<div class="form-group">
			<form:label path="email">Email</form:label>
			<form:errors path="email"></form:errors>
			<form:input class="form-control" path="email"></form:input> 
		</div>
		<div class="form-group">
			<form:label path="password">Password</form:label>
			<form:errors path="password"></form:errors>
			<form:input class="password" path="password"></form:input>
		</div>	 
		<div class="form-group">
			<form:label path="confirm">Confirm Password</form:label>
			<form:errors path="confirm"></form:errors>
			<form:input type = "password" class="form-control" path="confirm"></form:input> 
		</div>
		<div class="form group"></div>
			<button>Register</button>
   </form:form>
   
</body>
</html>