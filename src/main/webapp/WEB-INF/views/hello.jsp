<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Page</title>
</head>
<body>



	<h1 class="text-center text-danger">${Header }</h1>
	<h3 class="text-center text-danger">${Desc }</h3>
	<a href="index.jsp">Go to Main Page</a>

	<%
	String name = (String) request.getAttribute("name");
	List<String> list = (List<String>) request.getAttribute("fruits");
	%>

	<h1>
		Hi i am
		<%=name%>
		how are you ?
	</h1>

	<%
	for (String s : list) {
	%>



	<h2><%=s%></h2>


	<%
	}
	%>


</body>
</html>