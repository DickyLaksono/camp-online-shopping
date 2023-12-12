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
    	String mess1 = (String) request.getAttribute("mess1");
    	String mess2 = (String) request.getAttribute("mess2");
    %>
  </head>
  <body>
    <div class="bg-img">
      <div class="content">
        <header>Sign Up Form</header>
        <form action="SignUpController"method="post">
          <div class="field">
            <span class="fa fa-user"></span>
            <input type="text" name="username" required placeholder="Username" />
          </div>
          <div class="field space">
            <span class="fa fa-user"></span>
            <input type="email" name="email" required placeholder="Email" />
          </div>
          <div class="field space">
            <span class="fa fa-lock"></span>
            <input type="password" name="password" class="pass-key" required placeholder="Password" />
            <span class="show">SHOW</span>
          </div>
          <div class="field space">
            <span class="fa fa-lock"></span>
            <input type="password" name="repeat" class="pass-key" required placeholder="Password" />
            <span class="show">SHOW</span>
          </div>
          <div class="pass">
            <a href="#">Forgot Password?</a>
          </div>
          <div class="field">
            <input type="submit" value="SIGN UP" />
          </div>
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
        <div class="signup" style="margin-top:20px;">
          Already have an account?
          <a href="LoginController">Sign In</a>
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
