<%@page import="aiwa.entity.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PC LIST</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<%
	List<Item> items = (List<Item>) request.getAttribute("items");
%>


<style>
	.img-fluid{
		width:400px;
        
		object-fit:cover;
	}

</style>

</head>
<body>

<div class="container">

	<form action="ItemListController">
	
	<input type="text" name="keyword">
	<input type="submit" value="search">
	</form>

<div class="row">
	<% for(Item i : items) { %>
		<div class="col-md-4  col-sm-6 mb-3 mt-5 text-center">
			<div class="card " >
			  <img src="<%= i.getImage() %>" class="card-img-top img-fluid text-center" alt="..." style="height:380px;">
			  <div class="card-body">
			    <h5 class="card-title text-truncate"><%= i.getItemName() %></h5>
			    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			    <p class="card-text">￥<%= i.getPrice() %></p>
			    <a href="#" class="btn btn-primary">Detail</a>
			  </div>
			</div>
		</div>
	<% } %>
	

</div>




</div>

</body>
</html>