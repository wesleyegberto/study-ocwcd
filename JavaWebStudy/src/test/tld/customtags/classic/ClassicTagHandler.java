package test.tld.customtags.classic;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagHandler extends TagSupport {
	private static final long serialVersionUID = 7001753720984057928L;
	
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().print("In ugly doStartTag().<br />");
		} catch(IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY; // don't evaluate the body and go to doEndTag()
	}
	
	public int doEndTag() throws JspException {
		try {
			pageContext.getOut().print("In ugly doEndTag().<br />");
		} catch(IOException e) {
			e.printStackTrace();
		}
		return EVAL_PAGE; // evaluate the rest of the page (SKIP_PAGE is like SkipPageException)
	}
}
