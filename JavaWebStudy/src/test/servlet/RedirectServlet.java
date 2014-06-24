package test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RedirectServlet", urlPatterns = { "/redirect" })
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 6329340329134813596L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("redirect.jsp");
		try {
			
			dispatcher.forward(request, response);
		} catch(ServletException | IOException e) {
			System.out.println("Error at redirect: " + e.getMessage());
		}
	}
}
