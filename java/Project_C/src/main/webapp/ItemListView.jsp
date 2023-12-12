<%@page import="aiwa.entity.Category"%>
<%@page import="aiwa.entity.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.7.1.js"></script>

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

%>

<style>

*{
	margin:0;
	padding:0;

}

body{

background-image:url(https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG6Iv8iV0LIlfuiPBdhk0HRJnVo5d94f6HQvXUXXnLje7_-l30EC2k5VyK2CM8GzqnMMYNDlsY7zLW8gDlx2aHHVNL-OlGnGrcxfZAbWJW5u0yI5ODbH2TU_zeEaXPgU6NmopSMekdu9qn1wPlJytnvkwEL4xNhfnhjef60L3tqHAqJfyVggcbeRv-ZPq8Vu4pd00RiOwYZ-IZ313kcLURCGj8Uhpqpxb-_SEj53wSN8albgzbUJGH7bfuqL9PgSmAC7AEIOFPYAAJ9UaU3EXdsU8I6Ryzllrgqwft1scpOUc/1000_F_314269220_SKNZlUMDRvv9J4qdTywZyNxGRujFVlQn.jpg?errorImage=false);
}
</style>
</head>
<body>

<div class="text-center bg bg-primary img-fluid" style="height:250px;">
	<img height="300px;" width="1520px; style="max-width:1520px;"  alt="" src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGx5cm8knTLo61O84kVTxOan841a30-aIJSoqkmlQNsP4-Qv0KVqX9M9vYFUiwJk7TXN0F62gDvcS3w5uYLKYlD9HAU0BHlzoTPkyXtSaObn0y0n1jjfHQvntYP96j1rxc4rqUtyQ2a5J_rrWIGyf4zd6H-4ZHJ8cNPC4vP3LfW6WS_kbcJjXanR0X-5ef0KX8C_-A9N2GJc7fFJeFtXBgJ4wXwpr4FTdsoS_iI0jeNPG5Yq-VPWlt0XDFxFI4C7-IcuNC4L4ATX3hV8MRxzu-8ZElva914GMI8MyYdRZKdxEnR_3Ou0QWSsjY5SnJHi1E6oC_NhqVEKU2VFuhiGL6Bml_29Fm02PSQ93vloglVB0ALonvRqOy4uQuZo16KCKzx34KJsSkS1wuqyJM-71iZfb1nWOfTPaYr-qWHtBKUSJ4zykWGcW9k2bKuDvHoDPwkrjRFIXn4S2ck5IAvD7ShA4srlcsmI-QzYt4rM5V1NTvqHwg6YCd5-x04SUYjsjhP-EIS5QL3cYMbp4eYbphVVEw_RFe2fG6XcJrorIo_9hKPGFkDyh8j5Lxf9tUk-HVRGc-xnSEG9f3U89Zucpz68kw0jeFc2GciBeBHJjOom4aE4-W9uPEB76D8ZD-3inzKZVocCvfQ7mIVyVReX7oW2kRxTihS2iJlsQhfqf4F12oBw3UkoX8NAbVGgt4f3KYBuZvudY1Kj6lUCvfRpLacFrK2xg-4jqKnNSZcm0oQ65mMCj60bLo2oAQ9ZQUK1qTl7coNyGbQQo-0imnlhC-bzPCwAwj2JHkFRLLhg4_ndx7lNfiZMKWdAl32JHP1MmhvEWxhv8HKYnflwE5oc6_A-Rc9YlblgoaIZum4dXj79FOXo3xy7GLnKJDzbFHrtr55VrsnL6D63vI9KjuxXIrGEmDYA_F2GcQas3uT8Lzm5nIyTU2OOBYgopYns9uqLh7N99PaYFvGNZ_ud4OyfDQ7XbNJCmvAnYz1KgnTf8e6ZuLVLK-3Dfm9BcopKra4TRTby-76oUIijD4wfOyiJJJGe2NX4bN-cwA1C5zcHYPItGS77tL59ZWAJbxW4bjJh509Wkr7Z-_JmaDJV9PfAk_a7jJOaCDLrheFdqNIBz8108jZzDTvQsL06Oht3KRmdUZyVZ_Jhqiu7v04699ywooUJ0tS_ehqS3NIapDK7ci4EqfjNqoMgDALEfKTAvXps-chlKmfjDhTCd1Q6PvR2wFlvbqF-ZWPddA0ZwKFATixrM/1500px-D0A1D0BFD0B0D181D0B5D0BDD0B8D18F_D0B1D183D185D182D0B02C_D094D092D093D09CD097_1.jpg?errorImage=false">
	<div class="card-img-overlay display-4 text-info fw-bolder" style="line-height:200px">Animal Corner</div>
	<div class="card-img-overlay fs-4 text-decoration-underline text-info" style="line-height:300px">Discover Many Amazing Animals That Live In Our Planent</div>	
