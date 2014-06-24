package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = -813706414982212168L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		response.setHeader("Content-Type", "text/html");
		try {
			PrintWriter pw = response.getWriter();
			pw.write("<html><head><title>Home Servlet</title></head>");
			pw.write("<body><p><h3>Welcome to Home Servlet by GET</h3></p>");
			pw.write("<br/>by: " + getServletConfig().getInitParameter("author") + "</body>");
			pw.write("</html>");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		response.setHeader("Content-Type", "text/html");
		try {
			PrintWriter pw = response.getWriter();
			pw.write("<html><head><title>Home Servlet</title></head>");
			pw.write("<body><p><h3>Welcome to Home Servlet by POST</h3></p>");
			pw.write("<br/>by: " + getServletConfig().getInitParameter("author") + "</body>");
			pw.write("</html>");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
