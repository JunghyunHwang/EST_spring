<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#get").click(function() {
				$.ajax({
					type: "get",
					url: "board",
					dataType: "text",
					success: function(data, status, xhr) {
						console.log(data, "success");
					},
					error: function(xhr, status, error) {
						console.log(error);
					}
				});
			});
			
			$("#post").click(function() {
				$.ajax({
					type: "post",
					url: "board",
					dataType: "text",
					success: function(data, status, xhr) {
						console.log(data, "success");
					},
					error: function(xhr, status, error) {
						console.log(error);
					}
				});
			});
			
			$("#delete").click(function() {
				$.ajax({
					type: "delete",
					url: "board",
					dataType: "text",
					success: function(data, status, xhr) {
						console.log(data, "success");
					},
					error: function(xhr, status, error) {
						console.log(error);
					}
				});
			});
			
			$("#put").click(function() {
				$.ajax({
					type: "put",
					url: "board",
					dataType: "text",
					success: function(data, status, xhr) {
						console.log(data, "success");
					},
					error: function(xhr, status, error) {
						console.log(error);
					}
				});
			});
			
			$("#patch").click(function() {
				$.ajax({
					type: "patch",
					url: "board",
					dataType: "text",
					success: function(data, status, xhr) {
						console.log(data, "success");
					},
					error: function(xhr, status, error) {
						console.log(error);
					}
				});
			});
		});
	</script>
</head>
<body>
	<h1>main.jsp</h1>
	<hr>
	<button id="get">get</button><br>
	<button id="post">post</button><br>
	<button id="put">put</button><br>
	<button id="delete">delete</button><br>
	<button id="patch">patch</button><br>
</body>
</html>