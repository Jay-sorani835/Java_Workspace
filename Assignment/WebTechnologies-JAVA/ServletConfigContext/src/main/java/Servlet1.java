
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */

public class Servlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	String email,driver;
	ServletConfig config;
	
	public void init(ServletConfig config) throws ServletException 
	{
		this.config=config;
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		email=config.getInitParameter("email");
		System.out.println(email);
		
	}

}
