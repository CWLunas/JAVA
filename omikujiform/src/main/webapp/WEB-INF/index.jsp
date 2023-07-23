<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>  
    
<!DOCTYPE html>
<html>
<head>
    <title>Omikuji Form</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    <h1>Omikuji Form</h1>
    <form action="/omikuji" method="post">
        <div>
        	Select a number from 1 to 25: 
        	<input type="number" name="selectedNumber" min="1" max="25"><br>
        </div>
        <div>
        	Enter the name of any city: 
        	<input type="text" name="city"><br>
        </div>
        <div>
        	Enter the name of any real person: 
        	<input type="text" name="person"><br>
        </div>
        <div>
        	Enter professional endeavor or hobby: 
        	<input type="text" name="endeavor"><br>
        </div>
        <div>
        	Enter any type of living creature: 
        	<input type="text" name="creature"><br>
        </div>
        <div>
        	Say something nice to someone: 
        	<input type="text" name="niceMessage"><br>
        </div>
        <div>
        	Send and Show a Friend
        	<input type="submit" value="Send">
        </div>
    </form>
</body>
</html>
