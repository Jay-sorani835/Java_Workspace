<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change</title>
</head>
<body>
<%
if(!(session.getAttribute("insta").equals(null)))
{
	String oldpass = request.getParameter("oldpass");
	String newpass = request.getParameter("newpass");
	String renewpass = request.getParameter("renewpass");
	String email = request.getParameter("email");

	if(newpass.equals(renewpass))
	{
		if(oldpass.equals(session.getAttribute("password").toString()))
		{
			int r = new Dao().changePass(session.getAttribute("email").toString(), newpass);
			if(r > 0)
			{
				response.sendRedirect("signin.jsp");
			}
		}
	}
}
else
{
	String oldpass = request.getParameter("oldpass");
	String newpass = request.getParameter("newpass");
	String renewpass = request.getParameter("renewpass");
	String email = request.getParameter("email");

	if(newpass == renewpass)
	{
		if(oldpass.equals(session.getAttribute("password").toString()))
		{
			int r = new Dao().changePass(email, newpass);
			if(r > 0)
			{
				response.sendRedirect("signin.jsp");
			}
		}
	}
}
%>
</body>
</html>