package test.tld.customtags.classic;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicWithBodyLoopTagHandler extends TagSupport {
	private static final long serialVersionUID = 7001753720984057928L;
	private int i = 1;
	public int doStartTag() throws JspException {
		i = 1; // we should reset the counter because the Container can reuse the instance of the custom tag
		try {
			pageContext.getOut().print("In ugly doStartTag().<br />About to print the body<br />");
		} catch(IOException e) {
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE; // evaluate the body and go to the doAfterBody()
	}
	
	public int doAfterBody() {
		try {
			pageContext.getOut().print("In ugly doAfterBody() for the " + i + " time(s).<br />");
		} catch(IOException e) {
			e.printStackTrace();
		}
		if(i < 4) {
			i++;
			return EVAL_BODY_AGAIN; // evaluate the body again and go to doAfterBody() again
		}
		return SKIP_BODY; // skip the body to don't evaluate again and go to doEndTag()
	}
	
	public int doEndTag() throws JspException {
		try {
			pageContext.getOut().print("In ugly doEndTag().<br />");
		} catch(IOException e) {
			e.printStackTrace();
		}
		return EVAL_PAGE; // evaluate the rest of the page (SKIP_PAGE is exactly like throwing a SkipPageException)
	}
}
