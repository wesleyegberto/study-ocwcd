package test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.pojo.Warrior;

@WebServlet(name="beanActionController", urlPatterns={"/beanActionController"})
public class BeanActionController extends HttpServlet {
	private static final long serialVersionUID = -298834983504236864L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// gets the parameters sent from form
		String name = request.getParameter("name"); 
		String type = request.getParameter("type"); 
		
		// creates the model
		Warrior warrior = new Warrior(name, type);
		// sets the model to request
		request.setAttribute("model", warrior); // the attribute's name will use at jsp:useBean
		
		// get RequestDispatcher to send the model to view JSP
		RequestDispatcher view = request.getRequestDispatcher("/el/bean_action_view.jsp");
		view.forward(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Warrior warrior = new Warrior("Superman", "superhero");
		request.setAttribute("name", "Superman");
		request.setAttribute("type", "superhero");
		request.setAttribute("model", warrior);
		
		RequestDispatcher view = request.getRequestDispatcher("/el/el_bean_action_view.jsp");
		view.forward(request, response);
	}
}
