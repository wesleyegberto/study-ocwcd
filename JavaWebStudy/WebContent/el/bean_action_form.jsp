<!DOCTYPE html>
<html>
	<head>
		<title>JSP - Bean Standard Action</title>
	</head>
	<body>
		<form method="post" action="/JavaWebStudy/beanActionController">
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