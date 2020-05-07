<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <title>Registro Organizador</title>
</head>
<body>
<div align="center">
<table>

<tr>
<td>
    <fieldset style="width: 300px"> 
        <legend>Registrar Participante</legend>
<s:form action="Registrar">    
    
    <s:textfield  label="Nombre completo" name="txtnombre"></s:textfield>
    <s:textfield  label="CURP" name="txtcurp"></s:textfield>
    <s:textfield  label="Institucion de procedencia" name="txtinstitucion"></s:textfield>
    <s:textfield  label="cuenta" name="txtcuenta"></s:textfield>
    <s:password label="password" name="txtpassword"></s:password>
    <s:submit  value="Registrar" />
</s:form>

    </fieldset> 
</div>
    </body>
</html>
