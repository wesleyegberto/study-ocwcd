package test.tld.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MultiplyTagHandler extends SimpleTagSupport {
	private int number;

	public void setNumber(int number) {
		this.number = number;
	}

	public void doTag() throws JspException, IOException {
		for(int i = 1; i <= 10; i++) {
			 // add a attribute that is used at the body (EL ${result})
			getJspContext().setAttribute("result", i * number);
			getJspContext().setAttribute("i", i);
			getJspBody().invoke(null);
		}
	}
}
