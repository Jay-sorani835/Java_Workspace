<%@page import="com.dao.Dao"%>
<%@page import="com.model.Address"%>
<%@page import="com.model.student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>

<% 
	String name = request.getParameter("name");
	String street = request.getParameter("street");
	String city = request.getParameter("city");
	String state = request.getParameter("state");
	String zip_code = request.getParameter("zip_code");
	
	Address a = new Address();
	a.setStreet(street);
	a.setCity(city);
	a.setState(state);
	a.setZip_code(zip_code);
	
	student s = new student();
	s.setName(name);
	s.setAddress(a);
	
	new Dao().insert(a, s);
	response.sendRedirect("view.jsp");
	
	
%>

</body>
</html>