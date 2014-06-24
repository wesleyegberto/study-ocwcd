package test.tld.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SkipPageTagHandler extends SimpleTagSupport {
	
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().print("Message from doTag().<br/>");
		getJspContext().getOut().print("About to throw a SkipPageException");
		
		// throw an exception which cause the ends of the page
		throw new SkipPageException();
	}
}
