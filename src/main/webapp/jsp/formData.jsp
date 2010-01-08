<%@page pageEncoding="ISO-8859-1" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Dados</title>
</head>
<body>
	<s:form action="data">
		<s:textfield label="Funçao" name="file"/>
		<s:select list="types" name="type" label="Tipo"/>
		<s:textfield label="ALR" name="alr" size="4"/>
		<s:textfield label="DER" name="der"size="4"/>
		<s:select list="complexities" name="complexity" />
	</s:form>
</body>
</html>
