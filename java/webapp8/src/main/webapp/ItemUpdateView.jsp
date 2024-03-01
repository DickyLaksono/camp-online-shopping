<%@page import="aiwa.entity.Item"%>
<%@page import="java.util.List"%>
<%@page import="aiwa.entity.Category"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <title>MultiShop - Online Shop Website Template</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">
    
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"> 
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" ></script>

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">  

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/style.css" rel="stylesheet">

<%

String word = (String) request.getAttribute("word");

List<Category> categories = (List<Category>) request.getAttribute("category");

Item item  = (Item) request.getAttribute("item");

String username = (String) session.getAttribute("username");


%>
</head>
<body>

<jsp:include page="TopBar.jsp"></jsp:include>

<jsp:include page="Navbar.jsp"></jsp:include>

<!-- Breadcrumb Start -->
    <div class="container-fluid">
        <div class="row px-xl-5">
            <div class="col-12">
                <nav class="breadcrumb bg-light mb-30">
                    <a class="breadcrumb-item text-dark" href="#">Home</a>
                    <span class="breadcrumb-item active">Update</span>
                </nav>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->

    <!-- Contact Start -->
    <div class="container-fluid">
        <h2 class="section-title position-relative text-uppercase text-center mx-xl-5 mb-4"><span class="bg-secondary pr-3">Update</span></h2>
        <div class="row px-xl-5 justify-content-center">
            <div class="col-lg-7 mb-5 " >
                <div class="contact-form bg-light p-30">
                    <div id="success"></div>
                    <form action="ItemUpdateController" method="post" >
                    
                        <div class="control-group">
                        	<input value="<%= item.getItemId() %>" name="itemid" type="hidden">
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
	                        <input value="<%= item.getItemName() %>" id="name" type="text" name="itemname" class="form-control" placeholder="Product name" required="required" data-validation-required-message="Please enter product name">
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                       		<input value="<%= item.getPrice() %>" id="email" type="number" name="price" placeholder="Price" class="form-control" required="required" data-validation-required-message="Please enter price">
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                       		<input value="<%= item.getRating() %>" id="email" type="number" max="5" min="0" step="0.1" name="rating" placeholder="rating" class="form-control" required="required" data-validation-required-message="Please enter rating">
                            <p class="help-block text-danger"></p>
                        </div>
                        
                        <div class="control-group mb-3 ">
                        <select name="categoryid" class="form-select">
	
							<option></option>
							<% for (Category c : categories) { %>
							<option <%= (c.getCategoryId() == item.getItemId()) ? "selected" : "" %> value="<%= c.getCategoryId() %>">
								<%= c.getCategoryName() %>
							</option>
							<% } %>
							
						</select>
						</div>
                        <div class="control-group">
                            <input value="<%= item.getImage1() %>" type="text" class="form-control"  name="image1" placeholder="image1"
                                required="required" data-validation-required-message="Please enter image" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input value="<%= item.getImage2() %>" type="text" class="form-control"  name="image2" placeholder="image2"
                                required="required" data-validation-required-message="Please enter image" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input value="<%= item.getImage3() %>" type="text" class="form-control"  name="image3" placeholder="image3"
                                required="required" data-validation-required-message="Please enter image" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input value="<%= item.getImage4() %>" type="text" class="form-control"  name="image4" placeholder="image4"
                                required="required" data-validation-required-message="Please enter image" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                        	 <textarea  class="form-control" rows="8" id="message" name="detail" placeholder="Detail"
                                required="required"
                                data-validation-required-message="Please enter detail"><%= item.getDetail() %></textarea>
                            <p class="help-block text-danger"></p>
                           
                        </div>
                        <div>
                            <button class="btn btn-primary py-2 px-4"  type="submit" >Update</button>
                        </div>
                    </form>
                </div>
            </div>
            

        </div>
    </div>
    <!-- Contact End -->


    <jsp:include page="Footer.jsp"></jsp:include>


    <!-- Back to Top -->
    <a href="#" class="btn btn-primary back-to-top"><i class="fa fa-angle-double-up"></i></a>


    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>

    <!-- Contact Javascript File -->
    <script src="mail/jqBootstrapValidation.min.js"></script>
    <script src="mail/contact.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>

</body>
</html>