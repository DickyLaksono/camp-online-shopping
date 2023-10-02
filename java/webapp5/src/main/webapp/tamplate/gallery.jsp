<%@page import="aiwa.entity.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>初心者向けホームページテンプレート tp_beginner5</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="ここにサイト説明を入れます">
<meta name="keywords" content="キーワード１,キーワード２,キーワード３,キーワード４,キーワード５">
<link rel="stylesheet" href="tamplate/css/style.css">
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

<%
	List<Item> items = (List<Item>) request.getAttribute("items");
%>


<![endif]-->
</head>

<body>

<div id="container">

<header>
<h1 id="logo"><a href="index.html"><img src="tamplate/images/logo.png" alt="SAMPLE SITE"></a></h1>
</header>



<div id="contents">

<section>

<h2>GALLERY</h2>


	<% for(Item i : items) { %>
		

			<div class="list">
			<img src="<%= i.getImage() %>">
			<h4><%= i.getItemName() %></h4>
			<p><%= i.getPrice() %></p>
			</div>

		
	<% } %>


</section>

</div>
<!--/contents-->

<footer>
<small>Copyright&copy; <a href="index.html">SAMPLE SITE</a> All Rights Reserved.</small>
<span class="pr">《<a href="https://template-party.com/" target="_blank">Web Design:Template-Party</a>》</span>
</footer>

</div>
<!--/container-->

</body>
</html>
