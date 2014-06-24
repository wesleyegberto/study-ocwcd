package test.servlet;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="CookieServlet",urlPatterns={"/cookie_test"})
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 4850672873043239168L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
		
		Cookie cke = new Cookie("message", "Hello from a Cookie!");
		cke.setMaxAge(-1); // will stay alive until browser exits
		response.addCookie(cke);
		
		try(PrintWriter pw = response.getWriter()) {
			pw.write("A cookie was sent!<br/>Your list of cookies:<br/><br/>");
			Cookie cks[] = request.getCookies();

			pw.write("<table border=\"1\"><tr><th>Name</th><th>Value</th></tr>");
			for(Cookie ck : cks) {
				pw.write("<tr><td>" + ck.getName() + "</td><td>" + ck.getValue() + "</td></tr>");
			}
			pw.write("</table>");
		} catch(Exception ex) {
			
		}
	}
}
