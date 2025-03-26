<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Main</h1>
	<a href="login">로그인</a><br>
	<a href="main">main</a><br>
	<a href="hello/login">hello/login</a><br>
	<a href="/hello/login">/hello/login</a><br>
	<a href="/app/hello/login">/app/hello/login</a><br>
	<a href="../hello/login">../hello/login</a><br>
	<a href="<%= request.getContextPath() %>/hello/login">Context</a><br>
</body>
</html>