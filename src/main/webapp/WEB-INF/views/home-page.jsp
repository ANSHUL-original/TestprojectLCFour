<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
	<link rel="stylesheet" href="resources/css/style.css" >
	<script type="text/javascript" src="resources/js/test.js"></script>
</head>
<body>
	<%@ include file="header.jsp"%>
	<form:form action="login-form" modelAttribute="usrInfo">
		<div align="center">
			<p>
				<label for="un">User Name :</label>
				<form:input id="un" type="text" name="userName" path="userName"
					placeholder="${ usrInfo.userName }" />
				<form:errors path="userName" cssClass="error" />
			</p>
			<p>
				<label for="cn">Crush Name :</label>
				<form:input id="cn" path="crushName" />
				<form:errors path="crushName" cssClass="error" />
				<br>
			</p>
			<p>
				<form:checkbox path="termAndCondition" value="true" id="check" />
				<label for="check"> I UnderStand Terms And Condition</label>
				<form:errors path="termAndCondition" cssClass="error" />
				<br>
			</p>
			<input type="submit" name="submit" value="login" /> <a
				href="register">Sign Up</a>
		</div>
	</form:form>
</body>
</html>