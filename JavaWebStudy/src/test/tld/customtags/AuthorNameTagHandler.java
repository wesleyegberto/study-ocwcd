package test.tld.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AuthorNameTagHandler extends SimpleTagSupport {
	
	/**
	 * This method is called by the Container when the JSP invokes
	 * the tag using the name declared in the TLD.
	 */
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write("<p><strong>Wesley Egberto</strong></p>");
	}
}
