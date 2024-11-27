<%@ page import="com.dao.Dao" %>
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
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		int r = Dao.delete(id2);
		
		if(r>0)
		{
			response.sendRedirect("show.jsp");
		}
		else
		{
			
	%>
	<%} %>
</body>
</html>