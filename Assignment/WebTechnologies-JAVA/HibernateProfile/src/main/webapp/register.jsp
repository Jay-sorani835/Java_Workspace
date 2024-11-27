<%@page import="com.dao.*"%>
<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<%
	String fname = request.getParameter("firstname");
	String lname = request.getParameter("lastname");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	String password = request.getParameter("password");
	String gender = request.getParameter("gender");
	
	User u = new User();
	u.setFname(fname);
	u.setLname(lname);
	u.setEmail(email);
	u.setMobile(mobile);
	u.setPassword(password);
	u.setGender(gender);
	
	new Dao().insert(u);
	response.sendRedirect("signin.jsp");
%>
</body>
</html>