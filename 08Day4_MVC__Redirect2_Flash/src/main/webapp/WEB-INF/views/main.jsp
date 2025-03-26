<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main.jsp</h1>
	<hr>
	<h1>1. ${ userid }</h1>
	<h1>2. reuqest.getAttribute: <%= request.getAttribute("userid") %></h1>
	<h1>3. ${ param.userid }</h1>
	<h1>4. request.getParameter: <%= request.getParameter("userid") %></h1>
	<hr>
	<%= request.getAttribute("passwd") %><br>
	<%= request.getParameter("passwd") %>
</body>
</html>