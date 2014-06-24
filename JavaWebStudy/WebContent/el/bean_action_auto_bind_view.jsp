<jsp:useBean id="model" class="test.pojo.Warrior" scope="request"> 
	<%-- the code will bind automatically the param from request to the bean (it also converts to primitive type automatically) --%>
	<jsp:setProperty name="model" property="name" /> <%-- we could add attribute param="name", but is the same --%>
	<%-- if we use wildcard at property, like property="*", then all property will bind auto (will do that iterating through the parameters) --%>
	<jsp:setProperty name="model" property="*" />
</jsp:useBean>

<!DOCTYPE html>
<html>
<body>
	<p><strong>Using automatic bind param with Bean Standard Action</strong></p>
	Name: <jsp:getProperty name="model" property="name" /> <br/> <%-- call getName() from local var model --%>
	Type: <jsp:getProperty name="model" property="type" /> <%-- call getType() from local var model --%>
	
</body>
</html>