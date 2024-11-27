package com.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.sql.rowset.serial.SerialBlob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.Bo;
import com.model.User;

@WebServlet("/UserRegister")
@MultipartConfig(maxFileSize = 16177216)
public class UserRegServlet extends HttpServlet
{
	ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
	Bo bo = (Bo) con.getBean("bo");

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Part p = request.getPart("image");
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phoneNo= request.getParameter("mobile");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");
		String pro;
		try {
		
			pro = convertPartToString(p);
			InputStream io = p.getInputStream();
			byte[] blob = pro.getBytes();
			Blob profile = new SerialBlob(blob);
			
			if(password.equals(cpassword))
			{		
				User u = new User();
				u.setUFIRSTNAME(fname);
				u.setULASTNAME(lname);
				u.setUEMAIL(email);
				u.setUMOBILE(phoneNo);
				u.setUGENDER(gender);
				u.setUPASSWORD(password);
				u.setUPRO_PIC(profile);

				int id = bo.Insert(u);
				System.out.println(id);
				response.sendRedirect("Userlogin.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private String convertPartToString(Part part) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        try (InputStream inputStream = part.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
