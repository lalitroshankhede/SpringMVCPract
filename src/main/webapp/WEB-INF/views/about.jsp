<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
</head>
<body>


	<h1 class="text-center text-danger">${Header }</h1>
	<h3 class="text-center text-danger">${Desc }</h3>
	<a href="index.jsp">Go to Main Page</a>
	<br>

	<%
	String userAddress = (String) request.getAttribute("address");
	%>

	<%=userAddress%>

</body>
</html>