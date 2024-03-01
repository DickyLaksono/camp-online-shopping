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
    
    <%
    	String mess = (String) request.getAttribute("mess");
    	if(mess == null){
    		mess = "";
    		
    	}
    %>
  </head>
  <body>
    <div class="bg-img">
      <div class="content">
        <header>Sign In Form</header>
        <div style="color:red; margin-bottom: 10px;"><%= mess %></div>
        <form action="LoginController"method="post">
          <div class="field">
            <span class="fa fa-user"></span>
            <input type="text" name="username" required placeholder="Username" />
          </div>
          <div class="field space">
            <span class="fa fa-lock"></span>
            <input type="password" name="password" class="pass-key" required placeholder="Password" />
            <span class="show">SHOW</span>
          </div>
          <div class="pass">
            <a href="#">Forgot Password?</a>
          </div>
          <div class="field">
            <input type="submit" value="SIGN IN" />
          </div>
        </form>
        <div class="login">Or Sign In with</div>
        <div class="links">
          <div class="facebook">
            <i class="fab fa-facebook-f"><span>Facebook</span></i>
          </div>
          <div class="instagram">
            <i class="fab fa-instagram"><span>Instagram</span></i>
          </div>
        </div>
        <div class="signup">
          Don't have account?
          <a href="SignUpController">Sign Up Now</a>
        </div>
      </div>
    </div>
    <script>
      const pass_field = document.querySelector(".pass-key");
      const showBtn = document.querySelector(".show");
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
    </script>
  </body>
</html>
