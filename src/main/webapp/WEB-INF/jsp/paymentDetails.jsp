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

<form:form id="paymentForm" modelAttribute="card" action="cardProcess"
		method="post">
		<table align="center" cellspacing="60">
			<tr>
				<td><form:label path="cardType">Card Type</form:label></td>
				<td><form:select path="cardType" name="cardType" id="cardType">
				<form:option value="MasterCard"></form:option>
				<form:option value="Visa"></form:option>
				</form:select></td>
			</tr>
			<tr></tr>
			<tr>
				<td><form:label path="cardNumber">Card Number</form:label></td>
				<td><form:password path="cardNumber" name="cardNumber"
						id="cardNumber" required="" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td><form:label path="expiryDate">Expiry Date</form:label></td>
				<td><form:input path="expiryDate" name="expiryDate"
						id="expiryDate" required="" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><form:button id="register" name="register">Register</form:button>
				</td>
			</tr>
			</table>
			</form:form>

</body>
</html>