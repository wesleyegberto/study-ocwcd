<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<body>
	<p><strong>EL implict objects that are mapped (in a map object)</strong></p>
	<p>${firstThing.secondThing} or ${firstThing["secondThing"]}<br/>
		firstThing: must be either a map or a bean, or when using brackets can be also a array or list;<br/>
		secondThing: must be eithar a key (when firstThing is a map) or a property (when firstThing is a bean).</p>
	<ul>
		<li>pageScope</li>
		<li>requestScope</li>
		<li>sessionScope</li>
		<li>applicationScope</li>
		
		<li>param</li>
		<li>paramValues (used when have more tha one parameter value for a given parameter name)</li>
		
		<li>header</li>
		<li>headerValues (used when have more tha one header value for a given header name)</li>
		
		<li>cookie</li>
		<li>initParam</li>
		
		<li>pageContext (is the same object available to JSP scriptlet - we can get request and response objects, and so on)</li>
	</ul>
	<p>Examples:</p>
	<ul>
		<li>${requestScope.name} or ${pageScope["name"]}</li>
		<li>${sessionScope.login} or ${sessionScope["login"]}</li>
		<li>${cookie.JSESSIONID} or ${cookie["JSESSIONID"]}</li>
		<li>${myArray[0]}: used to access a array or a list, must be a number</li>
		<li>${myList["2"]}: used to access a array or a list, must be can parsed to a int</li>
		<li>${requestScope["test.pojo.Warrior"]}: used to access names that are invalid in java (with dots, numbers or other simbols)</li>
		<li>${myVar[typeSelected]}: the EL will search for typeSelected at scopes (page, request, session and then application) and if exists the
			value of it is used as key</li>
		<li>${myList[myAnotherList[9]]}</li>
		<li>${header.host}</li>
		<li>${pageContext.request.method}</li>
	</ul>
</body>
</html>