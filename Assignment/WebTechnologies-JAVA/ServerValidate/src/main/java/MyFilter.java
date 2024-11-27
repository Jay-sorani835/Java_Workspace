
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
		String password = req.getParameter("password");
		String confirmpass = req.getParameter("confirmPass");
		
		String namePattern = "^[a-zA-Z]*$";
		String validate = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%_&]).*$";
		
		if(password.equals(confirmpass)) {
		
			if(fname.equalsIgnoreCase("")||lname.equalsIgnoreCase("")||email.equalsIgnoreCase("")||phone.equalsIgnoreCase("")||password.equalsIgnoreCase(""))
			{
				
				out.println("All feilds are mandetary");
				req.getRequestDispatcher("index.jsp").include(req,resp);
			}
			else if(fname.equalsIgnoreCase(null)||lname.equalsIgnoreCase(null)||email.equalsIgnoreCase(null)||phone.equalsIgnoreCase(null)||password.equalsIgnoreCase(null))
			{
				
				out.println("Feilds are not  getting value .");
				req.getRequestDispatcher("index.jsp").include(req,resp);
			}
			else if(!(fname.matches(namePattern)))
			{
				out.println("First Name Contains only Alphabets.");
				req.getRequestDispatcher("index.jsp").include(req, resp);
			}
			else if(!(lname.matches(namePattern)))
			{
				out.println("Last Name Contains Only Alphabets.");
				req.getRequestDispatcher("index.jsp").include(req, resp);
			}
			else if(password.matches(validate))
			{
				arg2.doFilter(req, resp);
			}		
			else
			{
				out.println("password format doesn't match");
				req.getRequestDispatcher("index.jsp").include(req, resp);
			}
		}
		else
		{
			out.print("Password and confirm Password are not same.");
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("INIT Called");
	}

}
