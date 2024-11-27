<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert Cart and Items</title>
</head>
<body>
    <h2>Insert Cart and Items</h2>
    <form action="Add.jsp" method="post">
        <fieldset>
            <legend>Cart Details</legend>
            <input type="hidden" name="id" value="<%=session.getAttribute("id").toString() %>">
            <label for="name">Cart Name:</label>
            <input type="text" id="name" name="name" value="<%=session.getAttribute("name").toString() %>" required>
            <br><br>
        </fieldset>
        <br>
        <fieldset>
            <legend>Item Details</legend>
            <table id="itemsTable" border="1">
                <thead>
                    <tr>
                        <th>Item ID</th>
                        <th>Item Total</th>
                        <th>Quantity</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="text" name="itemId" placeholder="Item ID" required></td>
                        <td><input type="text" name="itemTotal" placeholder="Item Total" step="0.01" required></td>
                        <td><input type="text" name="quantity" placeholder="Quantity" required></td>
                    </tr>
                </tbody>
            </table>
            <br>
           </fieldset>
        <br>
        <input type="submit" value="Save">
    </form>
</body>
</html>
