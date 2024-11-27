<%@page import="org.hibernate.sql.Insert"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.connect.Util"%>
<%@page import="org.hibernate.Session"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.Items"%>
<%@page import="com.model.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%double total = 0.0;
	String itemId = request.getParameter("itemId");
	int itemTotal = Integer.parseInt(request.getParameter("itemTotal"));
	int quantity = Integer.parseInt(request.getParameter("quantity"));
	int id = Integer.parseInt(session.getAttribute("id").toString());
	
	Cart cart = new Cart();
	
	
	Items item = new Items();
	item.setItemId(itemId);
	item.setItemTotal(itemTotal);
	item.setQuantity(quantity);
	
	Session sess = new Util().getConnect();
	Transaction tr = sess.beginTransaction();
	sess.persist(item);
	List<Cart> list = sess.createQuery("select total from Cart where cartId='"+id+"'").list();
	for(Cart c : list)
	{
		total = c.getTotal();
	}
	total += itemTotal;
	sess.createQuery("update cart set total='"+total+"' where cartId='"+id+"'");
	tr.commit();
	sess.close();
	response.sendRedirect("view.jsp");
%>
</body>
</html>