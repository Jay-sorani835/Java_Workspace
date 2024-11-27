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
<%
	String[] itemIds = request.getParameterValues("itemId");
	String[] itemTotals = request.getParameterValues("itemTotal");
	String[] quantities = request.getParameterValues("quantity");
	String cartName = request.getParameter("name");
	Cart cart = new Cart();
	cart.setName(cartName);
	int cartTotal = 0;
	
	Set<Items> set = new HashSet<>();
	for(int i = 0; i < itemIds.length;i++)
	{
		Items item = new Items();
		item.setItemId(itemIds[i]);
		item.setItemTotal(Integer.parseInt(itemTotals[i]));
		cartTotal += Double.parseDouble(itemTotals[i]);
		item.setQuantity(Integer.parseInt(quantities[i]));
		set.add(item);
		item.setCart(cart);
	}
	cart.setTotal(cartTotal);
	cart.setItems(set);
	new Dao().insert(cart);
	session.setAttribute("name", cartName);
	response.sendRedirect("CartDetail.jsp");
%>
</body>
</html>