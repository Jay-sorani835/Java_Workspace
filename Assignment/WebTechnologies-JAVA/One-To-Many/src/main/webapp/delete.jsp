<%@page import="com.model.Items"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.connect.Util"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.dao.Dao"%>
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
	String id = request.getParameter("id");
	int id2 = Integer.parseInt(id);
	Session sess = new Util().getConnect();
	Transaction tr = sess.beginTransaction();
	Items item = sess.get(Items.class, id2);
	sess.delete(item);
	tr.commit();
	sess.close();
	response.sendRedirect("view.jsp");
%>

</body>
</html>