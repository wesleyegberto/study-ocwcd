<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>JSTL - Formatting Actions</title>
</head>
<body>

	<p><strong>Dates</strong></p>
	<c:set var="now" value="<%=new java.util.Date()%>"/>
	<fmt:formatDate type="time" value="${now}"/>
	<fmt:formatDate type="date" value="${now}"/>
	<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${now}"/>
	<fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${now}"/>
	
	<p><strong>Currency</strong></p>
	<fmt:setLocale value="en_us"/>
	<fmt:formatNumber value="20.50" type="currency"/>
	<fmt:setLocale value="pt_br"/>
	<fmt:formatNumber value="20.50" type="currency"/>

</body>
</html>
