<%@page import="java.util.List"%>
<%@page import="aiwa.entity.Item"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PC Shop</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<%
	List<Item> items = (List<Item>) request.getAttribute("items");
%>



</head>
<body>

<div class="container">

<div>
<img src="images/logo2.png" height="50px" class="text-center">
</div>
<h1 class="display-3 text-center text-info" align="center" >PC SHOP</h1>

<table class="table table-hover" >

	<tr style="background-color: aqua">
		<td>ID</td>
		<td>名前</td>
		<td>価格</td>
		<td>写真</td>
	</tr>
	<% for(Item i : items) { %>
	<tr style="background-color: violet">
		<td><%= i.getItemId() %></td>
		<td><%= i.getItemName() %></td>
		<td>\ <%= i.getPrice() %></td>
		<td><img width="300px;" height="300px;" alt="" src="<%= i.getImage() %>"> </td>
	</tr>
	
	<% } %>

</table>

</div>
</body>
</html>