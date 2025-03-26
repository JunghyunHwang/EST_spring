<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script>
		$(document).ready(function() {
			$("#eee").on("click", function() {
				$.ajax({
					type: "post",
					url: "eee",
					data: {
						userid: "사토루",
	                    passwd: "1234"
	                },
					dataType: "text",
					success: function(data, status, xhr) {
						console.log(data);
					},
					error: function(xhr, status, e) {
						console.log("error", e);
						console.log("xhr", xhr.status);
						$("#result").text("데이터를 가져올 수 없습니다.");
					}
				});
			});
			
			$("#ddd").on("click", function() {
				$.ajax({
					type: "post",
					url: "ddd",
					data: {
						userid: "사토루"
	                },
					dataType: "text",
					success: function(data, status, xhr) {
						console.log("success: ", data);
					},
					error: function(xhr, status, e) {
						console.log(data);
						console.log("xhr", xhr.status);
						$("#result").text("데이터를 가져올 수 없습니다.");
					}
				});
			});
			
			$("#ccc").on("click", function() {
				$.ajax({
					type: "get",
					url: "ccc",
					data: {
						userid: "사토루",
	                    passwd: "1234"
	                },
					dataType: "text",
					success: function(data, status, xhr) {
						console.log(data);
					},
					error: function(xhr, status, e) {
						console.log("error", e);
						console.log("xhr", xhr.status);
						$("#result").text("데이터를 가져올 수 없습니다.");
					}
				});
			});
			
			$("#aaa").on("click", function() {
				$.ajax({
					type: "post",
					url: "aaa",
					headers: {
						"Content-Type": "application/json"
					},
					data: JSON.stringify({"userid": "사토루", "passwd": "1234"}),
					dataType: "text",
					success: function(data, status, xhr) {
						console.log(data);
					},
					error: function(xhr, status, e) {
						console.log("error", e);
						console.log("xhr", xhr.status);
						$("#result").text("데이터를 가져올 수 없습니다.");
					}
				});
			});
			
			$("#bbb").on("click", function() {
				$.ajax({
					type: "post",
					url: "aaa",
					headers: {
						"Content-Type": "application/json"
					},
					data: JSON.stringify(
							[
								{"userid": "사토루", "passwd": "1111"},
								{"userid": "스구루", "passwd": "2222"}
							]
					),
					dataType: "text",
					success: function(data, status, xhr) {
						console.log(data);
					},
					error: function(xhr, status, e) {
						console.log("error", e);
						console.log("xhr", xhr.status);
						$("#result").text("데이터를 가져올 수 없습니다.");
					}
				});
			});
		});
	</script>
</head>
<body>
	<h1>main</h1>
	<button id="aaa">aaa호출</button><br>
	<button id="bbb">bbb호출</button><br>
	<button id="ccc">ccc호출</button><br>
	<button id="ddd">ddd호출</button><br>
	<button id="eee">eee호출</button><br>
	<div id="result"></div>
</body>
</html>