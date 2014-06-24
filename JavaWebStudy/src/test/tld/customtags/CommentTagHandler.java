package test.tld.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CommentTagHandler extends SimpleTagSupport {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void doTag() throws JspException, IOException {
		JspWriter writer = getJspContext().getOut();
		writer.write("<div><p><strong>");
		writer.write((name != null) ? name : "Anonymous");
		writer.write("</strong><br/>\"<em>");
		getJspBody().invoke(null); // the null means that will be write in the response (if we pass a Writer then it will be used)
		writer.write("</em>\"</p></div>");
	}
}
