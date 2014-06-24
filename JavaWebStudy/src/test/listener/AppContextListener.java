package test.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import test.pojo.Warrior;

public class AppContextListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent evt)  {
		System.out.println("Context initialized");
		
		ServletContext sc = evt.getServletContext();
		String name = sc.getInitParameter("warrior-name");
		String type = sc.getInitParameter("warrior-type");
		
		Warrior wr = new Warrior(name, type);		
		sc.setAttribute("warrior", wr);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent evt) {
		System.out.println("Context destroyed");
	}
}
