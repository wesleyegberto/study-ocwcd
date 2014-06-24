package test.tld.customtags.classic;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicNestedTagHandler extends TagSupport {
	private static final long serialVersionUID = 7001753720984057928L;
	
	public int doStartTag() throws JspException {
		int nestLevel = 0;
		Tag parent = getParent(); // SimpleTag is the same
		
		while(parent != null) {
			parent = parent.getParent();
			nestLevel++;
		}
		
		try {
			pageContext.getOut().print("<br/>Tag nested level: " + nestLevel);
		} catch(IOException e) {
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE; // needs to eval the body
	}
}
