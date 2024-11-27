<%@page import="org.apache.catalina.core.ApplicationContext"%>
<%@page import="java.util.HashSet"%>
<%@page import="com.model.Items"%>
<%@page import="java.util.Set"%>
<%@page import="com.model.Cart"%>
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
	Items item = new Items();
	item.setItemTotal(Integer.parseInt(request.getParameter("itemTotal")));
	item.setQuantity(Integer.parseInt(request.getParameter("itemQuantity")));
	
	new Dao().updateItem(item, Integer.parseInt(request.getParameter("id")));
	response.sendRedirect("view.jsp");

%>


</body>
</html>