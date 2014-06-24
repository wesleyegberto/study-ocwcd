package test.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class AppServletRequestAttributeListener implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent ev) {
		System.out.println("Add: " + ev.getName() + " -> " + ev.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent ev) {
		System.out.println("Rem: " + ev.getName() + " -> " + ev.getValue());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent ev) {
		System.out.println("Rep: " + ev.getName() + " -> " + ev.getValue());
	}

}
