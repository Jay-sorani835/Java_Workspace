package com.controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/getImage")
public class GetImage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String dbUrl = "jdbc:mysql://localhost:3306/spring-orm";
        String dbUser = "root";
        String dbPassword = "";

        String imageId = request.getParameter("id");

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String query = "SELECT UPRO_PIC FROM User WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(imageId));

            ResultSet resultSet = statement.executeQuery();
            System.out.println("Fetching image with ID: " + imageId);
            if (resultSet.next()) {
                Blob imageBlob = resultSet.getBlob("UPRO_PIC");
                System.out.println("Image Blob Length: " + imageBlob.length());
            } else {
                System.out.println("No image found for ID: " + imageId);
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error retrieving image");
        }
    }
}
