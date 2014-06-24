package test.tld.customtags.nested;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ListClassicTagHandler extends TagSupport {
	private static final long serialVersionUID = 6033709871510821246L;

	private String title;
	private List<ListItemSimpleTagHandler> children = new LinkedList<ListItemSimpleTagHandler>();

	public void setTitle(String title) {
		this.title = title;
	}

	public void addItem(ListItemSimpleTagHandler listItem) {
		children.add(listItem);
	}

	public int doStartTag() throws JspException {
		return EVAL_BODY_INCLUDE; // needs to eval the body of ListItem
	}

	public int doEndTag() throws JspException {
		// in the doEndTag() we can do what we need to do because we already have all the children
		try {
			JspWriter writer = pageContext.getOut();
			
			writer.write("<p>");
			writer.write(title);
			writer.write("</p>");
			
			writer.write("<ul>");
			Iterator<ListItemSimpleTagHandler> it = children.iterator();
			while(it.hasNext()) {
				writer.write("<li>");
				writer.write(it.next().getText());
				writer.write("</li>");
			}
			writer.write("</ul>");
		} catch(Exception ex) {

		}

		return EVAL_PAGE;
	}
}
