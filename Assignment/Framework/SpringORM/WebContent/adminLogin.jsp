<%@page import="java.util.List"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.Admin"%>
<%@page import="com.bo.Bo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
	<%
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Bo bo = (Bo)acm.getBean("bo");
		Admin a = new Admin();
		a.setEmail(email);
		a.setPassword(password);
		Admin admin = bo.getAdmin(a);
		if(admin.getEmail().equals(email) && admin.getPassword().equals(password))
		{
			response.sendRedirect("AdminDashboard.jsp");
		}
	%>
</body>
</html>