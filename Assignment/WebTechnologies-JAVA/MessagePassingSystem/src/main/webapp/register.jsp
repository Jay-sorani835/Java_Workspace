<%@page import="com.dao.UserDao"%>
<%@page import="com.model.user"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<%
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		user u = new user();
		u.setFname(fname);
		u.setLname(lname);
		u.setEmail(email);
		u.setMobile(mobile);
		
		int r = new UserDao().addUser(u);
		if(r > 0)
		{
			response.sendRedirect("signin.jsp");
		}
		
		
	%>
</body>
</html>