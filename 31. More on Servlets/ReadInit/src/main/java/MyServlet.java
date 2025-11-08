import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;


public class MyServlet extends HttpServlet {
	private String fileName;
	
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		
		fileName = config.getInitParameter("logfilename");
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.println(fileName);
	}
}
