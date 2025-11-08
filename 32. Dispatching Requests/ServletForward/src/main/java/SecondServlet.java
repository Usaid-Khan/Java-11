import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String salary = req.getParameter("salary");
		String tax = (String)req.getAttribute("tax");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Second Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Welcome " + name + "</h1>");
		out.println("<h3>Your salary: " + salary + "</h3>");
		out.println("<h3>Your tax: " + tax + "</h3>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}
