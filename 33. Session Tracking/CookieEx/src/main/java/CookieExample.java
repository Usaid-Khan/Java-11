import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieExample extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Cookie Example</h2>");
		
		String msg = "";
		boolean repeatVisitor = false;
		
		//Searching for cookie -- repeat
		Cookie cookies[] = req.getCookies();
		if(cookies != null)
		{
			for(Cookie c : cookies)
			{
				String name = c.getName();
				String val = c.getValue();
				
				if(name.equals("repeat") && val.equals("yes"))
				{
					msg = "Welcome Back!";
					repeatVisitor = true;
					break;
				}
			}
		}
		
		if(repeatVisitor == false)
		{
			Cookie c = new Cookie("repeat", "yes");
			c.setMaxAge(240);
			res.addCookie(c);
			msg = "Welcome Abroad!";
		}
		
		out.println("<h2>" + msg + "</h2>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}
