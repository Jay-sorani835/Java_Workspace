package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter
{

	@Override
	public void destroy()
	{
		// TODO Auto-generated method stub
		System.out.println("DESTROY Called");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain arg2)
			throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
	
		String username = req.getParameter("username");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		
		if(username.equalsIgnoreCase("")||password.equalsIgnoreCase(""))
		{
			
			out.println("All feilds are mandetary");
			req.getRequestDispatcher("index.html").include(req,resp);
		}
		else if(username.equalsIgnoreCase(null)||password.equalsIgnoreCase(null))
		{
			
			out.println("Feilds are not  getting value ");
			req.getRequestDispatcher("index.jsp").include(req,resp);
		}
		else if(password.equals("admin")) 
		{
			arg2.doFilter(req,resp);
			
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("INIT Called");
	}

}
