import java.io.IOException;

import com.dao.Dao;
import com.model.SignupModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String id = req.getParameter("editid");
		int id2 = Integer.parseInt(id);
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String password = req.getParameter("password");
		
		SignupModel m = new SignupModel();
		m.setFname(fname);
		m.setLname(lname);
		m.setEmail(email);
		m.setPhone(phone);
		m.setGender(gender);
		m.setPass(password);
		m.setId(id2);
		
		try {
			int status = Dao.editdata(m);
			if(status > 0)
			{
				resp.sendRedirect("show.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
