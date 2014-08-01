package test.servlet.constrained;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.annotation.security.RolesAllowed;

/**
 * The declarative security constraint can be defined in the servlet class using
 * annotations or in the XML deployment descriptor. Declarative authorization involves
 * declaring roles, assigning permission to methods or entire class,
 * or changing temporarily a security identity. These controls are made by the
 * annotations
 * 
 * Available Annotations (is the same used with EJB 3.x):
 * 
 * > @PermitAll
 * . Can be used in a bean-level or method-level;
 * . Indicate that the bean or method accessible by everyone.
 * > @DenyAll
 * . Only in bean-level;
 * . Indicates that no role is permitted to execute the specified method.
 * > @RolesAllowed("<role-name>","<role-name>",...)
 * . Bean or method;
 * . Indicates that a list of roles is allowed to execute the given method or bean.
 * > @DeclareRoles
 * . Bean;
 * . Defines roles for security checking.
 * > @RunAs
 * . Bean;
 * . Temporarily assigns a new role to a principal.
 */
@WebServlet(name = "ConstrainedServlet", urlPatterns = { "/security/constrained_servlet" })
public class ConstrainedServlet extends HttpServlet {
	private static final long serialVersionUID = 2896986006687226290L;

	@RolesAllowed({"adm","man"})
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
