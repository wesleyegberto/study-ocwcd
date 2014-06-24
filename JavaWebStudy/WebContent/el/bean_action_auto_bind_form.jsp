<!DOCTYPE html>
<html>
	<head>
		<title>JSP - Auto Bind Bean Standard Action</title>
	</head>
	<body>
		<form method="post" action="bean_action_auto_bind_view.jsp">
			<p>The form will send direct to the JSP view and there will bind to bean automatically
			by the same name of the param and the property.</p>
			Name: <input type="text" name="name" /><br/>
			Warrior type: <select name="type">
				<option value="knight">Knight</option>
				<option value="samurai">Samurai</option>
				<option value="ninja">Ninja</option>
			</select>
			<br/>
			<input type="submit" value="Send" />
		</form>
	</body>
</html>