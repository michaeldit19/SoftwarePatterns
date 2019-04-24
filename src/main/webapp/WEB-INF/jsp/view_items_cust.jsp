<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Store</title>
</head>
<body>

	<h1>Catalogue</h1>

	<tr>
		<td>${message4 }</td>
	</tr>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Manufacturer</th>
			<th></th>
		</tr>
		<%
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/onlineStore?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
				String username = "root";
				String password = "root";
				String query = "select * from item";
				Connection conn = DriverManager.getConnection(url, username, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("id")%></td>
			<td><%=rs.getString("item_name")%></td>
			<td><%=rs.getInt("price")%></td>
			<td><%=rs.getString("manufacturer")%></td>
			<td><a href="/rs.getInt(id)">Add to cart</a></td>
			<td><a href="review" tooltip="Review Item">Review This Item</a></td>
		</tr>
		<%
			}
		%>
	</table>

	<%
		rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>

	<p>
		<a href="welcome">Return Home</a>
	</p>


</body>
</html>