package test.servlet.generate_http_error;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Generate404Servlet extends HttpServlet {
	private static final long serialVersionUID = -1987346677646945722L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendError(HttpServletResponse.SC_FORBIDDEN, "Error generated.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
