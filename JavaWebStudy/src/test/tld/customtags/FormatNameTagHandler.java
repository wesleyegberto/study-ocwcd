package test.tld.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class FormatNameTagHandler extends SimpleTagSupport {
	private String name;
	
	/**
	 * This set is called by container which uses JavaBean property naming
	 * conventions.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This method is called by the Container when the JSP invokes
	 * the tag using the name declared in the TLD.
	 */
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write("<p><strong>" + name + "</strong></p>");
	}
}
