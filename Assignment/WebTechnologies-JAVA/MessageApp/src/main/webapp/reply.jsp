
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send a Message</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        h2 {
            margin-bottom: 20px;
            color: #333;
        }
        label {
            display: block;
            margin-bottom: 8px;
            color: #555;
        }
        input[type="text"],
        textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache");
if(session.getAttribute("messageapp") != null)
{
%>
    <div class="container">
        <h2>Send a Message</h2>
        <form action="sendMessage.jsp" method="get">
            <label for="recipient">To:</label>
            <input type="text" id="recipient" name="recipientEmail" value="<%=request.getParameter("semail") %>" required>

            <label for="subject">Subject:</label>
            <input type="text" id="subject" name="subject" value="" required>

            <label for="message">Message:</label>
            <textarea id="message" name="message" rows="6" value="" required></textarea>

            <input type="submit" value="Send">
        </form>
    </div>
    <% } 
    session.setAttribute("count", 1);
    %>
</body>
</html>
