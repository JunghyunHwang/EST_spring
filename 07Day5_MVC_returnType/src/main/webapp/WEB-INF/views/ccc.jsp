<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ccc</h1>
	<hr>
	${ loginDTO.userid }
	${ loginDTO.passwd }
	<hr>
	<%= request.getAttribute("loginDTO") %>
</body>
</html>