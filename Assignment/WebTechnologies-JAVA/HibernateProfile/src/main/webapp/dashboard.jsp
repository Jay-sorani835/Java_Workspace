<%@page import="com.dao.Dao"%>
<%@page import="com.model.ImageModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hibernate Insta</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style type="text/css">
/* Style the image container */
.image-container {
  position: relative;
  display: inline-block;
}

/* Hide the dropdown menu initially */
.dropdown-menu {
  display: none;
  position: absolute;
  top: 100%; /* Position it below the image */
  left: 0;
  background-color: #fff;
  box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);
  z-index: 1;
  padding: 10px;
  min-width: 150px;
}

/* Dropdown menu items */
.dropdown-menu a {
  color: #333;
  padding: 8px 12px;
  text-decoration: none;
  display: block;
}

/* Show the dropdown menu on hover */
.image-container:hover .dropdown-menu {
  display: block;
}

/* Optional: Add hover effect for menu items */
.dropdown-menu a:hover {
  background-color: #ddd;
}
* {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        /* Container for the Instagram post */
        .post-container {
            width: 400px;
            margin: 20px auto;
            border: 1px solid #dbdbdb;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
        }

</style>

</head>
<body>

<% response.setHeader("Cache-Control", "no-cache"); 
response.setHeader("cache-control", "no-store");
response.setHeader("pragma", "no-cache");
response.setDateHeader("Expires", 0);
if(!session.getAttribute("insta").equals(null))
{
%>
<nav class="navbar navbar-light bg-light justify-content-between">
    <img src="images/logo.jpg" width="100px" height="60px" class="d-inline-block align-top" alt="">
	<a href="uploadimg.jsp" class="btn btn-outline-success" style="align-items: center;">Upload Image</a>
    <div class="image-container">
	 <img src="images/profile.jpg" width="150px" height="60px" class="rounded-circle" alt="" id="profile">
	  <div class="dropdown-menu">
	    <a href="view.jsp">view Profile</a>
		<a href="editProfile.jsp">Change Profile</a>
		<a href="forgotPass.jsp">Change Password</a>
		<a href="logout.jsp">Logout</a>
	  </div>
	 </div>
</nav>
<% 
	List<ImageModel> list = Dao.getAllImage(session.getAttribute("email").toString());
	for(ImageModel m : list)
	{
		%>
		<div>
            <img src="data:image/jpeg;base64,<%=m.getImage()%>" width="150px" height="200px" />
            <p id="date"><%=m.getTime() %></p>
        </div>
		<% 
	}
}
else
{
	response.sendRedirect("signin.jsp");
}

%>
</body>
</html>