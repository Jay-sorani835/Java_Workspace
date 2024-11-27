<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="com.bo.Bo"%>
<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<%
	ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
	Bo bo = (Bo)acm.getBean("bo");

	User u1 = bo.getSingle(session.getAttribute("email").toString());
%>
<div>
<p>First Name : <%=u1.getUFIRSTNAME() %></p>
<p>Last Name : <%=u1.getULASTNAME() %></p>
<p>Email : <%=u1.getUEMAIL() %></p>
<p>Gender : <%=u1.getUGENDER() %></p>
<p>Mobile : <%=u1.getUMOBILE() %></p>
<p>Password : <%=u1.getUPASSWORD() %></p>
<img src="getImage?id=<%=u1.getId() %>" alt="Image from Database">
<a href="edit.jsp?id=<%=u1.getId() %>" ><img src="Images/edit.png" width="30px" heigth="30px" ></a>
</div>
<img src="http://localhost:8082/SpringORM/getImage?id=1" alt="Image">
</body>
</html>