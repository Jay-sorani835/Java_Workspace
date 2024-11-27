<%@page import="com.model.Model"%>
<%@page import="com.dao.Dao"%>
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
	String phone = request.getParameter("phone");
	String password = request.getParameter("password");
	String confirmpass = request.getParameter("ConfirmPass");
	
	Model m = new Model();
	m.setFname(fname);
	m.setLname(lname);
	m.setEmail(email);
	m.setPhone(phone);
	m.setPassword(password);
	
	int r = Dao.register(m);
	if(r > 0)
	{
		response.sendRedirect("view.jsp");	
	}
	else
	{
		%>
		<br>
		<center>
				
				<b><p style="color:red;font-family: sans-serif; font-size: 25px;">Login Failed!! Please Try Again</p></b>
			</center>

			<br>
			<br>
		<%@ include file="index.jsp"%>
		<% 
	}
%>
</body>
</html>