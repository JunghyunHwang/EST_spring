<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>loginForm</h1>
	<form action="login" method="post">
		post 방식 <br>
		아이디: <input type="text" name="userid"><br>
		비밀번호: <input type="text" name="password"><br>
		<input type="submit" value="로그인">
	</form>
	<hr>
	
	<form action="login" method="get">
		get 방식<br>
		아이디: <input type="text" name="userid"><br>
		비밀번호: <input type="text" name="password"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>