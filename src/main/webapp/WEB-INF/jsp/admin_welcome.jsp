<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Store</title>
</head>
<body>

	<h1>Welcome Admin</h1>
	
	<tr>
		<td>${message2 }</td>
	</tr>

	<p>
		<a href="add_item" data-toggle="tooltip" title="Create Items">Create Items</a>
	</p>
	<p>
		<a href="view_items" data-toggle="tooltip" title="View Items">View Items</a>
	</p>

	<a href="/">Logout</a>

</body>
</html>