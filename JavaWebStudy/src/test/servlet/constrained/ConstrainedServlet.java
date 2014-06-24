package test.servlet.constrained;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ConstrainedServlet", urlPatterns = { "/security/constrained_servlet" })
public class ConstrainedServlet extends HttpServlet {
	private static final long serialVersionUID = 2896986006687226290L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			if(req.isUserInRole("adm")) {
				resp.getWriter().println("Allowed");
			} else {
				resp.getWriter().println("Denied");
			}
		} catch(Exception ex) {
		}
	}
}
