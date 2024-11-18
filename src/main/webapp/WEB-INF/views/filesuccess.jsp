<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Status</title>
</head>
<body>

	<h1>${msg}</h1>
	<img alt="profile_img" width="100%"
		src="<c:url value="/resources/images/${filename }" /> " />


</body>
</html>