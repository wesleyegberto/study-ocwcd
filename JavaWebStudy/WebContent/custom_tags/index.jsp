<!doctype>
<html>
	<head>
		<title>Custom Tag</title>
	</head>
	<body>
		<jsp:include page="/header.jsp">
			<jsp:param name="subtitle" value="Custom Tag" />
		</jsp:include>
		<p>Tag File (JSP 2.0)</p>
		<p><a href="using_tag_file.jsp">Using tag file</a></p>
		<br/>
		<p>Simple Custom Tag (JSP 2.0)</p>
		<p><a href="using_custom_tag.jsp">Using custom tag</a></p>
		<p><a href="using_custom_tag_attribute.jsp?name=Wesley">Using custom tag with param</a></p>
		<p><a href="using_custom_tag_with_body.jsp">Using custom tag with body</a></p>
		<p><a href="using_custom_tag_with_dynamic_body.jsp?number=9">Using custom tag to iterating the body to generate dynamic rows</a></p>
		<p><a href="using_custom_tag_with_skip_page.jsp">Using custom tag which throws SkipPageException</a></p>
		<br/>
		<p>Classic Custom Tag (JSP &lt; 2.0)</p>
		<p><a href="using_classic_custom_tag.jsp">Classic 1: a simple doStartTag() and doEndTag()</a></p>
		<p><a href="using_classic_custom_tag_with_body.jsp">Classic 2: a simple doStartTag(), doAfterBody() and doEndTag() with Body</a></p>
		<p><a href="using_classic_custom_tag_with_body_loop.jsp">Classic 3: a simple doStartTag(), doAfterBody() and doEndTag() with Body Loop</a></p>
		<br/>
		<p>Nested Tags</p>
		<p><a href="using_nested_tags.jsp">Using Nested Tags</a></p>
		<p><a href="using_nested_tags_create_list.jsp">Using Nested Tags to Create a List</a></p>
	</body>
</html>