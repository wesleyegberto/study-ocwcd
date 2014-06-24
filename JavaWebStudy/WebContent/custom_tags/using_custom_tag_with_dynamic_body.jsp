<%@ taglib prefix="my" uri="mycustom" %>
<%@ taglib prefix="tagfile" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html>
<head>
<title>Simple Custom Tag With Dynamic Body</title>
</head>
<body>
	<tagfile:header_tag subtitle="Multiplication Table" />
	<div>
	<table>
		<tr><th colspan="2">A multiplication table of: ${param.number}</th></tr>
		<my:multiply number="${param.number}">
			<tr><td width="50px">${i} * ${param.number}</td><td>= ${result}</td></tr>
		</my:multiply>
	</table>
	</div>
</body>
</html>