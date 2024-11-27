<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Message Passing System</title>
<style type="text/css">
/* Global Styling */
* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    color: #333;
}

body {
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
a:hover {
	background-color: #45a049;
	color: white;
}
</style>
</head>
<body>
	
	<form action="register.jsp">
	<h2>Registration</h2>
		<label>First Name : </label>
		<input type="text" name="fname" required>
		<label>Last Name : </label>
		<input type="text" name="lname" required>
		<label>Email : </label>
		<input type="email" name="email" required>
		<label>Mobile : </label>
		<input type="tel" name="mobile" required>
		<button type="submit">Submit</button><br>
		<p>Have an Account!<a href="signin.jsp">Sign In</a></p>
	</form>
</body>
</html>