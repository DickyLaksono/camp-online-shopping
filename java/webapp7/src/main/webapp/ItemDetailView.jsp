<%@page import="aiwa.entity.Category"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.tomcat.util.http.fileupload.MultipartStream.ItemInputStream"%>
<%@page import="aiwa.entity.Item"%>
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

List<Item> item = (List<Item>) request.getAttribute("items");
String word = (String) request.getAttribute("word");
List<Category> categories = (List<Category>) request.getAttribute("categories");
List<Item> categotyid = (List<Item>) request.getAttribute("categoryid");

String min = (String) request.getParameter("min");
String max = (String) request.getParameter("max");

%>

<style>

.container{
	width:1000px;
}


.card-fluid{
	boject-fit:cover;
	height: 200px;
}
</style>
</head>

<body>

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


<div class="container border border-primary">

	<div class="display-3 d-flex justify-content-center text-decoration-underline mt-2 mb-5"><strong>Product Detail</strong></div>

	<div class="row text-dark">
	
		<div class="col-5">
			<img alt="" src="<%= item.getImage()%>"  class="img-fluid border border-primary">
		</div>
		
		<div class="col-6 offset-1">
			<div class="row mt-3">
				<div class="col ">
					<h1><%= item.getItemname() %></h1>
				</div>
			</div>
			<div class="row">
				<div class="col my-2">
					<%= item.getRating() %> 
						<% for(int i = 0; i <(int)item.getRating(); i++) { %>
							<img height=20px; alt="" src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGxhW480mx7OoNacGstsj8Ha699wVrHrrui5shv10i6KZYOZ0hxyWvAvrABWoDYn-ai0KjIZ8C4uAZRGa8IAmsc97uERjCFBeZSUad2XyBLKtgSV_eV6zVWMeBnK5G3HTxAIYZSFpi9w6aae_cQLK7iM=/2184497.png?errorImage=false">		
						<% } %>
						<% if(item.getRating() % 1 != 0) { %>
							<img height=20px; alt="" src="img/half.png"> 
					<% } %>
				</div>	
			</div>
			<div class="row">
				<div class ="col my-2">
					<div>価格: ￥ <%= String.format("%,d",item.getPrice()) %></div>
				</div>
			</div>
			<div class="row mt-3" >
				<div class="col">
					<div>モデル: </div>
					<div> <%= item.getModel().replace("\r\n","<br>") %></div>
				</div>
			</div>
			<div class="row mt-3" >
				<div class="col-1">
				
					<div class="bg bg-info border border-black d-flex justify-content-center align-items-center " style="width:50px; height:50px; border-radius:3px;"><i class="bi bi-cart4"></i></div>					
				</div>	
				<div class="col">
					<button class="bg bg-info d-flex justify-content-center align-items-center ms-3" style="width:130px; height:50px; border-radius:3px;">Buy Now!</button>
				</div>
			</div>	
					
		</div>
	
	</div>
	
	<div class="row">
		<div class="col">
			<div class="bg bg-info fs-3 py-2 mt-5 mb-4 d-flex justify-content-center">Detail</div>
		</div>
	</div>
	<div class="row">
		<div class="col">
			<div> <%= item.getDetail().replace("\r\n","<br>") %></div>
		</div>
	</div>	
	
	
	
		
	<br><br><br><br><br><br>
	

	
	
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