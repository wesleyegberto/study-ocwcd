<%@ taglib prefix="my" uri="mycustom" %>
<!DOCTYPE html>
<html>
<head>
	<title>Using Nested Tags to Create a List</title>
</head>
<body>
	<p>Simple use of nested tags to create a List:</p>
	
	<my:list title="My list of favorite movies">
		<my:listItem text="The Lord of The Ring" />
		<my:listItem text="The Matrix" />
		<my:listItem text="300" />
		<my:listItem text="Black Hawk Down" />
		<my:listItem text="Batman The Dark Knight" />
	</my:list>
</body>
</html>