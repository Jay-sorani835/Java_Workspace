<%@page import="com.dao.MessageDao"%>
<%@page import="com.model.message"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
</head>
<body>
	<%
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String msg = request.getParameter("msg");
		
		message m = new message();
		m.setFrom(from);
		m.setTo(to);
		m.setMsg(msg);
		
		int r = new MessageDao().addMessage(m);
		if(r > 0)
		{
			response.sendRedirect("view.jsp");
		}
	%>
</body>
</html>