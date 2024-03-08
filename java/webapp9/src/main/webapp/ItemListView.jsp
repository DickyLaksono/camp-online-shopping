<%@page import="aiwa.entity.user"%>
<%@page import="java.util.List"%>
<%@page import="aiwa.entity.Item"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aiwazon</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://unpkg.com/feather-icons"></script>

<%
	List<Item> items = (List<Item>) request.getAttribute("items");
	String keyword = (String) request.getAttribute("keyword");
	
	user loginUser= (user) session.getAttribute("loginuser");
	if(loginUser == null){
		response.sendRedirect("Login.jsp");
		return;
	}
%>

<style>

	.card{
		overflow: hidden;
	}
	
	.card img{
		transition:0.4s;
		overflow: hidden;
	}
	
	.card img:hover{
		transform: scale(1.1);
	}
	
	.card-body{
		overflow: hidden;
	}
	
	.nav-link::after{
		content:"";
		display:block;
		padding-bottom: 0.3rem;
		border-bottom: 2px solid #666;
		transform:scale(0)
	}
	
	.nav-link:hover::after{
		transform:scale(0.6);
		transition:0.3s linear;
	}
	
	
</style>
</head>
<body class="bg-body-secondary">

	<div class="container">
		<div class="row mx-2 mt-3 mb-5">
			<div class="col bg bg-white border border-dark rounded fw-semibold fst-italic" style="font-size:20px;max-width:300px;box-shadow: 1px 1px 3px rgb(255, 191, 0);padding:20px 0;text-align:center;">こにちは <%= loginUser.getUserName() %> さん <i data-feather="smile"></i></div>	
		</div>
	</div>


	<div class="container mt-5 mb-3">
		<ul class="nav nav-tabs ">
		  <li class="nav-item">
		    <a class="nav-link active" aria-current="page" href="ItemListController">商品リスト</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="CartListController">ショッピングカート</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="OrderInsertController">購入履歴</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="ItemInsertView.jsp">新規登録</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="Login.jsp">ログイン</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link text-danger" href="LogoutController">ログアウト</a>
		  </li>
		</ul>
	</div>	
	<div class="container my-5">
		<h1 class="display-3  text-center font-monospace fw-bold tittle">Item List</h1>
		
		<form action="ItemListController" class="d-flex" role="search" style="width:50%; margin:0 auto;">
	      <input class="form-control me-2  border border-3" name="keyword" type="search" placeholder="Search" aria-label="Search">
	      <button class="btn btn-outline-warning" type="submit">Search</button>
	    </form>
	</div>
	
	<div class="container">
		<div class="row d-flex justify-content-center px-5	">
			<% for(Item i : items) {%>
			<div class="col col-md-3 mb-4"  >
				<div class="card border shadow-lg border-warning" >
				  <img src="<%= i.getImage() %>" class="card-img-top img-fluid " alt="..." style="height:300px;">
				  <div class="card-body" style="overflow:hidden;">
				    <h5 class="card-title fw-bold text-decoration-underline fs-5 text-truncate"><a href="" class="link-dark"><%= i.getItemname() %></a></h5>
				    <p class="card-text text-truncate"><%= i.getDetail() %></p>
				    <a href="ItemDetailController?itemid=<%= i.getItemId() %>" class="btn btn-primary ">Details</a>
				    <a href="CartAddController?itemid=<%= i.getItemId() %>" class="btn btn-warning btn-sm"  target="_self" style="padding: 5px 3px;"><i data-feather="plus" style="transform: scale(0.5);"></i><i data-feather="shopping-cart" style="transform: scale(0.7);"></i></a>
				  </div>
				</div>
			</div>
			<% } %>
		</div>
	</div>
<footer style="border-top: 1px solid #101010;background-color:#bebaba;text-align:center; padding:3rem 0;margin-top:3rem;">
	<div class="icons" style="display: flex;justify-content:center; gap: 1rem;">
		<i class="bi bi-facebook icon" style="font-size: 1.6rem;"></i>
		<i class="bi bi-instagram icon" style="font-size: 1.6rem;"></i>
		<i class="bi bi-twitter icon" style="font-size: 1.6rem;"></i>
		<i class="bi bi-tiktok" style="font-size: 1.6rem;"></i>
	</div>
	<div class="credit">
		<p>Created by <a>Dicky Laksono</a> | @copy; 2024</p>
	</div>
</footer>

<script>
      feather.replace();
    </script>
</body>
</html>