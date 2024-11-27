package com.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.util.Util1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 1073741824)
public class uploadServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Part p = req.getPart("image");
		String email = req.getParameter("email");
		String time = req.getParameter("time");
		Connection con = Util1.getconnect();
		if(p!=null && !time.equals(null))
		{
			try 
			{
				PreparedStatement ps = con.prepareStatement("insert into image (image, email, time) values (?,?,?)");
				InputStream io = p.getInputStream();
				ps.setBlob(1, io);
				ps.setString(2, email);
				ps.setString(3, time);
				
				int status = ps.executeUpdate();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			resp.sendRedirect("dashboard.jsp");
		}
		else
		{
			System.out.println(p);
		}
	}
}
