<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Store</title>
</head>
<body>

	<h1>Welcome ${sessionScope.customers.firstname}</h1>

	<p>
		<a href="view_items_cust" data-toggle="tooltip" title="View Items">View
			Items</a>
	</p>

	<a href="/">Logout</a>

</body>
</html>