import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingCartServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		
		HttpSession session = req.getSession(true);
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Shopping Cart Example 2</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Online Book Store for Rent</h1>");
		
		String eURL1 = res.encodeURL("http://localhost:8080/SessionTracking2/shoppingcart?book=first");
		String eURL2 = res.encodeURL("http://localhost:8080/SessionTracking2/shoppingcart?book=second");
		
		out.println(
				"<h2><a href=" + eURL1 + ">" + 
		        "Java Core Servlets</a></h2>" +
			    "<br>" +
		        
			    "<h2><a href=" + eURL2 + ">" +
			    "Java How to Program</a></h2>"
				);
		
		out.println("<br>");
		out.println("<h1>You have selected following books</h1>");
		out.println("<br>");
		
		//Retrieving parameter
		String book = req.getParameter("book");
		if(book != null)
		{
			if(book.equals("first"))
			{
				session.setAttribute("fBook", "Java Core Servlets");
			}
			else if(book.equals("second"))
			{
				session.setAttribute("sBook", "Java How to Program");
			}
		}
		
		printSessionInfo(out, session);
		
		out.println("</body>");
		out.println("</html>");
	}
	
	public void printSessionInfo(PrintWriter out, HttpSession session)
	{
		String title = "";
		
		title = (String)session.getAttribute("fBook");
		if(title != null)
		{
			out.println("<h2>" + title + "</h2>");
		}
		
		title = (String)session.getAttribute("sBook");
		if(title != null)
		{
			out.println("<h2>" + title + "</h2>");
		}
	}
}
