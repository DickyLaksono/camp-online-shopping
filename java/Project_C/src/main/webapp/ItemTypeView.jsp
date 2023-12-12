<%@page import="aiwa.entity.Type"%>
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

<script
  src="https://code.jquery.com/jquery-3.7.1.js"></script>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<%

List<Type> type = (List<Type>) request.getAttribute("type");
String word = (String) request.getAttribute("word");
List<Category> categories = (List<Category>) request.getAttribute("categories");
List<Item> categotyid = (List<Item>) request.getAttribute("categoryid");

%>

<style>
body{
	background-image:url(https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGzZML9w1MxyubOE0VcsMMyl67cn2Mqcak8ceYrDKx_x1NLqPHrg2PV-Xw-ChjLD7aIv65Rczc6L7Z1Op7RsjELV0e6SgHPuIV_P556Jjg0cheP4uQXRos5PDp3wK8lihwcWiGyOFb9w1vb-U3V6LiPEGVp0QSuqWQaKheruV_iuvpXT6U_qqUTxjpNBs9SPTnf-vSnmiVnLN2XsW5Zf0jQ1OlkO3oTPXL15p8SUiBcLBTRuLW8cDoI0nSLc9s0s_AkdQA4TZABkt9O1L1rrzLpqIW1S0kpzJPpJX9gQIhngHelgH5FD2MjHFnfLNUQKXmltqaqG-FdlALMxDiYXp5wyeV6iebxz6PQB6I2577sEGJFJFdmik4MbYFHw8t-irGdEuh93GYs-gpMCcCw8gyxFGlcjzNqDDszuzqmqTJRGg26VA-KMzZZvSD2SosQiLV3vXVKQarzeJB5K4TPPwauR5YOr88Y9M4ytXkvksmZyepOG7gPl7VuETOU7nkGT6yrQQR6X5f0WrrqHA09D2GiG4Bn7EvphqphELMUeNgt6TWVJGWt6YsFzMjtLiUKmHGdfG5wzx7glvTAu_1n7QV_FaK2cVgbHw0R1yqgmV79fuz3AEycESK3EXO53HXQLZDOCtJJLZx8Xz2jsmaZfHFHEYPjxnMzz2sHOG10-5ouAtaSJE01dkuWN6WNdLPc4N9Pj0flakwe0RbDd7Y9PD33v7hsH6uinho9U8Ocz445xhfXsctr9fk9eFaCtk9lqCa6f_Po_jFul1Pq2V4j-uHcnAcmqantLR2HKUQ1OXAbAlGBsAeRX0EKlNMIoRI8fLUg==/panorama-banner-background-of-tropical-forest-landscape-scene-for-using-in-concept-of-environmental-ecology-and-sustainable-energy-or-earth-day-wild-wood-scenic-using-for-wallpaper-of-spa-and-tourism-free-photo.jpg?errorImage=false);
}


</style>

</head>
<body>

