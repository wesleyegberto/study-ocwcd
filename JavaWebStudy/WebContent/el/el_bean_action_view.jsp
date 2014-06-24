<jsp:useBean id="model" class="test.pojo.Warrior" scope="request"> 
	<jsp:setProperty name="model" property="name" value="New warrior" />
	<jsp:setProperty name="model" property="type" value="Not classified" />
</jsp:useBean>

<!DOCTYPE html>
<html>
<body>
	<p><strong>Using EL and Bean Standard Action</strong></p>
	Name: ${model.name} <br/>
	Type: ${model.type}
	<br/><br/>
	Request's parameters: ${requestScope.name}, ${type} <%-- if does not exist nothing happen --%>
</body>
</html>