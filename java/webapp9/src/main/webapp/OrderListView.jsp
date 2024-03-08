<%@page import="aiwa.entity.Order"%>
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

<%
user loginUser= (user) session.getAttribute("loginuser");
if(loginUser == null){
	response.sendRedirect("Login.jsp");
	return;
}

List<Order> orders =  (List<Order>) request.getAttribute("orders");
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
	
	<div class="container my-5">
		<h1 class="display-3  text-center font-monospace fw-bold ">購入履歴</h1>
	</div>
	
	<% if (orders == null || orders.size() == 0) { %>
	
	<% } else { %>
	<div class="container" style="position: relative; ">
		<table class="table table-bordered border-dark table-hover rounded">
			<thead>
				<tr class="text-center fs-4 ">
					<th class="col-2 " style="padding: 18px 0;">画像</th>
					<th class="col" style="padding: 18px 0;">商品名</th>
					<th class="col-1" style="padding: 18px 0;">価格</th>
					<th class="col-1" style="padding: 18px 0;">数量</th>
				</tr>
			</thead>
			<tbody class="table-group-divider">
			<% int total = 0; %>
			<% int quantity = 0; %>
			<% for(Order item: orders) { %>
			<tr >
				<td class="d-flex justify-content-center align-item-center"scope="row" ><img class="img-m" alt="" src="<%= item.getItem().getImage()%>" style="height:80px;cursor:pointer;transition:0.5s; box-shadow: 1px 1px 5px rgb(1, 1, 3);" ></td>
				<td class="text-center fs-2 " style="padding: 25px 0;"><%= item.getItem().getItemname() %></td>
				<td class="text-center fs-5" style="padding: 28px 0;"><%= item.getItem().getPrice() %> 円</td>
				<td class="text-center fs-5" style="padding: 28px 0;"> <%= item.getAmount() %> 個</td>
			</tr>
			<% } %>
			</tbody>
		</table>
	<div style="display: flex; justify-content: center;">
		<a href="OrderReportController" style="background-color: teal; padding: 10px 20px; border-radius:10px; color:white; text-decoration: none; margin: 20px 0;">請求書発行</a>
	</div>
	</div>
	<% } %>

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