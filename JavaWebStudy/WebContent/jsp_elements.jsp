<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<title>JSP Directives and Elements</title>
</head>
<body>
<jsp:include page="header.jsp">
	<jsp:param name="subtitle" value="JSP Directives and Elements" />
</jsp:include>
<h4>Directives: used to give special instructions to the Container at page translation time</h4>
<p>&lt;%@ page %&gt; - page: defines page-specific properties such as character encoding, the content type, if should have the implicit session object, etc;</p>
<p>&lt;%@ taglib %&gt; - taglib: defines tag libraries available to the JSP; </p>
<p>&lt;%@ include %&gt; - include: defines text and code that gets added into the current page at translation time.</p>
<br/> 

<h4>Elements</h4>
<p>&lt;% %&gt; - scriptlet: declaring local member of service() method (like vars, java code and so on). Must use semicolon (;);</p>
<p>&lt;%= %&gt; - expression: used to pass value as arg to <code>out.print()</code> method. Must not use semi colon (;);</p>
<p>&lt;%! %&gt; - declaring member of class (such as methods, attributes, inner class and so on).</p>
<p>&lt;%-- --%&gt; - JSP comments</p>

<%! String attr = "I'm a attribute"; %>
<%!
private String getAttr() {
	return this.attr;
}
%>
<%= getAttr() %>
</body>
</html>