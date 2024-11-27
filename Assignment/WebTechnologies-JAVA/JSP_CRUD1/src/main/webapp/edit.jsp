<%@page import="com.dao.Dao"%>
<%@page import="com.model.SignupModel"%>
<%@page import="java.util.List"%>
<%@page %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Profile</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <style>
        .edit-profile-container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #f7f7f7;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        .edit-profile-title {
            text-align: center;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<%
String id = request.getParameter("id");
int id2 = Integer.parseInt(id);
List<SignupModel>list = Dao.view(id2);
for(SignupModel m : list)
{
%>
    <div class="container">
        <div class="edit-profile-container">
            <h2 class="edit-profile-title">Edit Profile</h2>
            <form action="update" method="post">
            <input type="hidden" name="id" value="<%=id2 %>">
                <div class="form-group">
                    <label for="firstName">First Name</label>
                    <input type="text" class="form-control" id="fname" name="fname" value="<%=m.getFname() %>" required>
                </div>
                <input type="hidden" name="editid" value="<%=m.getId()%>">
                <div class="form-group">
                    <label for="lastName">Last Name</label>
                    <input type="text" class="form-control" id="lname" name="lname" value="<%=m.getLname() %>" required>
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" name="email" value="<%=m.getEmail() %>" required>
                </div>
                <div class="form-group">
                    <label for="phone">Phone</label>
                    <input type="tel" class="form-control" id="phone" name="phone" value="<%=m.getPhone() %>" required>
                </div>
                <div class="form-group">
                    <label for="gender">Gender</label>
                    <select class="form-control" id="gender" name="gender" <%=m.getGender() %> required>
                        
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                        <option value="Other">Other</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="password" name="password" value="<%=m.getPass() %>" required>
                </div>
                <button type="submit" class="btn btn-primary btn-block">Update Profile</button>
            </form>
        </div>
    </div>
    <%
	}
    %>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
