<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Store</title>
</head>
<body>

<form:form id="regForm" modelAttribute="customers" action="registerProcess"
		method="post">
		<table align="center" cellspacing="60">
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" name="username" id="username"
						required="" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" name="password"
						id="password" required="" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td><form:label path="firstname">First Name</form:label></td>
				<td><form:input path="firstname" name="firstname"
						id="firstname" required="" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td><form:label path="lastname">Last Name</form:label></td>
				<td><form:input path="lastname" name="lastname" id="lastname"
						required="" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" name="email" id="email"
						required="" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td><form:label path="billAddress">Billing Address</form:label></td>
				<td><form:input path="billAddress" name="billAddress" id="billAddress"
						required="" /></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button id="register" name="register">Register</form:button>
				</td>
			</tr>
			<tr>

			</tr>
			<tr></tr>
			<tr>
				<td style="font-style: italic; color: red;">${message}</td>
			</tr>

		</table>
	</form:form>

</body>
</html>