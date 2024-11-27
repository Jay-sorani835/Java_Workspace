<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Dashboard</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background-color: #f0f0f0;
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

    .container {
      padding: 20px;
    }

    .dashboard-content {
      text-align: center;
      padding: 50px;
      background-color: white;
      border-radius: 8px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      max-width: 600px;
      margin: 50px auto;
    }

    .dashboard-content h2 {
      margin-bottom: 20px;
    }

    .dashboard-content p {
      font-size: 18px;
      margin-bottom: 30px;
    }

    .btn {
      background-color: #4CAF50;
      color: white;
      border: none;
      padding: 10px 15px;
      cursor: pointer;
      border-radius: 5px;
      font-size: 16px;
      text-decoration: none;
    }

    .btn.logout {
      background-color: #f44336;
    }

    .btn:hover {
      opacity: 0.9;
    }

  </style>
</head>
<body>

  <div class="navbar">
    <h1>Dashboard</h1>
    <div class="menu">
      <a href="edit.jsp">Edit Profile</a>
      <a href="logout.jsp" class="btn logout">Logout</a>
    </div>
  </div>

  <div class="container">
    <div class="dashboard-content">
      <h2>Welcome to Your Dashboard</h2>
      <p>Here you can manage your profile and see other personalized content.</p>

      <a href="edit.jsp" class="btn">Go to Edit Profile</a>
      <a href="message.jsp" class="btn">Send Messages</a>
      <a href="view.jsp" class="btn">Go to View Messages</a>
    </div>
  </div>  
</body>
</html>
