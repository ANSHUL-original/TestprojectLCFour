<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result page</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<div align="center">
		<p>${ lcInfo.userName }</p>
		<p>${ usrInfo.userName }</p>
		hobby:
		<c:forEach var="temp" items="${ lcInfo.hobby }">
			${ temp }
		</c:forEach>
	</div>
	
</body>
</html>