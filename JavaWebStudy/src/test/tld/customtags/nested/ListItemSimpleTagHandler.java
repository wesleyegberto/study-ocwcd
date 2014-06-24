package test.tld.customtags.nested;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ListItemSimpleTagHandler extends SimpleTagSupport {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void doTag() throws JspException, IOException {
		// gets the parent and add to the list of children
		//ListClassicTagHandler list = (ListClassicTagHandler) getParent();
		// search the first parent of type ListClassicTagHandler
		ListClassicTagHandler list = (ListClassicTagHandler) findAncestorWithClass(this, ListClassicTagHandler.class);
		list.addItem(this);
	}

}
