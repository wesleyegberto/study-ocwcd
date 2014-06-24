package test.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="JstlIndexServlet",urlPatterns={"/jstl_index"})
public class JstlIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 4850672873043239168L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		switch(id) {
			case 1:
				request.setAttribute("a", 1);
				request.setAttribute("b", 2);
				request.setAttribute("c", 3);
				request.getRequestDispatcher("jstl/if.jsp").forward(request, response);
				break;
			case 2:
				request.setAttribute("a", 1);
				request.getRequestDispatcher("jstl/choose_when_otherwise.jsp").forward(request, response);
				break;
			case 3:
				List<String> list = new ArrayList<String>();
				list.add("Item");
				list.add("Another item");
				list.add("A item");
				list.add("Another");
				request.setAttribute("list", list);
				request.getRequestDispatcher("jstl/foreach.jsp").forward(request, response);
				break;
			case 4:
				request.setAttribute("a", 1);
				request.getRequestDispatcher("jstl/set.jsp").forward(request, response);
				break;
		}
	}
}
