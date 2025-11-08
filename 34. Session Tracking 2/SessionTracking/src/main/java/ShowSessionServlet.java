import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowSessionServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String heading;
		
		res.setContentType("text/html");
		
		HttpSession session = req.getSession(true);
		Integer accessCount = (Integer)session.getAttribute("sessionCount");
		
		if(accessCount == null)
		{
			accessCount = 1;
			heading = "Welcome, Newcomer";
		}
		else
		{
			accessCount = accessCount + 1;
			heading = "Welcome Back!";
		}
		
		session.setAttribute("sessionCount", accessCount);
		
		PrintWriter out = res.getWriter();
		
		out.println("<html>" + 
		            "<body>" + 
				    "<h1>Session Tracking Example</h1>" + 
		            "<h2>Information on your session</h2>" + 
				    "<h3>Session ID: " + session.getId() + "</h3>" + 
				    "<h3>Number of previous accesses: " + accessCount + "</h3>" + 
				    "</body>" + 
				    "</html>");
		
		out.close();
	}
}
