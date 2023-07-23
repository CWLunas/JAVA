<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
    <title>Omikuji Fortune</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    <h1>Omikuji Fortune</h1>
    <p>
        In ${selectedNumber} years, you will live in ${city} with ${person} as your room mate,
        working as a/an ${endeavor} for a living. The next time you see a ${creature}, you will have great luck.
        ${niceMessage}.
    </p>
    <div class="center"><a href="/omikuji">Go Back to Omikuji Form</a></div>
</body>
</html>