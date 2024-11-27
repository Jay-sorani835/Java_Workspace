<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="com.model.Subscription"%>
<%@page import="com.model.Reader"%>
<%@page import="com.controller.Dao"%>
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
	Reader reader = new Dao().view(Integer.parseInt(request.getParameter("id")));
	Set<Subscription> set = new HashSet<>();
	reader.setSubscriptions(set);
	new Dao().delete(reader);
	response.sendRedirect("view.jsp");
%>
</body>
</html>