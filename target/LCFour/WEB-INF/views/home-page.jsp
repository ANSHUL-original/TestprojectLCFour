<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
<style type="text/css">

.error{
	color: red;
	text-align: left;
	margin-left: 30px;
	position: fixed;
}


</style>
<script type="text/javascript">
	
function validate(){
	var temp=document.getElementById("un").value;
	if(temp.length < 3){
		alert("username ican tbe less than 2 ch");
		return false;
	}
	else
		return true;
}
	
	
</script>
</head>
<body>
	<%@ include file="header.jsp"%>
	<form:form action="login-form" modelAttribute="usrInfo" onsubmit="return validate()">
		<div align="center">
			<p>
				<label for="un">User Name :</label>
				<form:input id="un" type="text" name="userName" path="" placeholder="${ usrInfo.userName }"/>
				<form:errors path="userName" cssClass="error"/>
			</p>
			<p>
				<label for="cn">Crush Name :</label>
				<form:input id="cn" path="crushName" />
				<br>
			</p>
			<p>
				<form:checkbox path="termAndCondition" value="true"/>
				<br>
			</p>
			<input type="submit" name="submit" value="login" /> 
			<a href="register">Sign Up</a>
		</div>
	</form:form>
</body>
</html>