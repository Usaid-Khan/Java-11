import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;


public class MyServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");		
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Start of include request</h1>");
		out.flush();
		
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/includeservlet");
		rd.include(req, res);
		
		out.println("<h1>End of include request</h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}
