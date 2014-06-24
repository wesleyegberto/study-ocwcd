<%--
	The Bean Standard Action will get the model from request and set in a local var with the same name,
	id="model" must be the same name of the request's attribute.
	To use a reference type of abstract class, interface or other we can use attribute type: type="java.lang.Object".
	type -> Reference type used to type of local var. If is not set the classe will use as local var type.
	class -> Object type used to instance a class if the bean was not found with scope (must have public no-arg construct). If is not set
		the object bean must exist or will throw a error.
--%>
<jsp:useBean id="model" class="test.pojo.Warrior" scope="request"> 
	<%-- this code will run only if the model was not found in the request, thus a new one was created --%>
	<jsp:setProperty name="model" property="name" value="New warrior" />
	<jsp:setProperty name="model" property="type" value="Not classified" />
</jsp:useBean>

<!DOCTYPE html>
<html>
<body>
	<p><strong>Using Bean Standard Action</strong></p>
	Name: <jsp:getProperty name="model" property="name" /> <br/> <%-- call getName() from local var model --%>
	Type: <jsp:getProperty name="model" property="type" /> <%-- call getType() from local var model --%>
	
	<br /><br />
	
	<p><strong>Using scriplets</strong></p>
	<% test.pojo.Warrior modelScriptlet = (test.pojo.Warrior) request.getAttribute("model"); // here is used another name to local var, because model was already used%>
	Name: <%= modelScriptlet.getName() %> <br/>
	Type: <%= modelScriptlet.getType() %>
	
</body>
</html>