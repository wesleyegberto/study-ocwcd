package test.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class WrapperFilter implements Filter {
	
	@Override
	public void init(FilterConfig conf) throws ServletException {
		System.out.println("== Filter " + conf.getFilterName() + " initializing ==");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		System.out.println("Request has arrived to ConstrainedServlet");
		
		HttpServletResponse wrapperResp = new HttpServletResponseWrapper((HttpServletResponse) response) {
			// here we can override some methods to do our stuff
			public PrintWriter getWriter() throws IOException {
				System.out.println("PrintWriter was got!");
				return super.getWriter();
			}
		};
		
		chain.doFilter(request, wrapperResp);
	}

	@Override
	public void destroy() {
		System.out.println("== Filter destroying == ");
	}

}
