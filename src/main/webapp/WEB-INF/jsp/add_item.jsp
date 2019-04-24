<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Store</title>
</head>
<body>

<form:form id="itemForm" modelAttribute="item" action="postingProcess" method="post">

		<table align="center" cellspacing="60">
		
			<tr>
				<td><form:label path="itemName">Item Name</form:label></td>
				<td><form:input path="itemName" name="itemName"
						id="itemName" required="" /></td>
			</tr>
			<tr>
				<td><form:label path="price">Price</form:label></td>
				<td><form:input path="price" name="price"
						id="price" required="" /></td>
			</tr>
			<tr>
				<td><form:label path="manufacturer">Manufacturer</form:label></td>
				<td><form:input path="manufacturer" name="manufacturer"
						id="manufacturer" required="" /></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button id="createItem" name="createItem">Post Item</form:button>
				</td>
			</tr>
		</table>


	</form:form>

</body>
</html>