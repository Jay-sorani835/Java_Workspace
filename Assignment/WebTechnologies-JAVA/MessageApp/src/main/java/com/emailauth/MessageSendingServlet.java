package com.emailauth;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;

import com.dao.Dao;
import com.model.MailModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/MessageSendingServlet")
public class MessageSendingServlet extends HttpServlet
{
	String resultMessage = "";
	private String host;
	private String port;
	private String user;
	private String pass;

	
	@Override
	public void init() throws ServletException
	{
		// TODO Auto-generated method stub
		//super.init();
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		HttpSession sess = req.getSession();
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String email1 = sess.getAttribute("remail").toString();
		Object recipient = email1;
		String data = (String) recipient;
		
		String subject = sess.getAttribute("subject").toString();
		
		String email = sess.getAttribute("semail").toString();
		
		String content = sess.getAttribute("message").toString();
		//System.out.println(recipient);
		//System.out.println(recipient);
	
		try 
		{
			EmailUtility.sendEmail(host, port, user, pass, data, subject,content, email);
		
			
			Connection con = null;
			int status = 0;
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","");
				PreparedStatement ps = con.prepareStatement("insert into sent(semail, remail, subject, message) values (?,?,?,?)");
				ps.setString(1, sess.getAttribute("semail").toString());
				ps.setString(2, sess.getAttribute("remail").toString());
				ps.setString(3, sess.getAttribute("subject").toString());
				ps.setString(4, sess.getAttribute("message").toString());
				
				status = ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			//RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			//req.setAttribute("fname","abcd");
			//rd.forward(req, resp);
			//resp.sendRedirect("otpverify.jsp");
			if(status > 0)
			{
				resp.sendRedirect("view.jsp");
			}
		} 
		catch (AddressException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (MessagingException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resultMessage = "The e-mail was sent successfully";
		
		
		
	}
}
