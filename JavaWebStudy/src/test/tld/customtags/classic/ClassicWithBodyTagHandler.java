package test.tld.customtags.classic;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicWithBodyTagHandler extends TagSupport {
	private static final long serialVersionUID = 7001753720984057928L;
	
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().print("In ugly doStartTag().<br />About to print the body<br />");
		} catch(IOException e) {
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE; // evaluate the body and go to doAfterBody()
	}
	
	// declared at IterationTag interface
	public int doAfterBody() {
		try {
			pageContext.getOut().print("In ugly doAfterBody().<br />");
		} catch(IOException e) {
			e.printStackTrace();
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
