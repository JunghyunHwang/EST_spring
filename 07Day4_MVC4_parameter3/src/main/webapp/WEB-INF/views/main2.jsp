<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	ArrayList<String> result = (ArrayList<String>)request.getAttribute("list");
%>
<body>
	<h1>main</h1>
	${ xxx }<br>
</body>
</html>