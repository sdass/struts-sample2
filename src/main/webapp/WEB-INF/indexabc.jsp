<%@ page language="java" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html>
<head>
<title>Sample Struts Application</title>
</head>
<body>

	<html:form action="/Name">
		<table width="80%" border="0">
			<tr>
				<td>Name:</td>
				<td><html:text property="name" /></td>
			</tr>
			<tr>
				<td><html:submit /></td>
			</tr>
		</table>
	</html:form>
</body>

</html>
