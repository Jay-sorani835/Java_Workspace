<%@page import="java.util.List"%>
<%@page import="com.bo.Bo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
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
	
	ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
	Bo bo = (Bo)acm.getBean("bo");
	
	User u = new User();
	u.setUEMAIL(email);
	User u1 = bo.getSingle(email);
	if(u1.getUEMAIL().equals(email) && u1.getUPASSWORD().equals(password))
	{
	session.setAttribute("id", u1.getId());
	session.setAttribute("email", u1.getUEMAIL());		
	response.sendRedirect("dashboard.jsp");
	}
%>
</body>
</html>