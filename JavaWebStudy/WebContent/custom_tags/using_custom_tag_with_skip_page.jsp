<%@ taglib prefix="my" uri="mycustom" %>
<%@ taglib prefix="tagfile" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html>
<head>
<title>Simple Custom Tag SkipPageException</title>
</head>
<body>
	<tagfile:header_tag subtitle="Skip Page Exception" />
	<p>Everything up to the point of the exception will be showed.</p>
	<p>This will be rendered.</p>
	
	<my:skipPageTag />
	
	<p>This won't be rendered =(.</p>
</body>
</html>