<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	session.removeAttribute("insta");
	session.invalidate();
	response.setHeader("Cache-Control","no-store");
	response.sendRedirect("signin.jsp");
%>


</body>
</html>