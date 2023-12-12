<%@page import="aiwa.entity.Item"%>
<%@page import="java.util.List"%>
<%@page import="aiwa.entity.Category"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <title>MultiShop - Online Shop Website Template</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">
    
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"> 
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" ></script>

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">  

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/style.css" rel="stylesheet">

<%

String word = (String) request.getAttribute("word");
List<Item> items = (List<Item>) request.getAttribute("items");

List<Item> featured = (List<Item>) request.getAttribute("featured");
List<Item> recent = (List<Item>) request.getAttribute("recent");
List<Category> categories = (List<Category>) request.getAttribute("category");

String username = (String) session.getAttribute("username");


%>
</head>
<body>

<jsp:include page="TopBar.jsp"></jsp:include>

<jsp:include page="Navbar.jsp"></jsp:include>

<form action="ItemInsertController" method="post">

	<input type="text" name="itemname" placeholder="product name"><br>
	<input type="number" name="price" placeholder="price"><br>
	<textarea name="detail" placeholder="detail"></textarea><br>
	<input type="number" max="5" min="0" step="0.1" name="rating" placeholder="rating"> <br>
	<input type="text" name="image1" placeholder="image1"> <br>
	<input type="text" name="image2" placeholder="image2"> <br>
	<input type="text" name="image3" placeholder="image3"> <br>
	<input type="text" name="image4" placeholder="image4"> <br>
	<select name="categoryid">
	
		<option></option>
		<% for (Category c : categories) { %>
		<option value="<%= c.getCategoryId() %>">
			<%= c.getCategoryName() %>
		</option>
		<% } %>
	</select>

	<input type="submit" value="request">
</form>

</body>
</html>