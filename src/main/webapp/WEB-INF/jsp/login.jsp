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

<form:form id="loginForm" action="loginProcess" method="post" modelAttribute="login">
		<table align="center" cellspacing="20">
			<tr>
				<td><form:label path="username">Username:</form:label></td>
				<td><form:input path="username" name="username" id="username" />
				</td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="login" name="login">Login</form:button>
				</td>
			</tr>
		</table>
	</form:form>
	<table align="center">
                <tr>
                    <td>${message}</td>
                </tr>
            </table>
            



</body>
</html>