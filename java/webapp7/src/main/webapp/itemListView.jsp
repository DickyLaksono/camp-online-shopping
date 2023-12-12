<%@page import="aiwa.entity.Category"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="aiwa.entity.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>



<%
	List<Item> items = (List<Item>) request.getAttribute("items");
String word = (String) request.getAttribute("word");
List<Category> categories = (List<Category>) request.getAttribute("categories");
List<Item> categotyid = (List<Item>) request.getAttribute("categoryid");

String min = (String) request.getParameter("min");
String max = (String) request.getParameter("max");


%>

<style>

*{
margin : 0;
padding : 0;
}

.card-img-top{
	
	height : 250px;
}
	
.container{
	width: 1000px;
}


.card-img-top:hover{
	opacity: 0.8;
	cursor: pointer;
}


th, td{
		color: white;

</style>

</head>
<body class="bg bg-light">

<nav class="navbar navbar-expand-lg bg-body-tertiary fixed-top bg-dark border-bottom " data-bs-theme="dark" >
  <div class="container-fluid mx-5">
    <a class="navbar-brand" href="#">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Rangking</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Time Sale</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Help
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">About</a></li>
            <li><a class="dropdown-item" href="#">Support</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Report</a></li>
          </ul>
        </li>
      </ul>
      <form action="ItemListController"class="d-flex " role="search">
      
      	<select name="categoryid" class="me-2">
      		<option value="">ALL</option>
      		<% for(Category c : categories) { %>
	      		<option value="<%= c.getCategoryid() %>" ><%= c.getCategoryname() %></option>
	      	<% }  %>
      		
      		
      		
      	</select>
      	
      	<input class="form-control me-2" type="number" name="min" value="<%= min %>" placeholder="最小価格" >
      	<input class="form-control me-2" type="number" name="max" value="<%= max %>" placeholder="最大価格" >
      
        <input class="form-control me-2" type="text" placeholder="Search" aria-label="Search" name="keyword" value="<%=word %>">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<div id="carouselExampleIndicators" class="carousel slide  border border-4">
  <div class="carousel-indicators ">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner border-warning" style="height:500px;">
    <div class="carousel-item active">
      <img style="height:500px;" src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG6CX7bFaQ6O-4GUHsIE4EGyLrm0pCYhOwKlD-4umDePnFL1-P_261IeiNxawUl745tZqaGhqPNrnEUn8y2pZACpWRlOlQktdyNuDdvbQw1dl7M8wm2RDU82vmIFN1Pv4RSIgs11V4JDf6xUdnzq-GHxRYOtm0LyLgmrUzOlZS6Uw1f2n0AtrSYrLgXzqA0S2rN8W7ZEoyIScv2bFk8JHVG0m0-448SPD-fSXQneavuE3hCMMART10XB2GlT736NDkA==/cae72ce86998abcadd5051acd91a696b.jpg?errorImage=false" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img style="height:500px;" src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG-0i_-hTG4sO45xdBg19uE6Zxa3ZmkDz8b3U-rpdEi7K5tZAVXybotdEo1PBOtc-rz7EGhF7u8XJ-WwBdM-vMxpzqVxNWQvrgptvSK62rcOffHG3iZJ7MLyU02fntgeQvUii6yHg_63pJMIcO5Iv4zdxLTf6YRubmNRLzDBKJM0P4-fm2ZgLWmG1csUxg4fVwA5WjwbQlCBnNJ6PhjeVB5JlIXM9PzpD1aIA6HaQYGlR9_Dj7h7HKnFGJRSlwiCPHjseB8X7z-xplNmb01cwv0jnVQZKbS4n5YZTAGPcg1ESxeVaO0yo4ROIuG9QNRAgpf6K8vEprYe3OC_t8AqvjClChHWoeprqg2tQCGnCviJK-PwfXr1pwBXHXTHvDmKkWZn6tYOjSO4LVPPjOBuJYX5Cs_YGk3BFXiUZjEevCSrc1-nME4620xyeOllKTVNrkUS_Xz3gM83hMX98BAjYn0BN9YdFdfFDH5RqeoJkobG-b2EhJrDNpkz9bl8GnFe5zoQjDAEU9dFwdhpU-9-jQ5A=/94818575-super-sale-banner-with-set-of-realistic-devices-smartphone-tablet-laptop-and-computer-on-the-colour.jpg?errorImage=false" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img style="height:500px;" src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG0AvTepwES4D5U8Zn2IyiX374HHXN3b5RkpapPx0-lvDorhf6Bf74Fhxh8WhZfSDswXyGBT_p39bdgBYqHTsnWoOx5axGOJVDjSCJC5O04o3-_jd3GsVC1NghlVYhbdTlF8VVDXpMK8FAYR2NNcd9T3wzhvNzr7AfdTJDweE2c9sUcva9yvf-O09pIN7Zq5qZGOya1mHVOYsCfGcE5n5S9ynvmgBSyah4fro5bIzshFHGCQaRN4kfVlIZzFYDcRPYtBZKvZ7_Hd8FDj3wtPerwayI2MlQ3_R_EHyZnN5fUnD/Asus20Baneer20ROG-1920x608.jpg?errorImage=false" class="d-block w-100" alt="...">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

<div class="container bg bg-secondary-subtle border border-primary">

	<div class="row">
	<div class="display-3 d-flex justify-content-center text-decoration-underline mt-2"><strong>Product List</strong></div>
		



		<% for(Item i : items) { %>
		<div class="col col-md-4 col-ms-4 mt-5 text-center">
			
				<div class="card d-flex justify-content-center mt-1 me-5 ms-1 border-primary text-bg-dark" style="width: 18rem;" >
				  <img height=auto; src="<%= i.getImage() %>" class="card-img-top  d-flex justify-content-center"  alt="...">
				  <div class="card-body">
				    <h5 class="card-title text-truncate"><%= i.getItemname() %></h5>
				    <p class="card-text text-truncate"><%= i.getDetail() %></p>
				    <p>￥ <%= String.format("%,d",i.getPrice()) %></p>
				    <a href="ItemDetailController?itemid=<%= i.getItemid() %>" class="btn btn-primary">Detail</a>
				  </div>
				</div>
		
		
		</div>
		<% } %>
	</div>
	<nav aria-label="Page navigation example" class="d-flex justify-content-center mt-5">
	  <ul class="pagination">
	    <li class="page-item">
	      <a class="page-link" href="#" aria-label="Previous">
	        <span aria-hidden="true">&laquo;</span>
	      </a>
	    </li>
	    <li class="page-item"><a class="page-link" href="#">1</a></li>
	    <li class="page-item"><a class="page-link" href="#">2</a></li>
	    <li class="page-item"><a class="page-link" href="#">3</a></li>
	    <li class="page-item">
	      <a class="page-link" href="#" aria-label="Next">
	        <span aria-hidden="true">&raquo;</span>
	      </a>
	    </li>
	  </ul>
	</nav>
	
<br><br><br><br><br>
</div>

<!-- footer -->
<footer class="bg-dark border border-secondary text-white text-center py-4 ">
  <div class="mb-2">
    <a href="#"><i class="bi bi-facebook text-white mx-2"></i></a>
    <a href="#"><i class="bi bi-instagram text-white mx-2"></i></a>
    <a href="#"><i class="bi bi-twitter text-white mx-2"></i></a>
  </div>
  <p>2023 © Designed And Created By <br><a href="https://www.instagram.com/dkyy_laksono/" class="text-white fw-bold">Dicky Laksono</a></p>
</footer>
<!-- end footer -->
	
</body>
</html>