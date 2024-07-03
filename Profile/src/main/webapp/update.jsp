<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Base64"%>
<%@page import="java.io.InputStream"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.Model"%>
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
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String hobby = request.getParameter("hobby");
		String city = request.getParameter("city");
		String pass = request.getParameter("pass");
		
		%>
		<% 
		
			String usl = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String password = "";
			
			Part p = request.getPart("profileimage");
		
		try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(usl, user, pass);
				
				PreparedStatement ps = con.prepareStatement("update profile set fname=?, lname=?, email=?, phone=?, hobby=?, city=?, gender=?, pass=?, image=? where id=?");
				
				InputStream io = p.getInputStream();
				
				ps.setString(1,fname);
				ps.setString(2,lname);
				ps.setString(3,email);
				ps.setString(4,mobile);
				ps.setString(5,hobby);
				ps.setString(6,city);
				ps.setString(7,gender);
				ps.setString(8,pass);
				ps.setBlob(9, io);
				ps.setInt(10, id2);
				int status = ps.executeUpdate();
				
				response.sendRedirect("profile.jsp");
		}
		catch(Exception e)
		{
			
		}
		
		
		%>
				
</body>
</html>