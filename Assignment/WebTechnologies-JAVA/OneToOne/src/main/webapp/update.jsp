<%@page import="com.model.Address"%>
<%@page import="com.model.student"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>

<%
	String id = request.getParameter("id");
	int id2 = Integer.parseInt(id);
	String name = request.getParameter("name");
	String street = request.getParameter("street");
	String city = request.getParameter("city");
	String state = request.getParameter("state");
	String Zip_code = request.getParameter("zip_code");
	
	
	
	Address a = new Address();
	a.setStreet(street);
	a.setCity(city);
	a.setState(state);
	a.setZip_code(Zip_code);
	
	student s = new student();
	s.setName(name);
	s.setAddress(a);
	
	new Dao().update(a, s, id2);
	response.sendRedirect("view.jsp");

%>


</body>
</html>