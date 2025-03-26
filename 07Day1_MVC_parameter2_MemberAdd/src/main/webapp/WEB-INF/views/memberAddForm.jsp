<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>memberAddForm</h1>
	<form action="memberAdd3" method="post">
		post방식
		<hr>
		이름:<input type="text" name="name" required="required"><br>
		나이:<input type="text" name="age"  maxlength="4"><br>
		메일:<input type="text" name="address"  maxlength="4"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>