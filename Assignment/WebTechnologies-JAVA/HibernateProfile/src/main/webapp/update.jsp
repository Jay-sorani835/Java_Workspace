<%@page import="com.dao.Dao"%>
<%@page import="com.model.User"%>
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
response.setHeader("Cache-Control", "no-cache");
response.setHeader("cache-control", "no-store");
response.setHeader("pragma", "no-cache");
response.setDateHeader("Expires", 0);
if(!session.getAttribute("insta").equals(null))
{
	String fname = request.getParameter("firstname");
	String lname = request.getParameter("lastname");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	String gender = request.getParameter("gender");
	
	User u = new User();
	u.setFname(fname);
	u.setLname(lname);
	u.setEmail(email);
	u.setMobile(mobile);
	u.setGender(gender);
	
	int r = new Dao().update(u,session.getAttribute("email").toString());
	if(r > 0){
		response.sendRedirect("view.jsp");
	}
}
else
{
	response.sendRedirect("signin.jsp");
}

%>
</body>
</html>