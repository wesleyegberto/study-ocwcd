<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="warrior" class="test.pojo.Warrior" scope="request" />
<!DOCTYPE html>
<html>
<head>
<title>JSTL - set</title>
</head>
<body>
	The set tag comes in two flavors: var and target.<br/><br/>
	
	<strong>var: </strong>used to set attribute variables<br />
	&lt;c:set var="a" value="${null}" /&gt;<br />
	
	<%-- set or create a the value to the var myName in the request scope --%>
	<c:set var="myName" value="Wesley" scope="request" />
	<c:set var="a" value="123" scope="page" />
	
	<%-- whenever the value receive null, it removes the var from the scope specified or from the all scopes where was find --%>
	<c:set var="a" value="${null}" />
	<c:set var="c" value="${null}" scope="session" /> <%-- removes the var c from the session scope --%>
	
	<c:set var="b" scope="request">
		${myName},${a},val1,val2,val3 <%-- the body is evaluated and used as the value of the variable --%>
	</c:set>
	
	<%-- the all vars a was removed from all scopes --%>
	a = ${requestScope.a}<br/> 
	a = ${sessionScope.a}
	<br/><br/>
	<strong>targe: </strong>used to set bean properties or Map values<br />
	&lt;c:set target="${myVar}" property="myAttr" value="myValue" /&gt;<br />
	
	<%-- the target must not be null and must use EL or scriptlets (not only the String id of useBean or Map) --%>
	<c:set target="${warrior}" property="type" value="Soldier" />
	<c:set target="${warrior}" property="name">${myName}</c:set>
</body>
</html>