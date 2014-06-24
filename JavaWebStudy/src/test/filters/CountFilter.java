package test.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CountFilter implements Filter {
	private FilterConfig fc;
	private static int count;
	
	@Override
	public void init(FilterConfig conf) throws ServletException {
		this.fc = conf;
		System.out.println("== Filter " + fc.getFilterName() + " initializing ==");
		
		String initialValue = fc.getInitParameter("initialValue");
		
		try {
			count = Integer.parseInt(initialValue);
		} catch(NumberFormatException ex) {
			count = 0;
		}
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException,
			ServletException {
		System.out.println("[" + ++count + "] Request has arrived");
		
		// call the next filter (add it in the conceptual stack of filters and servlets)
		chain.doFilter(req, resp);
		
		System.out.println("It's back to the Filter, we can modify some stuffs!");
		
	}

	@Override
	public void destroy() {
		System.out.println("== Filter destroying == ");
	}

}
