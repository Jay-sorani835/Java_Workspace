<%@page import="com.dao.Dao"%>
<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
</head>
<body>
<%
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	
	User u = new Dao().getUserByEmail(email,password);
	if(u != null)
	{
		if(u.getEmail().equals(email) && u.getPassword().equals(password))
		{
			session.setAttribute("email", email);
			session.setAttribute("password", password);
			session.setAttribute("insta", true);
			response.sendRedirect("dashboard.jsp"); 		
		}	
	}
	else
	{
		response.sendRedirect("404.html");
	}
%>
</body>
</html>