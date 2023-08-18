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
    <title>Login</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <div class="container">
   		<c:out value="${loginError}"/>
   	<h1>Login</h1>
   	<form:form action="/login" method="post" modelAttribute="loginUser">
   		<form:errors path="*"></form:errors>
   		<div class="form-group">
   			<form:label path="email">Email</form:label>
   			<form:input class="form-control" path="email"/>
   		</div>
   		<div class="form-group">
   			<form:label path="password">Password</form:label>
   			<form:input class="form-control" path="password" type="password"/>
   		</div>
   		<div class="form-group">
   			<button class="btn btn-warning">Login</button>
   		</div>
   	</form:form>
   
   </div>
</body>
</html>