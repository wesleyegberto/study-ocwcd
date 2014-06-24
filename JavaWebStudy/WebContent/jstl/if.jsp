<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>JSTL - if</title>
</head>
<body>
	Test using c:if:<br />
	<c:if test="${a eq '1'}">
		a is equal to 1<br/>
	</c:if>
	<c:if test="${b ne '1'}">
		a is not equal to 1<br/>
	</c:if>
	<c:if test="${c gt 2}">
		a is greater than 2<br/>
	</c:if>
</body>
</html>