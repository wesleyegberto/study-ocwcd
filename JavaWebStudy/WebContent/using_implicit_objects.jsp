<!doctype>
<html>
<head>
	<title>Using implicit objects</title>
</head>
<body>
<jsp:include page="header.jsp">
	<jsp:param name="subtitle" value="Using implicit objects" />
</jsp:include>
<p>The Container creates a bunch of objects when translates the page JSP to Servlet class</p>
<ul>
	<li>JspWriter out (JspWrite is a Wrapper and is not int the class hierarchy of PrintWrite)</li>
	<li>HttpServletRequest request</li>
	<li>HttpServletResponse response</li>
	<li>HttpSession session (only available when the page directive's attribute session="true", default is true)</li>
	<li>ServletContext application</li>
	<li>ServletConfig config</li>
	<li>JspException exception (only available when the page directive's attribute isErrosPage="true", default is false)</li>
	<li>PageContext pageContext (has methods to take any other implicit objects or take attributes from them through getAttribute([name], [SCOPE]))</li>
	<li>Object page</li>
</ul>
</body>
</html>