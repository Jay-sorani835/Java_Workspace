<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome To Technothon</title>
</head>
<body>

	<h1>Welcome <%= request.getParameter("fname") %> <%= request.getAttribute("lname") %></h1>
</body>
</html>