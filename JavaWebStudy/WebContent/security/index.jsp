<%@ taglib prefix="tagfile" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Security</title>
	</head>
	<body>
		<tagfile:header_tag subtitle="Security" />
		
		<p>BASIC and FORM</p>
		
		<p><a href="only_admin/index.jsp">Only role admin</a></p>
		<p><a href="only_user/index.jsp">Only role user</a></p>
		<br/>
		<p>Authorization</p>
		<p><a href="/JavaWebStudy/security/constrained_servlet">Servlet test user's role is admin</a></p>
		<br/>
		<p><a href="send_data_encrypt.jsp">Use form encrypted by SSL</a></p>
	</body>
</html>