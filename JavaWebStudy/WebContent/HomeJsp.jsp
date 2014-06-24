<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home JSP</title>
</head>
<%! private static final String text = "Author: "; // attribute of generated Servlet class %>

<%! // declare a jspInit() method that overrides javax.servlet.jsp.JspPage.jspInit()
	public void jspInit() {
		ServletConfig config = getServletConfig();
		System.out.println(text + config.getInitParameter("author"));
	}
%>
<body>
	<p>Welcome to Home JSP</p><br/>
	by: <%= text + config.getInitParameter("email") %> <!-- JSP element expression (note: config is a implicit object declared when it's translated to a Servlet class) -->
	<br/>
	E-mail: ${initParam.email} <!-- use EL to take the context param -->
</body>
</html>