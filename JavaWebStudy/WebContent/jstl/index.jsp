<!doctype>
<html>
	<head>
		<title>JSTL</title>
	</head>
	<body>
		<!-- With jsp:include action, the response of header.jsp is written in this response (bad wat to templating) -->
		<jsp:include page="/header.jsp">
			<jsp:param name="subtitle" value="JSTL" />
		</jsp:include>
		
		<p><a href="/JavaWebStudy/jstl_index?id=1">if</a></p>
		<p><a href="/JavaWebStudy/jstl_index?id=2">choose, when and otherwise</a></p>
		<p><a href="/JavaWebStudy/jstl_index?id=3">forEach</a></p>
		<p><a href="/JavaWebStudy/jstl_index?id=4">set</a></p>
		<br/>
		<p><a href="fmt_tags.jsp">Formatting actions</a></p>
	</body>
</html>
