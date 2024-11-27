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
String role = request.getParameter("role");
	if(role.equals("Admin"))
	{
		response.sendRedirect("adminReg.jsp");
	}
	else if(role.equals("User"))
	{
		response.sendRedirect("userReg.jsp");
	}
	else
	{
		out.print("<p>Please select role first</p>");
		response.sendRedirect("index.jsp");
	}
%>
</body>
</html>