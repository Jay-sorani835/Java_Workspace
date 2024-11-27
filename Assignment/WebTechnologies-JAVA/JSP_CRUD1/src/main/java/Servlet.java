import java.io.IOException;
import java.io.PrintWriter;

import com.dao.Dao;
import com.model.SignupModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Servlet extends HttpServlet
{

	String firstname, lastname, email, mobile, password, gender;
	@Override
	 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		firstname = req.getParameter("fname");
		lastname = req.getParameter("lname");
		email = req.getParameter("email");
		mobile = req.getParameter("phone");
		password = req.getParameter("pass");
		gender = req.getParameter("gender");
		
		SignupModel m = new SignupModel();
		m.setFname(firstname);
		m.setLname(lastname);
		m.setEmail(email);
		m.setPhone(mobile);
		m.setGender(gender);
		m.setPass(password);
		
		int status = Dao.register(m);
		if(status>0)
		{
			resp.sendRedirect("show.jsp");
		}
		else
		{
			out.print("Registration Failed");
		}
	}
	
}
