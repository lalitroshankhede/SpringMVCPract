<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>

	<h1 class="text-center text-danger">${Header }</h1>
	<h3 class="text-center text-danger">${Desc }</h3>

	<h4 class="text-warning">I Wanna Help.</h4>

	<%
	String name = (String) request.getAttribute("name");
	%>

	<h1>
		Mr.<%=name%></h1>

</body>
</html>