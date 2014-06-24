<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
</head>
<body>
	<%-- For the container to work, the action must be j_security_check and the fields must be j_username and j_password --%>
	<form method="POST" action="j_security_check">
		<p>Enter your login:</p>
		<p>Username: <input type="text" name="j_username" /> </p>
		<p>Password: <input type="password" name="j_password" /> </p>
		
		<input type="submit" value="Sign" />
	</form>
</body>
</html>