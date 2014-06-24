package test.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class AppSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println(">> Session created <<");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println(">> Session destroyed <<");
	}

}
