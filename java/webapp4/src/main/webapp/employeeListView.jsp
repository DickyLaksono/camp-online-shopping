<%@page import="java.util.List"%>
<%@page import="aiwa.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
%>

<style>
	body{
		background-image:url("https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG_4SPDMEJAVjoxj_RdyVMJCkk8syvH_TSlkPoPOMeV8aqtI3wehGqGHzcCDRqNfU4YPYgDgWd1uwhltmmXQd8YnHVkrY0mCvs3DMhYhfiNjvDW8xiMFn3jywjSKpVgfGLODGtUsD1NhQEpiANz1EN9yDFGEDoxnt9MHyVFlFE5wBCOBETPEo5L3VShgs4tVoDOOm5UG6PnH5CaApWSt20zMhzoBb4Q3RuXCsPNlQGC_pcLB-wrhhwKq7mWlrwCrcaTg8Ek8plsJFa3qBN9dPjKL4JxcYjP_KcFRt2K3Mi8NvbQp7TSi_JdTQYCucNh7E785ieth5j7MO6eSzU23UJ8DfTiBcnNs3BRPzbJ5TRDpufkXgIRmm86NcaAHppUk34H6x1u7PE3hFj1tQl9OenK0=/pngtree-mountain-mountain-range-reflected-in-the-water-image_2934349.jpg?errorImage=false");
	}


</style>


</head>
<body>

<table border="3" cellpadding ="20" cellspacing="0" align="center" style="margin-top: 50px;">
	<tr style="background-color:#228B22 ">
		<td>ID</td>
		<td>NAME</td>
		<td>EMAIL</td>
	</tr>
	<% for (Employee e : employees ) { %>
	<tr style="background-color:aqua ">
		<td><%= e.getEmployeeId() %></td>
		<td><%= e.getEmployeeName() %></td>
		<td><%= e.getEmail() %></td>
	</tr>
	<% } %>

</table>

</body>
</html>