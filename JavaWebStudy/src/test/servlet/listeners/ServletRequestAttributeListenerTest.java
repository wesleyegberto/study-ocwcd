package test.servlet.listeners;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Servlet", urlPatterns={"/servlet_request_attribute_listener"})
public class ServletRequestAttributeListenerTest extends HttpServlet {
	private static final long serialVersionUID = 4125654591706688179L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Adding");
		request.setAttribute("Att1", "ValueAtt1");
		System.out.println("Updating");
		request.setAttribute("Att1", "NewValueAtt1");
		System.out.println("Removing");
		request.removeAttribute("Att1");
	}
}
