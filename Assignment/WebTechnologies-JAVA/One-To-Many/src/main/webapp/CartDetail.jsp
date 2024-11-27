<%@page import="com.model.Cart"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.connect.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart Details</title>
</head>
<body>
	<%
		String cartName = session.getAttribute("name").toString();
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		List<Cart> list = sess.createQuery("from Cart where name='"+ cartName +"'").list();
		for(Cart c : list)
		{
			session.setAttribute("id", c.getCartId());
		}
			response.sendRedirect("view.jsp");
	%>
</body>
</html>