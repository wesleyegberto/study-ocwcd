<%@ taglib prefix="my" uri="mycustom" %>
<!DOCTYPE html>
<html>
<head>
	<title>Using Nested Tags</title>
</head>
<body>
	<p>Simple use of nested tags:</p>
	
	<%-- Classic and Simple Tag is the same way to navigate through the hierarchy of tags --%>
	<my:classicTag>
		<my:classicTag>
			<my:classicTag />
		</my:classicTag>
	</my:classicTag>
	<br/>
	<p><em>Note: We can use a Classic Tag as a parent of a Simple Tag, but <br/>
	to use a Simple Tag as a parent of a Classic Tag we need a slight hack (TagAdapter).<br/>
	Because, in the Simple Tag, the return type of getParent() is the interface JspTag <br/>
	(superclass of Tag) and in the Classic Tag the return type of getParent() is the <br/>
	interface Tag.</em></p>
</body>
</html>