<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Base64"%>
<%@page import="java.io.InputStream"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:useBean id="m" class="com.model.Model"/>
 <jsp:setProperty property="*" name="m"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
		
			System.out.print(m.getFirstname());
			
			int status = Dao.signup(m);
		
			if(status>0)
			{
				out.print("success");
			}
			else
			{
				out.print("fail");
			}
		
		
	
		%>
				
</body>
</html>