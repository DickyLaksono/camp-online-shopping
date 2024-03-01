<%@page import="aiwa.entity.account"%>
<%@page import="aiwa.util.StringUtil"%>
<%@page import="aiwa.entity.Category"%>
<%@page import="aiwa.entity.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8" />
    <title>Transparent Login Form HTML CSS</title>
    <link rel="stylesheet" href="css/stylelogin.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
    <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
    <script src="https://ajaxzip3.github.io/ajaxzip3.js"></script>
    
    <%
    	String mess1 = (String) request.getAttribute("mess1");
    if(mess1 == null){
    	mess1 ="";
    }
    	String mess2 = (String) request.getAttribute("mess2");
    	 if(mess2 == null){
    	    	mess2 ="";
    	    }
    String mode = "insert";
    
    account a = (account) request.getAttribute("account");
    account loginUser = (account) session.getAttribute("a");
    if(loginUser != null){
    	mode = "update";
    	a = loginUser;
    	
    }
    
    %>
  </head>
  <body style="overflow:hidden;">
    <div class="bg-img" >
      <div class="content">
       <% if(mode.equals("update")) { %>
       <header>Setting Account</header>
       <% }else { %>
        <header>Sign Up Form</header>
       <% } %>
        <div style="color: red;"><%= mess1 %></div>
        <div style="color: red;"><%= mess2 %></div>
        <form action="SignUpController"method="post">
        <input type="hidden" name="mode" value="<%= mode %>">
        <% if(mode.equals("update")) { %>
        	<input type="hidden" name="id" value="<%= a.getId() %> ">
        <% } %>
          <div class="field">
            <span class="fa fa-user"></span>
            <input type="text" name="username" required placeholder="Username" value="<%= a != null ? a.getUser(): "" %>"/>
          </div>
          <div class="field space">
            <span class="fa fa-user"></span>
            <input type="email" class="" name="email" required placeholder="Email" value="<%= a != null ? a.getEmail(): "" %>" />
          </div>
          <div class="field space">
            <span class="fa fa-user"></span>
            <input type="tel" name="phone" required placeholder="Phone Number"/>
          </div>
          <div class="field space">
            <span class="fa fa-user"></span>
            <input type="text" name="zipcode" required placeholder="Zip Code" onKeyUp="AjaxZip3.zip2addr( this, '', 'pref', 'pref');" value="<%= a != null ? a.getZipcode(): "" %>"/>
          </div>
          <div class="field space">
            <span class="fa fa-user"></span>
            <input type="text" name="pref" required placeholder="Address"  value="<%= a != null ? a.getAddress(): "" %>"/>
          </div>
          <% if(!mode.equals("update")){ %>
          <div class="field space">
            <span class="fa fa-lock"></span>
            <input type="password" name="password" class="pass-key" required placeholder="Password" value="<%= a != null ? a.getPassword(): "" %>"/>
            <span class="show">SHOW</span>
          </div>
          <div class="field space">
            <span class="fa fa-lock"></span>
            <input type="password" name="repeat" class="pass-key" required placeholder="Repeat Password" />
            <span class="show">SHOW</span>
          </div>
          
          <% }%>
          <div class="field" style="margin-top:20px;">
            <input type="submit" value="<%= mode.equals("insert") ? "SIGN UP" : "SUBMIT" %>" />
          </div>
          
          <% if(mode.equals("update")) { %>
          <div class="field" style="width: 30%; margin-top: 10px; ">
            <input type="submit" value="↩ Back" onclick="history.back()" />
          </div>
	      <% } %>
        </form>
        <!-- 
        <div class="login">Or login with</div>
        <div class="links">
          <div class="facebook">
            <i class="fab fa-facebook-f"><span>Facebook</span></i>
          </div>
          <div class="instagram">
            <i class="fab fa-instagram"><span>Instagram</span></i>
          </div>
        </div>
         -->
         <% if(!mode.equals("update")) { %>
        <div class="signup" style="margin-top:20px;">
          Already have an account?
          <a href="LoginController">Sign In</a>
        </div>
         <% }%>
      </div>
    </div>
    <script>
      const pass_field = document.querySelector(".pass-key");
      const showBtn = document.querySelectorAll(".show");
      
      showBtn.addEventListener("click", function () {
        if (pass_field.type === "password") {
          pass_field.type = "text";
          showBtn.textContent = "HIDE";
          showBtn.style.color = "#3498db";
        } else {
          pass_field.type = "password";
          showBtn.textContent = "SHOW";
          showBtn.style.color = "#222";
        }
      });

      <!-- 
      const pass_field2 = document.querySelector(".pass-key2");
      const showBtn2 = document.querySelector(".show2");
      showBtn2.addEventListener("click", function () {
        if (pass_field2.type === "password") {
          pass_field2.type = "text";
          showBtn2.textContent = "HIDE";
          showBtn2.style.color = "#3498db";
        } else {
          pass_field2.type = "password";
          showBtn2.textContent = "SHOW";
          showBtn2.style.color = "#222";
        }
      });
      -->
    </script>
  </body>
</html>
