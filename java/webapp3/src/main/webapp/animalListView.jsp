<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="aiwa.entity.Animal"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%

	List<Animal> animals = (List<Animal>) request.getAttribute("animals");

%>

</head>
<body>	
	
	<h1>Animal List</h1>
	<table border = '1' style="text-align : center;">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>HEIGHT</th>
			<th>WEIGHT</th>
			<th>IMAGE</th>
		
		</tr>
		<% for(Animal animal : animals) { %>
		<tr>
			<td><%= animal.getId() %></td>
			<td><%= animal.getType() %></td>
			<td><%= animal.getHeight() %></td>
			<td><%= animal.getWeight() %></td>
			<td><img width =
			 '200px' src='<%= animal.getImage() %>'></td>
		</tr>
		<% }  %>
	
	
	</table>

</body>
</html>