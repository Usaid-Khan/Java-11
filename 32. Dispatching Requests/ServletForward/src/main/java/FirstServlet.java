import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		int sal = Integer.parseInt(req.getParameter("salary"));
		int tax = (int)(sal * 0.15);
		String taxValue = tax + "";
		
		req.setAttribute("tax", taxValue);
		
		ServletContext sContext = getServletContext();
		RequestDispatcher rd = sContext.getRequestDispatcher("/secondservlet");
		rd.forward(req, res);
	}
}
