<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>JSTL - forEach</title>
</head>
<body>
	A simple loop through the ArrayList to print a table with c:forEach:<br />
	<table border="1">
		<tr><th>Iteration counter</th><th>Items from list</th></tr>
		<c:forEach var="item" items="${list}" varStatus="loopCount" >
			<tr>
				<td>${loopCount.count}</td><%-- a var of type javax.servlet.jsp.jstl.core.LoopTagStatus which gives us the iteration counter --%>
				<td>${item}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	A simple loop with c:forEach tag using counter and step:<br/>
	<c:forEach begin="0" end="5" step="1" var="i" >
		${i}<br />
	</c:forEach>
</body>
</html>