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
	LoginDTO dto = (LoginDTO)request.getAttribute("login");
%>
<body>
	<h1>login2</h1>
	id: ${ login.getUserid() }
	pw: ${ login.getPasswd() }
	<%= dto.getUserid() %>
	<%= dto.getPasswd() %>
</body>
</html>