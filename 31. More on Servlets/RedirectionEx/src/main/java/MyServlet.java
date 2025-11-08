import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String id = req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		
		if(id.equals("ali") && pwd.equals("vu"))
		{
			res.sendRedirect("welcome.html");
		}
		else if(id.equals("error") && pwd.equals("error"))
		{
			res.sendError(res.SC_PROXY_AUTHENTICATION_REQUIRED, "Send Error Demo");
		}
		else
		{
			res.sendRedirect("register.html");
		}
	}
}
