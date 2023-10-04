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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<%
	List<Item> items = (List<Item>) request.getAttribute("items");
	String word = (String) request.getAttribute("word");
%>


<style>
	.img-fluid{
		width:400px;
        
		object-fit:cover;
	}

</style>

</head>
<body class="bg bg-dark">

<nav class="navbar navbar-expand-lg bg-body-tertiary bg-dark  border-success" data-bs-theme="dark">
  <div class="container-fluid ms-5">
    <a class="navbar-brand" href="#">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Laptop</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Type</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Price</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Help
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>

<div class="container mt-5 ">
	
	<div class="display-3 text-center text-light mb-3">LAPTOP LIST</div>

	<div id="carouselExampleIndicators" class="carousel slide">
 		 <div class="carousel-indicators">
	    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
	    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
	    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
	  </div>
	  <div class="carousel-inner "style="height:500px;">
	    <div class="carousel-item active">
	      <img style="height:500px;" src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG97aYFTiCu7rGxbLrd4FKYYVdxoldzWq0KnqZrXH_izwr9qEmMzvAJmZL2EZvGdJsV55Eqse0YUDJ0DeU_ZAH-SqRmkXdENuhHvghwnxLuzaRpXI8zagw7M7s6pqkyURoBRKc3w6gAjLC0DLmDXSVxSLx-ImW6OEU9XCfgAaRAdb-rrcIoRnARwuPFwVh2a3athBbssrmQRf0CYSOSyV4MHUH9bHVWsrj2Uz04mSZEo1/acernitrolaptop-1650914214505.jpg?errorImage=false" class="d-block w-100" alt="...">
	    </div>
	    <div class="carousel-item">
	      <img style="height:500px;" src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGzK3YXVoAIPLzaS6gnD2nhpqFv8NR1WlQ7Enx7BcVVb0sVoabl55Df5UcuVR-VGkoTmZzIdu-1ZM7cJctLrKFbvBMoPYG-HUNRZF1x8CDzGsy-Ij8CrYkQpp5pB2_lheaIH_QYZecdTV2ByUR4HWSc58sZv5YCy3kfPXOGaVQYTdyPfYlVsUrwOmOwiBMwLctcLu3OBNcDAgsYw-np9pK9A2EONqGPAcp9bEcBTwVP9mFt9gNPDD1xkv7uslI4EuZw==/1694045252838.webp" class="d-block w-100" alt="...">
	    </div>
	    <div class="carousel-item">
	      <img style="height:500px;" src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG33kD5hcrd3kDHlUEW5dUx1Fg7DNJWH4cDSON96Vmb9Fr5LjzLkR74wEUOmewhZVTzs6UEISqq4GrCbKCF69STiJfRAulg9myUAYST1jG1M9U_SGE4oTRZXTbGnwI59IP0Ab4_No9YxBCudD7YoFtlGNxTVTT9J8xBQnUxa3u7714AXonltybbpcmJ1Uzx7GKppfTvxdiTALByTK8OXGRi1qPq3I4IwH4wK8G4ycKcgXaw69kBKsZf3bxKNPeFo3uQ==/series_pic1.jpg?errorImage=false" class="d-block w-100" alt="...">
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

	<form action="ItemListController">
	<div class="row">
		<div class="mb-2 py-2">
			<input class="form-control" type="text" name="keyword" value="<%=word %>" placeholder="keyword">
		</div>
		<div class="mb-1 text-center">
			<input class="btn btn-success"type="submit" value="search">
		</div>
	</div>
	</form>
	
	<div class="row">
          <div class="col-12 pt-1 mt-3 mb-2 bg-primary"></div>
    </div>

<div class="row">
	<% for(Item i : items) { %>
		<div class="col-md-4  col-sm-6 mb-3 mt-2 text-center">
			<div class="card text-bg-dark border-success text-light d-flex justify-content-center" >
			  <img src="<%= i.getImage() %>" class="card-img-top ms-2 img-fluid text-center d-flex justify-content-center" alt="..." style="height:380px;">
			  <div class="card-body">
			    <h5 class="card-title text-truncate"><%= i.getItemName() %></h5>
			    <p class="card-text text-truncate"><%= i.getDetail() %></p>
			    <p class="card-text">￥<%= i.getPrice() %></p>
			    <a href="#" class="btn btn-primary" >Detail</a>
			  </div>
			</div>
		</div>
	<% } %>
	

</div>

<div class="row">
          <div class="col-12 pt-1 mb-2 bg-primary"></div>
</div>

<div class="row ">
	<div class="col mt-3 mb-3 d-flex justify-content-center">
<nav aria-label="Page navigation example" class="bg bg-dark">
  <ul class="pagination  text-bg-dark">
    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">Next</a></li>
  </ul>
</nav>
</div>
</div>




</div>

</body>
</html>