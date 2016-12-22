<%@ page language="java" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html>
<head>
<title>Register</title>
</head>
<body>
<h3>Register for a prize by completing this form.</h3>

	<html:form action="/registernow">
		firstname: <html:text property="firstName"></html:text>
		lastname: <html:text property="lastName"></html:text>
		email: <html:text property="email"></html:text>
		age: <html:text property="age"></html:text>
		
		<html:submit />

	</html:form>
</body>

</html>
