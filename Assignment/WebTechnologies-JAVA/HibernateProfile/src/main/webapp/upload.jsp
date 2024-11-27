<%@page import="com.dao.Dao"%>
<%@page import="java.io.InputStream"%>
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
	String email = session.getAttribute("email").toString();
	String fileData = request.getParameter("fileData");
	String fileName = request.getParameter("fileName");
	
	int r = new Dao().uploadImg(fileData, fileName, email);
	if(r > 0)
	{
		response.sendRedirect("dashboard.jsp");
	}
	else
	{
		response.sendRedirect("error.html");
	}
%>
</body>
</html>