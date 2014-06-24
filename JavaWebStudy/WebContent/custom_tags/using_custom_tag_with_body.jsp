<%@ taglib prefix="my" uri="mycustom" %>
<%@ taglib prefix="tagfile" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html>
<head>
<title>Simple Tag with Body</title>
</head>
<body>
	<tagfile:header_tag subtitle="Comments" />
	<div>
		<my:commentTag name="Wesley">Today is Friday!!!</my:commentTag>
		<my:commentTag>Today is Saturday!!!</my:commentTag>
		<my:commentTag name="Jose">My day was awesome!!!</my:commentTag>
	</div>
</body>
</html>