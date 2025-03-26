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
	<hr>
	
	1. el 태그 이름: ${username}<br>
	2. el 태그 나이: <%= request.getAttribute("age") %><br>
	3. el 태그 dto: <%= request.getAttribute("login") %><br>
	<hr>
	
	4. req.getAttribute: <%= request.getAttribute("username") %><br>
	5. req.getParam: <%= request.getParameter("username") %><br>
	<hr>
	
	6. session: <%= request.getSession() %><br>
	
</body>
</html>