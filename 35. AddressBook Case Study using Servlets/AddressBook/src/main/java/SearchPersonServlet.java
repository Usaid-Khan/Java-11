import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchPersonServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<html>" + 
		            "<body>" +
				    "<h1>Address Book</h1>" +
		            "<form action=http://localhost:8080/AddressBook/searchperson/showperson >" +
				    "<h2>Enter name to search</h2> <br>" +
		            "<input type=text name=pName > <br>" +
				    "<input type=submit value=Search >" +
		            "</form>" +
				    "</body>" +
		            "</html>");
		
		out.close();
	}
}
