<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sing-Up</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<form:form action="register-form" method="post" modelAttribute="lcInfo">
		<div align="center">
			<p>
				<label for="n">Name :</label>
				<form:input id="n" name="name" path="" placeholder="${ lcInfo.name }"/><br>
			</p>
			<p>
				<label for="un">User Name :</label>
				<form:input id="un" name="userName" path="" placeholder="${ lcInfo.userName }"/><br>
			</p>
			<p>
				<label for="p">Password :</label>
				<form:input id="p" type="password" path="password" placeholder="${ lcInfo.password }"/><br>
			</p>
			<p>
				<label for="cp">Confirm Password :</label>
				<form:input id="p" type="password" name="cnf_password" path="" placeholder="${ lcInfo.password }"/><br>
			</p>
			<p>
				<label for="c">Country :</label>
				<form:select path="country" id="c">
					<option value="india">India</option>
					<option value="shrilanka">Shri Lanka</option>
					<option value="usa">USA</option>
					<option value="switzerland">Switzerland</option>
					<option value="london">London</option>
					<option value="paris">Paris</option>
				</form:select><br>
			</p>
			<p>
				<label for="h">Hobby :</label>
				<label for="hf">football</label>
					<form:checkbox id="hf" path="hobby" value="football"/>	
				<label for="hc">coding</label>
					<form:checkbox id="hc" path="hobby" value="coding"/>	
			</p>
			<p>
				<label>Gender :</label>
					<label for="gm">Male :</label>
						<form:radiobutton id="gm" path="gender" value="male"/>
					<label for="gf">female :</label>
						<form:radiobutton id="gf" path="gender" value="female"/>
				<br>
			</p>
			<input type="submit" name="submit" value="submit"/>
		</div>
	</form:form>
</body>
</html>