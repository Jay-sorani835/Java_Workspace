<%@page import="com.model.MailModel"%>
<%@page import="com.dao.Dao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Message</title>
<style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      margin: 0;
      padding: 0;
      display:flex;
      flex-direction:column;
      background-color: #f0f0f0;
    }

    table {
   	 align-item: center;
   	 justify-content: center;
      border-collapse: collapse;
      width: 60%;
      background-color: white;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }

    th, td {
      border: 1px solid #ddd;
      padding: 15px;
      text-align: left;
    }

    th {
      background-color: #4CAF50;
      color: white;
    }

    td {
      font-size: 16px;
    }

    .link-col {
      text-align: center;
      background-color: #f9f9f9;
    }

    .link-col a {
      display: block;
      text-decoration: none;
      color: #4CAF50;
      font-weight: bold;
      font-size: 18px;
      padding: 50px;
      height: 100%;
      line-height: 200px; /* Vertically center the link */
    }

    .link-col a:hover {
      background-color: #4CAF50;
      color: white;
      transition: background-color 0.3s ease;
    }
    .navbar {
      background-color: #4CAF50;
      padding: 10px;
      color: white;
      display: flex;
      justify-content: space-between;
      align-items: center;
    }

    .navbar h1 {
      margin: 0;
    }

    .navbar .menu {
      display: flex;
      gap: 15px;
    }

    .navbar a {
      color: white;
      text-decoration: none;
      font-size: 18px;
    }

    .navbar a:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>
<div class="navbar">
    <h1>Dashboard</h1>
    <div class="menu">
      <a href="dashboard.jsp">Go to Dashboard</a>
    </div>
  </div>
<%

	String email = session.getAttribute("email").toString();


List<MailModel> list = Dao.getMSG(email);
for(MailModel m : list)
{
 %>		

<table style="align-content: center; align-items: center;">

    <tr>
      <th>Details</th>
      <th>Action</th>
    </tr>
    
    <tr>
      <td>Sender Email : <%=m.getSemail() %></td>
      <td rowspan="4" class="link-col"><a href="reply.jsp?semail=<%=m.getSemail() %>">Reply</a></td>
    </tr>
    <tr>
      <td>Receiver Email : <%=m.getRemail() %></td>
    </tr>
    <tr>
      <td>Subject : <%=m.getSubject() %></td>
    </tr>
    <tr>
      <td>Message : <%=m.getMessage() %></td>
    </tr>
  </table>
<% 
} %>
</body>
</html>