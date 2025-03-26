<%@page import="com.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	LoginDTO dto = (LoginDTO)request.getAttribute("xxx");
%>
<body>
	<h1>login3</h1>
	id: ${ login.getUserid() }<br>
	pw: ${ login.getPasswd() }<br>
	<hr>
	
	xxx.id: ${ xxx.userid }<br>
	xxx.pw: ${ xxx.passwd }<br>
	<hr>
	<%= dto.getUserid() %><br>
	<%= dto.getPasswd() %><br>
</body>
</html>