<div class="text-center bg bg-primary img-fluid" style="height:250px;">
	<img height="300px;" width="1520px; style="max-width:1520px;"  alt="" src="https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGx5cm8knTLo61O84kVTxOan841a30-aIJSoqkmlQNsP4-Qv0KVqX9M9vYFUiwJk7TXN0F62gDvcS3w5uYLKYlD9HAU0BHlzoTPkyXtSaObn0y0n1jjfHQvntYP96j1rxc4rqUtyQ2a5J_rrWIGyf4zd6H-4ZHJ8cNPC4vP3LfW6WS_kbcJjXanR0X-5ef0KX8C_-A9N2GJc7fFJeFtXBgJ4wXwpr4FTdsoS_iI0jeNPG5Yq-VPWlt0XDFxFI4C7-IcuNC4L4ATX3hV8MRxzu-8ZElva914GMI8MyYdRZKdxEnR_3Ou0QWSsjY5SnJHi1E6oC_NhqVEKU2VFuhiGL6Bml_29Fm02PSQ93vloglVB0ALonvRqOy4uQuZo16KCKzx34KJsSkS1wuqyJM-71iZfb1nWOfTPaYr-qWHtBKUSJ4zykWGcW9k2bKuDvHoDPwkrjRFIXn4S2ck5IAvD7ShA4srlcsmI-QzYt4rM5V1NTvqHwg6YCd5-x04SUYjsjhP-EIS5QL3cYMbp4eYbphVVEw_RFe2fG6XcJrorIo_9hKPGFkDyh8j5Lxf9tUk-HVRGc-xnSEG9f3U89Zucpz68kw0jeFc2GciBeBHJjOom4aE4-W9uPEB76D8ZD-3inzKZVocCvfQ7mIVyVReX7oW2kRxTihS2iJlsQhfqf4F12oBw3UkoX8NAbVGgt4f3KYBuZvudY1Kj6lUCvfRpLacFrK2xg-4jqKnNSZcm0oQ65mMCj60bLo2oAQ9ZQUK1qTl7coNyGbQQo-0imnlhC-bzPCwAwj2JHkFRLLhg4_ndx7lNfiZMKWdAl32JHP1MmhvEWxhv8HKYnflwE5oc6_A-Rc9YlblgoaIZum4dXj79FOXo3xy7GLnKJDzbFHrtr55VrsnL6D63vI9KjuxXIrGEmDYA_F2GcQas3uT8Lzm5nIyTU2OOBYgopYns9uqLh7N99PaYFvGNZ_ud4OyfDQ7XbNJCmvAnYz1KgnTf8e6ZuLVLK-3Dfm9BcopKra4TRTby-76oUIijD4wfOyiJJJGe2NX4bN-cwA1C5zcHYPItGS77tL59ZWAJbxW4bjJh509Wkr7Z-_JmaDJV9PfAk_a7jJOaCDLrheFdqNIBz8108jZzDTvQsL06Oht3KRmdUZyVZ_Jhqiu7v04699ywooUJ0tS_ehqS3NIapDK7ci4EqfjNqoMgDALEfKTAvXps-chlKmfjDhTCd1Q6PvR2wFlvbqF-ZWPddA0ZwKFATixrM/1500px-D0A1D0BFD0B0D181D0B5D0BDD0B8D18F_D0B1D183D185D182D0B02C_D094D092D093D09CD097_1.jpg?errorImage=false">
	<div class="card-img-overlay display-4 text-info fw-bolder" style="line-height:200px">Animal Corner</div>
	<div class="card-img-overlay fs-4 text-decoration-underline text-info" style="line-height:300px">Discover Many Amazing Animals That Live In Our Planent</div>	
</div>


<nav class="navbar navbar-expand-lg  bg-info">
  <div class="container-fluid mx-5" >
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

<div class="container bg bg-info-subtle">

<!-- scroll up -->
  <div  class="fixed-bottom d-flex justify-content-end me-5 fs-2" >
    <p class=" bg bg-success text-light rounded-5 px-3"><a href="#" class="link-light"  style="text-decoration: none;">↑</a></p> 
  </div>
<!-- end scroll up -->
	
		<div class="row ">
		
		<% for(Type i : type) { %>
		<div class="col-lg-6 col-md-6 col-sm-12 d-flex justify-content-center   mt-5 mb-2">
		
			<div class="card mb-3 d-flex justify-content-center align-item-center border border-primary" >
			  <a href="ItemListController?categoryid=<%= i.getItemid() %>"><img height="400px;"  src="<%= i.getImage() %>" class="card-img-top" alt="..."></a>
			  <div class="card-body">
			    <h5 class="card-title fs-3"><strong>種類: <%= i.getName() %></strong></h5>
			    <p class="card-text "><%= i.getDetail() %></p>
			  </div>
			</div>
			
			
			
			
		</div>
		<% } %>
	</div>
		
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



</body>
</html>