<%@page import="aiwa.entity.user"%>
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

<%
	Item item = (Item) request.getAttribute("item");
user loginUser= (user) session.getAttribute("loginuser");
if(loginUser == null){
	response.sendRedirect("Login.jsp");
	return;
}
%>

<style>
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
<body>

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

	<div class="container my-3">
		<h1 class="display-3 text-center font-monospace fw-bold">Update Item</h1>
	</div>
	
	<div class="container">
		<form action="ItemUpdateController" method="post">
			<input type="hidden" name="itemid" value="<%=item.getItemId() %>">
			<label for="itemname" class="me-3 mt-3 mb-1">Item name :</label>
				<input class="form-control mb-2"id="itemname" type="text" name="itemname" placeholder="Item Name" value="<%= item.getItemname()%>">
			
			<label for="price" class="me-3 mb-1">Price :</label>
				<input class="form-control mb-2"id="price" type="number" name="price" placeholder="Price" value="<%= item.getPrice()%>">
			
			<label for="detail" class="me-3 mb-1">Detail :</label>
				<textarea class="form-control mb-2"id="detail"  name="detail" placeholder="Detail" style="height:200px;"><%= item.getDetail()%></textarea>
			
			<label for="image" class="me-3 mb-1">Image :</label>
				<input class="form-control mb-2"id="image" type="text" name="image" placeholder="Image" value="<%= item.getImage()%>">
			<div class="d-flex justify-content-center">
				<button class="btn btn-info mt-3 mb-5 px-3">Submit</button>
			</div>
			
		</form>
	</div>
	
	<footer style="border-top: 1px solid #101010;background-color:#bebaba;text-align:center; padding:3rem 0;margin-top:3rem;">
	<div class="icons" style="display: flex;justify-content:center; gap: 1rem;">
		<i class="bi bi-facebook icon" style="font-size: 1.6rem;"></i>
		<i class="bi bi-instagram icon" style="font-size: 1.6rem;"></i>
		<i class="bi bi-twitter icon" style="font-size: 1.6rem;"></i>
	</div>
	<div class="credit">
		<p>Created by <a>Dicky Laksono</a> | @copy; 2024</p>
	</div>
</footer>

</body>
</html>