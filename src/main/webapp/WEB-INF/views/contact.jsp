<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

<link href="<c:url value="/resources/css/style.css" />">
<script src="<c:url value="/resources/js/script.js" />"></script>

<title>Contact Page</title>
</head>

<body>


	<h1 class="text-center text-danger">${Header }</h1>
	<h1 class="text-center text-danger">${Desc }</h1>

	<!-- This is Error Message on Just Above Form -->

	<div class="alert alert-danger" role="alert">

		<form:errors path="user.*" />


	</div>

	<img alt="my images"
		src="<c:url value="/resources/images/RequestLifecycle.png"/>">

	<form class="container" action="processform" method="post">
		<div class="form-group">
			<label for="email">Email address</label> <input type="email"
				autofocus="off" class="form-control" id="email"
				aria-describedby="emailHelp" name="email">

		</div>
		<div class="form-group">
			<label for="password">Password</label> <input type="password"
				class="form-control" id="password" name="password">
		</div>

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>


	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
		crossorigin="anonymous"></script>


</body>
</html>