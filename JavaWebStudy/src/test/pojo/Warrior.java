package test.pojo;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

// HttpSessionBindingListener aren't registered in the DD, it just happens automatically (when is added or removed)
public class Warrior implements HttpSessionBindingListener {
	private String name;
	private String type;
	
	public Warrior() {
		
	}
	
	public Warrior(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("The warrior " + name + " was added into session");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("The warrior " + name + " was removed from session");
	}
}
