
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

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
	
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String password = req.getParameter("pass");
		String repassword = req.getParameter("repass");
		
		
		if(fname.equalsIgnoreCase("")||lname.equalsIgnoreCase("")||email.equalsIgnoreCase("")||phone.equalsIgnoreCase("")||gender.equalsIgnoreCase("")||password.equalsIgnoreCase("")||repassword.equalsIgnoreCase(""))
		{
			
			out.println("All feilds are mandetary");
			req.getRequestDispatcher("index.jsp").include(req,resp);
		}
		else if(fname.equalsIgnoreCase(null)||lname.equalsIgnoreCase(null)||email.equalsIgnoreCase(null)||phone.equalsIgnoreCase(null)||gender.equalsIgnoreCase(null)||password.equalsIgnoreCase(null)||repassword.equalsIgnoreCase(null))
		{
			
			out.println("Feilds are not  getting value ");
			req.getRequestDispatcher("index.jsp").include(req,resp);
		}
		else if(repassword.equals(password)) 
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
