<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	function doIt(){
		let n = $('#n').val();
		$.ajax({url:"Test2Controller?type=" + n}).done(function(data){
			$("#msg").text(data);

			});//callback //pada() 
	
}

</script>

</head>
<body>

<select id="n" onchange="doIt()">
	<option value="1">三浦</option>
	<option value="2">一宮</option>
	<option value="3">丸山</option>
</select>
<h1 id="msg">hallo</h1>
<input type="text">

<form action="TestController">
	<input type="submit" value="click">
</form>

<input type="button" value="ajax" onclick="doIt()">


</body>
</html>