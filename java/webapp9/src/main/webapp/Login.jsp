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
	String msg = (String) request.getAttribute("msg");
	if(msg == null){
		msg ="";
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
		
		<div class="row mt-5 border border-3 border-info rounded-4 shadow py-4 px-3" style="max-width: 600px;margin: 0 auto;">
			<div class="col">
				<form action="LoginController" method="post">
				  <div class="mb-3 ">
				  	<h3 class="border-bottom border-2 pb-3 mb-4 fw-bold font-monospace text-center">Login</h3>
				  	<%= msg %>
				    <label for="userid" class="form-label">User Id</label>
				    <input type="text" class="form-control" name="userid" id="userid" aria-describedby="emailHelp">
				    <!-- <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
				  </div>
				  <div class="mb-3">
				    <label for="exampleInputPassword1" class="form-label">Password</label>
				    <input type="password" class="form-control" name="password" id="exampleInputPassword1">
				  </div>
				  <button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
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
</body>
</html>