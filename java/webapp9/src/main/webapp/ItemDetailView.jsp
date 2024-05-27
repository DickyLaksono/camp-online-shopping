<%@page import="aiwa.entity.user"%>
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
 <script src="https://unpkg.com/feather-icons"></script>
<%
Item item = (Item) request.getAttribute("item");
user loginUser= (user) session.getAttribute("loginuser");
if(loginUser == null){
	response.sendRedirect("Login.jsp");
	return;
}
%>

<style >
	.update-container{
		display: flex; 
		justify-content: center; 
		margin:10px auto 50px;
	}
	
	.update-button{
		text-decoration: none;
		color:#101010;
		padding: 10px 30px;
		border-radius:20px;
		background-color: #6db3f9;
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
		    <a class="nav-link" aria-current="page" href="ItemListController">商品リスト</a>
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
		<h1 class="display-3 font-monospace fw-bold text-center">Item Info</h1>
		<div class="d-flex justify-content-between">
			<a href="#" class="btn btn-info mb-3" onclick="history.back()" style="color:#101010;"><i data-feather="skip-back" style="transform: scale(0.7)"></i>Back</a>
			<a href="ItemDeleteController?itemid=<%= item.getItemId() %>" class="btn btn-danger mb-3" onclick="return confirm('削除しますか？')" style="color:#101010;"><i data-feather="trash-2" style="transform: scale(0.7)"></i>Delete</a>
		</div>
		<table class="table table-bordered border-dark table-hover rounded ">
			<tr >
				<th class="col-2 text-center fs-5" style="padding: 18px;">Item Name</th>
				<td class="fs-5 fw-semibold" style="padding: 18px;"><%= item.getItemname() %></td>
			</tr>
			<tr>
				<th class="text-center fs-5" style="padding: 18px;">Price</th>
				<td class="fs-5 fw-semibold" style="padding: 18px;"><%= item.getPrice() %> 円</td>
			</tr>
			<tr>
				<th class="text-center fs-5" style="padding: 18px;">Detail</th>
				<td class="fs-5 fw-semibold" style="text-indent: 20px;line-height:2.3rem;padding: 18px;"><%= item.getDetail().replace("\r\n", "<br>") %></td>
			</tr>
			<tr>
				<th class="text-center fs-5 " style="padding: 18px;">Image</th>
				<td class="d-flex justify-content-center" style="padding:30px 0;"><img src="<%= item.getImage() %>" width="50%" height="50%" style="box-shadow: 1px 1px 5px rgb(1, 1, 3);"></td>
			</tr>
		</table>
	</div>
		
	<div class="container">
		<div class="update-container" style="">
			<a href="ItemUpdateController?itemid=<%= item.getItemId() %>" class="update-button" style="">Update</a>
		</div>
		<div class="" style="">
			<a href="CartAddController?itemid=<%= item.getItemId() %>" class="update-button" style="">Add To Cart</a>
		</div>
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

<script>
      feather.replace();
</script>
</body>
</html>