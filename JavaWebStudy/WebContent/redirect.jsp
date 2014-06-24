<!doctype>
<html>
	<head>
		<title>Servlets Test</title>
	</head>
	<body>
		<p>Redirected!</p>
		<a href="index.jsp">Home</a>
		
		<p>Do a Forward after a flush() always throws exception.</p>
		<p>If it's on a JSP page, the page will render only until the forward JSP standard tag or scriptlet:</p>
		<p>
			Hello!<br/>
			&lt;% out.flush(); %&gt;<br/>
			&lt;jsp:forward page="one.jsp" /&gt;<br/>
			This content won't be rendered because is after the exception thrown from jsp:forward.
		</p>
	</body>
</html>