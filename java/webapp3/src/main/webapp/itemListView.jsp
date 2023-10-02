<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<%
	String name =(String) request.getAttribute("n");
	int age = (int)request.getAttribute("a");
%>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>こんにちは</h1>
	<h1><%= name%></h1>
	<h1><%= age %></h1>
	
	
</body>
</html>