<%@page import="com.dao.Dao"%>
<%@page import="com.model.SignupModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile</title>
</head>
<body>
	<%
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		SignupModel m = new SignupModel();
		m.setEmail(email);
		m.setUsername(username);
		m.setPassword(password);
		
		new Dao().Update(m);
		
		response.sendRedirect("dashboard.jsp");
	%>
</body>
</html>