import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowPersonServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("pName");
		
		PersonDAO pDAO = new PersonDAO();
		PersonInfo person = pDAO.searchPerson(name);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Search Results</h1>");
		
		if(person != null)
		{
			out.println("<h3>" + person.toString() + "</h3>");
		}
		else
		{
			out.println("<h3>Sorry! No record found</h3>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}
}
