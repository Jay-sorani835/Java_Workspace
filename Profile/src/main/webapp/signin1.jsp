<%@page import="com.dao.Dao"%>
<%@page import="com.model.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String email = request.getParameter("email");
	String pass = request.getParameter("password");
	
	Model m = new Model();
	m.setEmail(email);
	m.setPass(pass);
	
	Dao.signin(m);
	response.sendRedirect("profile.jsp");
	%>
	
</body>
</html>