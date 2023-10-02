<%@page import="java.util.List"%>
<%@page import="aiwa.entity.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%

List<Product> products = (List<Product>) request.getAttribute("products");

%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 style="text-align : center;">Product List</h1>
	<table border="1" cellspacing="0" cellpadding="30" align="center">
	<tr>
		<td>Product ID</td>
		<td>Product Name</td>
		<td>Price</td>
	</tr>
	<%
		for(Product p : products) { %>
			<tr>
				<td><%= p.getProductId() %></td>
				<td><%= p.getProductName() %></td>
				<td><%= p.getPrice() %></td>
			</tr>
			
		
	<% } %>
	
	</table>

</body>
</html>