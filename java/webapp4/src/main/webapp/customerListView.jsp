<%@page import="aiwa.entity.Customor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	List<Customor> customers = (List<Customor>) request.getAttribute("customers");
%>
</head>
<body>
<table border="1">
	<tr>
		<td>ID</td>
		<td>NAME</td>
		<td>ADDRESS</td>
	</tr>
	<% for (Customor c : customers)   { %>
		<tr>
			<td><%= c.getCustomerId() %></td>
			<td><%= c.getCustomerName() %></td>
			<td><%= c.getAddress() %></td>
		</tr>
	
	<% }  %>
</table>

</body>
</html>