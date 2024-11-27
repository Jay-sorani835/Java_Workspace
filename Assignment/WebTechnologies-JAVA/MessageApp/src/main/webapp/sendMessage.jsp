<%@page import="com.dao.Dao"%>
<%@page import="com.model.MailModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Message Sending</title>
</head>
<body>
	<%
		String semail = session.getAttribute("email").toString();
		String remail = request.getParameter("recipientEmail");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
		
		session.setAttribute("semail", semail);
		session.setAttribute("remail", remail);
		session.setAttribute("message", message);
		session.setAttribute("subject", subject);
		
		response.sendRedirect("MessageSendingServlet");
	%>
</body>
</html>