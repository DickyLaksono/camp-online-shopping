<%@page import="aiwa.util.StringUtil"%>
<%@page import="aiwa.entity.Category"%>
<%@page import="aiwa.entity.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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
    
    <!-- bootstrap v5 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    
    <script
  		src="https://code.jquery.com/jquery-3.7.1.js">
    </script>
    
    <script>
		function change(id) {
			window.location.href ="CartChangeController?itemid="+ itemid + "&quantity=" + $("#quantity" + itemid).val();
		}
		
		
	
    </script>
    <%
	
     String word = (String) request.getAttribute("word");
	List<Item> items = (List<Item>) request.getAttribute("items");
	
	List<Item> featured = (List<Item>) request.getAttribute("featured");
	List<Item> recent = (List<Item>) request.getAttribute("recent");
	List<Category> categories = (List<Category>) request.getAttribute("category");
	
	String username = (String) session.getAttribute("username");
	List<Item> cart =  (List<Item>) session.getAttribute("cart");
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
                    
                    <span class="breadcrumb-item active">Shopping Cart</span>
                </nav>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->


    <!-- Cart Start -->
    <div class="container-fluid">
        <div class="row px-xl-5">
            <div class="col-lg-8 table-responsive mb-5">
                <table class="table table-light table-borderless table-hover text-center mb-0">
                    <thead class="thead-dark">
                        <tr>
                            <th>Products</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total</th>
                            <th>Remove</th>
                        </tr>
                    </thead>
                    <% int total = 0; %>
                    <% int shipping = 550; %>
                    <% if ( cart == null || cart.size() == 0) {%>
                    
                    <% }else {  %>
                    <tbody class="align-middle a">
                    	<% for(Item i : cart) { %>
	                        <tr>
	                            <td class="align-middle "><img src="<%= i.getImage1() %>" alt="" style="width: 50px;"> <%= i.getItemName() %></td>
	                            <td class="align-middle">￥<%= StringUtil.toMoney(i.getPrice())   %></td>
	                            <td class="align-middle">
	                                <div class="input-group quantity mx-auto" style="width: 100px;">
	                                    <div class="input-group-btn">
	                                        <a href="CartRemoveController?itemid=<%= i.getItemId() %>"><button class="btn btn-sm btn-primary btn-minus" >
	                                        <i class="fa fa-minus"></i>
	                                        </button></a>
	                                    </div>
	                                 
	                                    <input type="text" id="quantity<%= i.getItemId() %>" onchange="change(<%= i.getItemId() %>)" class="form-control form-control-sm bg-secondary border-0 text-center" value="<%= i.getQuantity() %>">
	                                    
	                                    <div class="input-group-btn">
	                                        <a href="ItemCartController?itemid=<%= i.getItemId() %>"><button class="btn btn-sm btn-primary btn-plus">
	                                            <i class="fa fa-plus"></i>
	                                        </button></a>
	                                    </div>
	                                    
	                                </div>
	                            </td>
	                            <td class="align-middle">￥<%= StringUtil.toMoney(i.getSubTotal())%></td>
	                            <td class="align-middle"><a href="CartRemoveController?all=all&&itemid=<%= i.getItemId() %>"><button class="btn btn-sm btn-danger remove"><i class="fa fa-times"></i></button></a></td>
	                            <% total += i.getSubTotal();%>
	                        </tr>
                        <% } %>
                    </tbody>
                    
                    <% } %>
                   
                    
                </table>
            </div>
            <div class="col-lg-4">
                <form class="mb-30" action="">
                    <div class="input-group">
                        <input type="text" class="form-control border-0 p-4" placeholder="Coupon Code">
                        <div class="input-group-append">
                            <button class="btn btn-primary">Apply Coupon</button>
                        </div>
                    </div>
                </form>
                <h5 class="section-title position-relative text-uppercase mb-3"><span class="bg-secondary pr-3">Cart Summary</span></h5>
                <div class="bg-light p-30 mb-5">
                    <div class="border-bottom pb-2">
                        <div class="d-flex justify-content-between mb-3">
                            <h6>Subtotal</h6>
                            <h6>￥<%= StringUtil.toMoney(total) %></h6>
                        </div>
                        <div class="d-flex justify-content-between">
                            <h6 class="font-weight-medium">Shipping</h6>
                            <% if (total >= 3000 || total == 0) { %>
                            <h6 class="font-weight-medium">￥ --</h6>
                            <%}else { %>
                            <h6 class="font-weight-medium">￥ <%= shipping %></h6>
                            <% } %>
                        </div>
                    </div>
                    <div class="pt-2">
                        <div class="d-flex justify-content-between mt-2">
                            <h5>Total</h5>
                            <% if (total >= 3000 || total == 0) { %>
                            	<h5><%= StringUtil.toMoney(total )  %></h5>
                            <% }else{ %>
                            	<h5><%= StringUtil.toMoney(total + shipping)  %></h5>
                            <%} %>
                        </div>
                        <a href="OrderInsertController"><button class="btn btn-block btn-primary font-weight-bold my-3 py-3">Proceed To Checkout</button></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Cart End -->


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
    
    <!--  -->
 
</body>

</html>