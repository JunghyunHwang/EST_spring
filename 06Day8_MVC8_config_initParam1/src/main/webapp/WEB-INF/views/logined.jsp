<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>logined</h1>
	환영합니다. <%= request.getParameter("password") %>
	<a href="main">홈으로</a>
</body>
</html>