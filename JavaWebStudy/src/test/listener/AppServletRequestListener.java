package test.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class AppServletRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent evt) {
		System.out.println("== Request ended ==\n");
	}

	@Override
	public void requestInitialized(ServletRequestEvent evt) {
		System.out.println("\n== Request started ==");
	}

}
