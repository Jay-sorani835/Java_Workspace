import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Servlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		resp.setContentType("text/html");
		
		String ps,reps;
		ps = req.getParameter("pass");
		reps = req.getParameter("repass");
		
		if(reps.equals(ps))
		{
			String fname = req.getParameter("firstname");
			String lname= req.getParameter("lastname");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			String gender = req.getParameter("gender");
			
			
			System.out.println(fname);
			System.out.println(lname);
			System.out.println(email);
			System.out.println(phone);
			System.out.println(gender);
			
			resp.sendRedirect("welcome.jsp");
		}
		else
		{
			resp.sendRedirect("index.jsp");
		}
	}
}
