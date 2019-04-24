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
<h1>Update Stock Details</h1>
<form method = "post" action="updateStock">
<table>
<tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="item_name"  /></td>  
         </tr>    
         <tr>    
          <td>Price :</td>    
          <td><form:input path="price" /></td>  
         </tr>   
         <tr>    
          <td>Manufacturer :</td>    
          <td><form:input path="manufacturer" /></td>  
         </tr>  
          <tr>    
          <td>Stock Level :</td>    
          <td><form:input path="stock_level" /></td>  
         </tr>  
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Update" /></td>    
         </tr>    
</table>

</form>

</body>
</html>