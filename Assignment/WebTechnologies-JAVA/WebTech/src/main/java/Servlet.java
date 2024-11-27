import java.io.IOException;
import java.io.PrintWriter;

import com.model.Model;

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
		
		firstname = req.getParameter("firstname");
		lastname = req.getParameter("lastname");
		email = req.getParameter("email");
		mobile = req.getParameter("phone");
		password = req.getParameter("pass");
		gender = req.getParameter("gender");
		
		Model m = new Model();
		m.setFirstname(firstname);
		m.setLastname(lastname);
		m.setEmail(email);
		m.setMobile(mobile);
		m.setPassword(password);
		m.setGender(gender);
		
		out.println("Registerd Successfuly");
		
		System.out.println("First Name : "+firstname + "\n");
		System.out.println("last Name : "+lastname + "\n");
		System.out.println("Email : "+email + "\n");
		System.out.println("Mobile : "+mobile + "\n");
		System.out.println("Password : "+password + "\n");
		
		
		if("male".equals(gender))
		{
			System.out.println("Gender : " + gender);
			
		}
		else
		{
			System.out.println("Gender : " + gender);
			
		}
	}
}
