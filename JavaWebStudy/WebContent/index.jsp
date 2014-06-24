<!doctype>
<html>
	<head>
		<title>Servlets Test</title>
	</head>
	<body>
		<jsp:include page="header.jsp">
			<jsp:param name="subtitle" value="Index" />
		</jsp:include>
		
		<a href="HomeJsp.jsp">Go to Home JSP through GET</a><br/>
		<a href="/JavaWebStudy/home">Go to Home through GET</a>
		<form action="/JavaWebStudy/home" method="POST"><a href="javascript:document.forms[0].submit()">Go to Home through POST</a></form>
		<p><a href="/JavaWebStudy/generateError">Generate error</a></p>
		<br/>
		<p><a href="using_implicit_objects.jsp">Implicit objects</a></p>
		<p><a href="cookie_test">Cookie test</a></p>
		<p><a href="redirect">Test redirect</a></p>
		<p><a href="servlet_request_attribute_listener">Servlet Request Attribute Listener</a></p>
		<p><a href="data_source">Data Source Test</a></p>
		<br/>
		<p><a href="el/index.jsp">Expression Language</a></p>
		<p><a href="jstl/index.jsp">JSTL</a></p>
		<p><a href="custom_tags/index.jsp">Custom Tags</a></p>
		<br/>
		<p><a href="security/index.jsp">Security</a></p>
	</body>
</html>