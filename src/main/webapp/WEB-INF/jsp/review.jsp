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

<h1>Review for Item</h1>

<form:form id="reviewForm" modelAttribute="review" action="reviewPosting"
		method="post">
<table align="center" cellspacing="60">
			<tr>
				<td><form:label path="comments">Comments</form:label></td>
				<td><form:input path="comments" name="comments" id="comments"
						required="" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td><form:label path="rating">Rating</form:label></td>
				<td><form:select path="rating" name="rating"
						id="rating" required="">
						<form:option value="1"></form:option>
						<form:option value="2"></form:option>
						<form:option value="3"></form:option>
						<form:option value="4"></form:option>
						<form:option value="5"></form:option></form:select></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><form:button id="submit" name="submit">Submit</form:button>
				</td>
			</tr>
			</table>

</form:form>

<p>
<a href="view_items_cust">Return</a>
</p>

</body>
</html>