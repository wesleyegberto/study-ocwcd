package test.servlet.async;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsyncResponseServlet
 */
@WebServlet("/AsyncResponseServlet")
public class AsyncResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 13252233523523523L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AsyncContext context = request.getAsyncContext();
		
		// here we could pass the AsyncContext to an Event and an Observer process something and sends the result
		// eventList.fire(context);
		
		// and we should complete to close the "stream" with the browser 
		context.complete();
	}

}
