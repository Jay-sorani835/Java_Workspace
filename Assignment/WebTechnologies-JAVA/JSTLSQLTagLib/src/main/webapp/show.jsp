<%@page import="java.util.List"%>
<%@ page import="com.dao.Dao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Data</title>
<style type="text/css">
body {
      font-family: Arial, sans-serif;
      background-color: #2422229a;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }

    .container {
      background-color: white;
      text-align: center;
      margin: 10px 0 5px;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      width: 350px;
    }
</style>
</head>
<body>

<%	
	request.setAttribute("list", Dao.getAll());
%>
<div class="container">
<p>Hello</p>
	 <c:forEach var="user" items="${list}">
			
            <p><b>Id : <c:out value="${user.id}"/></p>
            <p>Firstname : <c:out value="${user.firstname}"/></p>
            <p>Lastname : <c:out value="${user.lastname}"/></p>
            <p>Email : <c:out value="${user.email}"/></p>
            <p>Phone no. : <c:out value="${user.phone}"/></p>
            <p>Gender : <c:out value="${user.gender}"/></p>
            <p>Password : <c:out value="${user.password}"/></b></p>
	
	</c:forEach>
</div>
</body>
</html>