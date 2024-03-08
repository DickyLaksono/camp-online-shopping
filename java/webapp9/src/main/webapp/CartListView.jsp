<%@page import="aiwa.entity.Item"%>
<%@page import="java.util.List"%>
<%@page import="aiwa.entity.user"%>
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
user loginUser= (user) session.getAttribute("loginuser");
if(loginUser == null){
	response.sendRedirect("Login.jsp");
	return;
}

List<Item> cart =  (List<Item>) session.getAttribute("cart");
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
	
	a{
		text-decoration: none;
		color: #101010;
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
		<h1 class="display-3  text-center font-monospace fw-bold ">ショッピングカート</h1>
	</div>
	
	<% if (cart == null || cart.size() == 0) { %>
	
	<% } else { %>
	<div class="container" style="position: relative; ">
		<table class="table table-bordered border-dark table-hover rounded">
			<thead>
				<tr class="text-center fs-4 ">
					<th class="col-2 " style="padding: 18px 0;">画像</th>
					<th class="col" style="padding: 18px 0;">商品名</th>
					<th class="col-1" style="padding: 18px 0;">価格</th>
					<th class="col-1" style="padding: 18px 0;">数量</th>
					<th class="col-2" style="padding: 18px 0;">小計</th>
				</tr>
			</thead>
			<tbody class="table-group-divider">
			<% int total = 0; %>
			<% int quantity = 0; %>
			<% for(Item item: cart) { %>
			<tr >
				<td class="d-flex justify-content-center align-item-center"scope="row" ><img class="img-m" alt="" src="<%= item.getImage()%>" style="height:80px;cursor:pointer;transition:0.5s; box-shadow: 1px 1px 5px rgb(1, 1, 3);" ></td>
				<td class="text-center fs-2 " style="padding: 25px 0;"><%= item.getItemname() %></td>
				<td class="text-center fs-5" style="padding: 28px 0;"><%= item.getPrice() %> 円</td>
				<td class="text-center fs-5" style="padding: 28px 0;"><a href="CartRemoveController?itemid=<%= item.getItemId() %>"><i data-feather="minus-square" style="margin-bottom: 5px;"></i></a> <%= item.getAmount() %> 個 <a href="CartAddController?itemid=<%= item.getItemId() %>"><i data-feather="plus-square" style="margin-bottom: 5px;"></i></a></td>
				<td class="text-center fs-5" style="padding: 28px 0;"><%= item.getPrice() * item.getAmount() %> 円</td>
			</tr>
			<% total += item.getPrice() * item.getAmount(); %>
			<% quantity += item.getAmount(); %>
			<% } %>
			</tbody>
		</table>
		<table class="table table-bordered border-dark table-hover rounded " style="width:300px;position:absolute; right: 10px;">
			<thead>
				<tr>
					<th colspan="2" class="text-center fs-3 ">合計</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="text-center fs-4 "><%= total %> 円</td>
					<td class="text-center fs-4 "><%= quantity %> 個</td>
				<tr>
			</tbody>
		</table>
	</div>
	<div style="display:flex; justify-content:center;margin: 20px 0;">
	<a href="OrderInsertController" style="background-color:yellow; padding:8px 50px; color: black;margin-top:30px;border-radius:10px;font-size: 20px; font-weight: bold; letter-spacing:3px;border: 1px solid black;">購入</a>
	</div>
	<% } %>
	
	
	
	<footer style="border-top: 1px solid #101010;background-color:#bebaba;text-align:center; padding:3rem 0;margin-top:20rem;">
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

<script>

const imgM = document.querySelectorAll("td img");
imgM.forEach(function (i) {
  i.addEventListener("mouseenter", function () {
    i.style.transform = "scale(4.5)"; 
    i.style.zIndex = "10";
    i.addEventListener("mouseleave", function () {
      i.style.transform = "scale(1)";
      i.style.zIndex = "0";
    });
  });
});


</script>

</body>
</html>