</div>
<small></small>

<nav class="navbar navbar-expand-lg bg-info">
  <div class="container-fluid  mx-5" >
    <a class="navbar-brand" href="TypeListController">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        
         <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Support</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Report</a>
        </li>
        
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<div class="container ">

<!-- scroll up -->
  <div  class="fixed-bottom d-flex justify-content-end me-5 fs-2" >
    <p class=" bg bg-success text-light rounded-5 px-3"><a href="#" class="link-light"  style="text-decoration: none;">↑</a></p> 
  </div>
  <!-- end scroll up -->
	
	<div class="row py-3 bg bg-success "style="position:relative;">
		<div class="col d-flex justify-content-around"><a class="text-decoration-none link-light" href="ItemListController?categoryid=1">哺乳類</a></div>
		<div class="col d-flex justify-content-around"><a class="text-decoration-none link-light" href="ItemListController?categoryid=2">鳥類</a></div>
		<div class="col d-flex justify-content-around"><a class="text-decoration-none link-light" href="ItemListController?categoryid=3">爬虫類</a></div>
		<div class="col d-flex justify-content-around"><a class="text-decoration-none link-light" href="ItemListController?categoryid=4">魚類</a></div>
		<div class="col d-flex justify-content-around"><a class="text-decoration-none link-light" href="ItemListController?categoryid=5">昆虫</a></div>
		<div class="col d-flex justify-content-around"><a class="text-decoration-none link-light" href="ItemListController?categoryid=6">夜行性動物 </a></div>
	</div>
	
	<div class=" border border-dark d-flex justify-content-end py-2 px-2 mt-1" style="position:absolute;right:110px;"><span id="timer"> </span> Second Left</div>
	
		<div class="row">
		
		<div class="col-3 bg bg-success-subtle">
		<% for(Item i : items) { %>
		
		
		<div class="col d-flex justify-content-center py-2 my-3"  style="border-bottom: 2px solid black;position:relative;">
			<h4><a class="text-decoration-none link-dark" href="#<%= i.getItemid() %>"><%= i.getName() %> </a></h4>
		</div>
		<% } %>
		</div>
		
		<div class="col-9 bg bg-info-subtle">
		<% for(Item i : items) { %>
		<div class="col-8 col-lg-12 col-md-12 col-sm-12 d-flex justify-content-center  mt-5 mb-5 px-5">
			<div class="card mb-3 d-flex justify-content-center align-item-center border border-primary" id="<%= i.getItemid() %>">
			  <a href="ItemDetailController?itemid=<%= i.getItemid() %>"><img height="400px;"  src="<%= i.getImage() %>" class="card-img-top " alt="..."></a>
			  <div class="card-body">
			    <h5 class="card-title"><strong><%= i.getName() %></strong></h5>
			    <p class="card-text text-truncate"><%= i.getDetail() %></p>
			  </div>
			</div>
			
		</div>
		<% } %>
		</div>
		
		
	</div>
		
		<!-- data-bs-backdrop="static" data-bs-keyboard="false" untuk agar modal tidak bisa di tap -->
    <!-- Modal Quiz ========================================================================-->
    <div  class="modal fade" data-bs-backdrop="static" data-bs-keyboard="false" id="quizModal" tabindex="-1" aria-labelledby="quizModalLabel" aria-hidden="true">
      <div class="modal-dialog" >
        <div class="modal-content">
          <div class="modal-header" >
            <h5 class="modal-title" id="quizModalLabel">Quiz Game</h5>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close" id="closeButton" style="display: none"></button>
          </div>
          <div class="modal-body">
          	<!--<img style="margin-right:500px;" height="300px;" class="mx-5" alt="" src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG3Q-qO3Ex-xMeBkSngVVmozkKE_jeL6dqUY_P8ly12_ycdppQSfRKkpKHuxQ-5Emgh_QThT2rRmUjbahL2aFiPxprxG-r_pbrgNIwRTCLKwjVBFRtZC1vC2MCtv_xtvdN1LR7s356lDUY6HBorF9Dvk51zx0_Qip9jsPXGXITQSFvkxYBJ50mxo780Kz36eXWlwfPhXvjry1DUEVDrDGiQKrybYlWNaNMFdJ_J0quP6LqCZm2MppEzlQ0ct2qDrxpPU8IpvZ9iWjhd6zLY2FiBtz7MTkHBnZq7jRYfe5XSiWBeimCja91A2Wk403wu4E_4jhPH5PEk1wqiBWZy79RdubIRu5Fmusle1LjxECEU2K97ofLUkLwfvlwJ97faidGqkDf7dRFWXMf_zMXxvTIyrqcCsv7Y32SliBqW4RwStWZY80E1xgkOwOX8YwCxuhnA==/10696300_450_0.jpg?errorImage=false"> -->
          	<img id="questionImage" src="" alt="Question Image" style="max-width: 100%; max-height: 300px; margin:5px auto;"/>
            <p id="question" class="fw-bold fs-5"></p>
            <div id="options" class=" ">
              <button id="option1" class="btn btn-primary  mt-1 me-2" onclick="checkAnswer(1)"></button>
              <button id="option2" class="btn btn-primary  mt-1 me-2" onclick="checkAnswer(2)"></button>
              <button id="option3" class="btn btn-primary  mt-1 me-2" onclick="checkAnswer(3)"></button>
              <button id="option4" class="btn btn-primary  mt-1 me-2" onclick="checkAnswer(4)"></button>
            </div>
            <p class="mt-2" id="result"></p>
            <button id="next" class="btn btn-success" onclick="nextQuestion()">Next</button>
            <button id="finish" class="btn btn-primary" style="display: none" onclick="endGame()">Finish</button>
            <button id="newButton" class="btn btn-danger mt-2" style="display: none" onclick="goToAnotherPage()">Back</button>
          </div>
        </div>
      </div>
    </div>

    <!-- Tombol untuk memunculkan modal secara otomatis -->
    <button id="openModalButton" style="display: none" data-bs-toggle="modal" data-bs-target="#quizModal">Start Quiz</button>
    
    <div class="modal fade" id="restartModal" tabindex="-1" role="dialog" aria-labelledby="restartModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-body">
            <p>終了!</p>
            <button type="button" class="btn btn-primary" id="restartButton" onclick="goToAnotherPage()">Restart</button>
          </div>
        </div>
      </div>
    </div>
    
	<!-- end Quiz ======================================================================== -->
	
	<!-- Janken ======================================================================== -->
	<!-- Modal -->
