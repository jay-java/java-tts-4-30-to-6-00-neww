<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Id : ${id }</h2>
	<h2>Name: ${name }</h2>
	<h2>List : ${list }</h2>
	
	<c:forEach items="${list }" var="s">
		<h3>${s }</h3>
	</c:forEach>
	
</body>
</html>