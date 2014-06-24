package test.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.pojo.Warrior;

@WebServlet(name = "WarriorServlet", urlPatterns = { "/warrior" })
public class WarriorServlet extends HttpServlet {
	private static final long serialVersionUID = 2414019522549445437L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		ServletContext sc = getServletContext();
		Warrior warrior = (Warrior) sc.getAttribute("warrior");

		resp.setHeader("Content-type", "text/html");
		try {
			resp.getWriter().println("Warrior: " + warrior.getType());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
