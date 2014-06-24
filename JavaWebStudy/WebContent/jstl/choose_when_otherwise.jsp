<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>JSTL - choose</title>
</head>
<body>
	Test using c:when (if) and c:otherwise (else):<br />
	<%-- choose is not required --%>
	<c:choose>
		<c:when test="#{a eq 1}">
			a is equal to 1
		</c:when>
		<c:when test="#{a eq 2}">
			a is equal to 2
		</c:when>
		<c:otherwise>
			a is not equal to either 1 or 2
		</c:otherwise>
	</c:choose>
</body>
</html>