<%@page import="com.dao.MessageDao"%>
<%@page import="com.model.message"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.UserDao"%>
<%@page import="com.model.user"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<style type="text/css">
/* Global Styling */
* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    color: #333;
}

#sendmsg {
    background-color: #f9f9f9;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    padding: 20px;
}

h2 {
    color: #333;
    margin-bottom: 20px;
    font-size: 1.8rem;
}

/* Form Styling */
form {
    width: 100%;
    max-width: 400px;
    background-color: #fff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

label {
    font-weight: bold;
    color: #555;
    display: block;
    margin-top: 15px;
}

input[type="text"],
input[type="email"],
button {
    width: 100%;
    padding: 10px;
    margin-top: 5px;
    border: 1px solid #ddd;
    border-radius: 5px;
    font-size: 1rem;
}

input[type="text"]:focus,
input[type="email"]:focus {
    border-color: #4caf50;
    outline: none;
}

button {
    background-color: #4caf50;
    color: #fff;
    border: none;
    cursor: pointer;
    font-weight: bold;
    transition: background-color 0.3s;
}

button:hover {
    background-color: #45a049;
}

/* Table Styling */
table {
    width: 100%;
    max-width: 800px;
    margin-top: 20px;
    border-collapse: collapse;
    background-color: #fff;
    border-radius: 8px;
    overflow: hidden;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

th, td {
    padding: 12px 15px;
    text-align: left;
    border-bottom: 1px solid #f0f0f0;
}

th {
    background-color: #4caf50;
    color: #fff;
    text-transform: uppercase;
    font-size: 0.9rem;
}

tr:hover {
    background-color: #f1f1f1;
}

td {
    color: #555;
}

.reply-button {
    padding: 6px 10px;
    background-color: #4caf50;
    color: #fff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 0.9rem;
    transition: background-color 0.3s;
}

.reply-button:hover {
    background-color: #45a049;
}

/* Responsive Styling */
@media (max-width: 768px) {
    table, form {
        width: 100%;
    }

    th, td {
        padding: 10px;
    }
}

</style>
<body>


<!-- Image and text -->
<nav class="navbar navbar-light bg-light justify-content-between">
    <img src="images/logo.png" width="200px" height="80px" class="d-inline-block align-top" alt="">
	<a href="view.jsp">View Messages</a>
  <a href="logout.jsp" class="btn btn-outline-danger my-2 my-sm-0">Logout</a>
</nav>
<div id="sendmsg">
<%
	String email = request.getParameter("email");
	session.setAttribute("email", email);
	user u = new UserDao().getUserById(email);
%>
	<form action="sendmsg.jsp">
		<label>From : </label>
		<input type="email" name="from" value="<%=email %>" required>
		<label>To : </label>
		<input type="email" name="to" required>
		<label>Message : </label>
		<input type="text" name="msg" required>
		<button type="submit" class="btn btn-success">Send</button>
	</form>
</div>

</body>
</html>