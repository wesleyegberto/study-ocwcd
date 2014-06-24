<%@ taglib prefix="my" uri="mycustom" %>
<!DOCTYPE html>
<html>
<head>
	<title>Simple Custom Tag Attribute</title>
</head>
<body>

	The return of the custom tag:<br/>
	<p>Passing attribute through EL: <my:formatName name="${param.name}" /></p>
	
	<p>Passing attribute through scriptlet: <my:formatName name='<%= (String) request.getParameter("name") %>' /></p>
	
	<p>Passing attribute through standard actions:
	<!-- we can use only one per attribute -->
	<my:formatName>
		<jsp:attribute name="name">${param.name}</jsp:attribute>
		<jsp:body></jsp:body>
	</my:formatName>
	</p>
</body>
</html>