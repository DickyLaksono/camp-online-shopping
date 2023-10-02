<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<%
	String d1 = (String) request.getAttribute("d1");
	String d2 = (String) request.getAttribute("d2");
	String answer = (String) request.getAttribute("answer");
	
	
	
	
%>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Test1Controller">
		<input type="number" name="data1">
		<input type="number" name="data2">
		<input type="submit" value="request">
	</form>

	<h1><%= d1 %> + <%= d2 %> = <%= answer %></h1>
	
</body>
</html>