<!-- 
    <div class="modal fade" data-bs-backdrop="static" data-bs-keyboard="false" id="gameModal" tabindex="-1" role="dialog" >
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h4 class="modal-title"><b> ジャンケン</b></h4>
          </div>
          <div class="modal-body">
            <div class="container">
              <div class="row">
                <div class="col-md-4 mt-2">
                  <button class="btn btn-primary btn-block" id="グー">グー</button>
                </div>
                <div class="col-md-4 mt-2">
                  <button class="btn btn-primary btn-block" id="チョキ">チョキ</button>
                </div>
                <div class="col-md-4 mt-2">
                  <button class="btn btn-primary btn-block" id="パー">パー</button>
                </div>
              </div>
              <p class="result text-center mt-3"></p>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary"  id="close" style="display: none">Tutup</button>
            <button type="button" class="btn btn-primary back-button" id="back" style="display: none">Back</button>
          </div>
        </div>
      </div>
    </div> -->
	<!-- end Janken ======================================================================== -->
</div>

<!-- footer -->
<footer class="bg-info border border-secondary text-white text-center py-4">
  <div class="mb-2">
    <a href="#"><i class="bi bi-facebook text-white mx-2"></i></a>
    <a href="#"><i class="bi bi-instagram text-white mx-2"></i></a>
    <a href="#"><i class="bi bi-twitter text-white mx-2"></i></a>
  </div>
  <p>2023 © Designed And Created By <br><a href="https://www.instagram.com/dkyy_laksono/" class="text-white fw-bold">Dicky Laksono</a></p>
</footer>
<!-- end footer -->
    

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.min.js"></script>
    <script src="scriptquiz.js"></script>






</body>
</html>