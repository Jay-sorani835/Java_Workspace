<%@page import="com.model.User"%>
<%@page import="com.bo.Bo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
	Bo bo = (Bo) acm.getBean("bo");
	String id = request.getParameter("id");
	int id2 = Integer.parseInt(id);
	User u = new User();
	u.setId(id2);
	bo.Delete(u);
	response.sendRedirect("AdminDashboard.jsp");
%>
</body>
</html>