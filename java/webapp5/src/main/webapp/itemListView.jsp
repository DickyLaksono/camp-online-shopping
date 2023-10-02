<%@page import="java.util.List"%>
<%@page import="aiwa.entity.Item"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PC Shop</title>

<%
	List<Item> items = (List<Item>) request.getAttribute("items");
%>

<link rel="stylesheet" href="css/style.css">

</head>
<body>

<img src="images/logo2.png"><h1 align="center" style="background-color:navy; ">パソコン</h1>

<table border="3" cellpadding="30" cellspacing="0" align="center" >

	<tr style="background-color: aqua">
		<td>ID</td>
		<td>NAME</td>
		<td>PRICE</td>
		<td>IMAGE</td>
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

</body>
</html>