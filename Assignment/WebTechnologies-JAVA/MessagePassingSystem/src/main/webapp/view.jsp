<%@page import="com.dao.MessageDao"%>
<%@page import="com.model.message"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-light bg-light justify-content-between">
   <img src="images/logo.png" width="200px" height="80px" class="d-inline-block align-top" alt="">
    <div class="navbar-brand">Message Application</div>
	<a href="dashboard.jsp" class="btn btn-outline-success">Home Page</a>
  <a href="logout.jsp" class="btn btn-outline-danger my-2 my-sm-0">Logout</a>
</nav>
<div id="sendmsg">
<div id="viewmsg">
<table class="table table-success table-striped-columns">

<thead>
<tr>
	<th>ID</th>
	<th>From</th>
	<th>Message</th>
	<th>Action</th>
</tr>
</thead>
<tbody>
<%  
	List<message> list = new MessageDao().getMessagesForUser(session.getAttribute("email").toString());
	for(message m : list)
	{
%>
<tr>
<td><%=m.getM_id() %></td>
<td><%=m.getFrom() %></td>
<td><%=m.getMsg() %></td>
<td>
	<form action="reply.jsp" method="POST" style="display:flex;">
		<input type="hidden" name="to" value="<%=m.getFrom() %>">
		<input type="hidden" name="from" value="<%=m.getTo() %>">
		<input type = "text" name="msg">
		<button type="submit" class="reply-button">Reply</button>
	</form>
</td>	
</tr>
<% } %>
</tbody>
</table>
</div>
</body>
</html>