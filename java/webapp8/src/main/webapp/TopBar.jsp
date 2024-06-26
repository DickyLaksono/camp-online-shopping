<%@page import="aiwa.entity.account"%>
<%@page import="aiwa.entity.Category"%>
<%@page import="aiwa.entity.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
   <%
	//List<Item> keyword = (List<Item>) request.getAttribute("keyword");
    String word = (String) request.getAttribute("word");
    if(word == null){
    	word = "";
    }
	List<Item> items = (List<Item>) request.getAttribute("items");
	
	List<Item> featured = (List<Item>) request.getAttribute("featured");
	List<Item> recent = (List<Item>) request.getAttribute("recent");
	List<Category> categories = (List<Category>) request.getAttribute("category");
	
	String username = (String) session.getAttribute("username");
	account a = (account) session.getAttribute("a");
	
	Item item = (Item) request.getAttribute("item");
    %>

<!-- Topbar Start -->
    <div class="container-fluid">
        <div class="row bg-secondary py-1 px-xl-5">
            <div class="col-lg-6 d-none d-lg-block">
                <div class="d-inline-flex align-items-center h-100">
                    <a class="text-body mr-3" href="">About</a>
                    <a class="text-body mr-3" href="">Contact</a>
                    <a class="text-body mr-3" href="">Help</a>
                    <a class="text-body mr-3" href="">FAQs</a>
                </div>
            </div>
            <div class="col-lg-6 text-center text-lg-right">
                <div class="d-inline-flex align-items-center">
                    <div class="btn-group mx-2">
                    	<% if(a != null) { %>
	                    	<% if (username != null) { %>
	                    		<% if(a.getIsAdmin() == 1) { %>
			                        <button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown"><i class="bi bi-person-lock"></i> <%= username %></button>
			                        <div class="dropdown-menu dropdown-menu-right">
				                            <a href="LoginController"><button class="dropdown-item" type="button">Sign in</button></a>
				                            <!-- <a href="SignUpController"><button class="dropdown-item" type="button">Sign Up</button></a> -->
				                            <a href="SignUpController"><button class="dropdown-item" type="button">Setting</button></a>
				                            <a href="LogoutController"><button class="dropdown-item" type="button">Logout</button></a>
				                    </div>
	                    		<% } if (a.getIsAdmin() == 0){ %>
	                    			<button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown"><i class="bi bi-person-check"></i> <%= username %></button>
			                        <div class="dropdown-menu dropdown-menu-right">
				                            <a href="LoginController"><button class="dropdown-item" type="button">Sign in</button></a>
				                            <a href="SignUpController"><button class="dropdown-item" type="button">Setting</button></a>
				                            <a href="LogoutController"><button class="dropdown-item" type="button">Logout</button></a>
				                    </div>
	                    		<% } %>
	                    	<% } %>
                    	<% } else { %>
                    
	                    <button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown"><i class="bi bi-people"></i> Account</button>
	                        <div class="dropdown-menu dropdown-menu-right">
	                            <a href="LoginController"><button class="dropdown-item" type="button">Sign in</button></a>
	                            <a href="SignUpController"><button class="dropdown-item" type="button">Sign Up</button></a>
	                        </div>
                    	<% } %>
                    	
	                </div>
	                
	                <% if(a != null) {%>
	                <% if(a.getIsAdmin() == 1) { %>
	                <div class="btn-group mx-2">
	                <button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown">Help</button>
	                        <div class="dropdown-menu dropdown-menu-right">
	                            <a href="ItemInsertController"><button class="dropdown-item" type="button">New Record</button></a>
	                            <% if (item != null) { %>
	                            <a href="ItemUpdateController?itemid=<%= item.getItemId() %>"><button class="dropdown-item" type="button">Update</button></a>
	                            <a href="ItemDeleteController?itemid=<%= item.getItemId() %>"><button class="dropdown-item" type="button">Delete</button></a>
	                            <% } %>
	                        </div>
	                 </div>
	                 <% } %>
	                 <% } %>
                    
                    <div class="btn-group mx-2">
                        <button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown">USD</button>
                        <div class="dropdown-menu dropdown-menu-right">
                            <button class="dropdown-item" type="button">EUR</button>
                            <button class="dropdown-item" type="button">GBP</button>
                            <button class="dropdown-item" type="button">CAD</button>
                        </div>
                    </div>
                    <div class="btn-group mx-2">
                        <button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown">EN</button>
                        <div class="dropdown-menu dropdown-menu-right">
                            <button class="dropdown-item" type="button">FR</button>
                            <button class="dropdown-item" type="button">AR</button>
                            <button class="dropdown-item" type="button">RU</button>
                        </div>
                    </div>
                </div>
                <div class="d-inline-flex align-items-center d-block d-lg-none">
                    <a href="" class="btn px-0 ml-2">
                        <i class="fas fa-heart text-dark"></i>
                        <span class="badge text-dark border border-dark rounded-circle" style="padding-bottom: 2px;">0</span>
                    </a>
                    <a href="" class="btn px-0 ml-2">
                        <i class="fas fa-shopping-cart text-dark"></i>
                        <span class="badge text-dark border border-dark rounded-circle" style="padding-bottom: 2px;">0</span>
                    </a>
                </div>
            </div>
        </div>
        <div class="row align-items-center bg-light py-3 px-xl-5 d-none d-lg-flex">
            <div class="col-lg-4">
                <a href="ItemListController" class="text-decoration-none">
                    <span class="h1 text-uppercase text-primary bg-dark px-2">Camp</span>
                    <span class="h1 text-uppercase text-dark bg-primary px-2 ml-n1">Shop</span>
                </a>
            </div>
            <div class="col-lg-4 col-6 text-left">
                <form action="ItemAllController">
                    <div class="input-group">
                        <input type="text" id="k" class="form-control" placeholder="Search for products" name="keyword" value="<%=word %>">
                        <div class="input-group-append">
                            <span class="input-group-text bg-transparent text-primary">
                                <i class="fa fa-search"></i>
                            </span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-lg-4 col-6 text-right">
                <p class="m-0">Customer Service</p>
                <h5 class="m-0">+012 345 6789</h5>
            </div>
        </div>
    </div>
    <!-- Topbar End -->