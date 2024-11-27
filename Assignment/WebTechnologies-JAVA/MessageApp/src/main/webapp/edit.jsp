<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Edit Profile</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }

    .container {
      background-color: white;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      width: 350px;
    }

    h2 {
      text-align: center;
      margin-bottom: 20px;
    }

    label {
      display: block;
      margin: 10px 0 5px;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"] {
      width: 100%;
      padding: 8px;
      margin-bottom: 15px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }

    .buttons {
      display: flex;
      justify-content: space-between;
      align-items: center;
    }

    .btn {
      background-color: #4CAF50;
      color: white;
      border: none;
      padding: 10px 15px;
      cursor: pointer;
      border-radius: 5px;
      font-size: 16px;
    }

    .btn.logout {
      background-color: #f44336;
    }

    .btn:hover {
      opacity: 0.8;
    }

    .message {
      text-align: center;
      margin-top: 10px;
    }
  </style>
</head>
<body>
  <div class="container">
    <h2>Edit Profile</h2>
    <form mehtod="post" action="EditProfile.jsp">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username" value="<%=session.getAttribute("name") %>" required>

      <input type="hidden" id="email" name="email" value="<%=session.getAttribute("email") %>" required>

      <label for="password">Password:</label>
      <input type="password" id="password" name="password" value="<%=session.getAttribute("password") %>" required>

      <div class="buttons">
        <button type="submit" class="btn save">Save</button>
        <a class="btn logout" href="logout.jsp">Logout</a>
      </div>
    </form>
    <div class="message"></div>
  </div>

  
</body>
</html>
