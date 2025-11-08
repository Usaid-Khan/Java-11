import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String fName = req.getParameter("firstName");
		String sName = req.getParameter("surName");
		
		PrintWriter out = res.getWriter();
		out.println("Hello " + fName + " " + sName);
		
		out.close();
	}
}
