<%-- 
    Document   : insertar
    Created on : 6/04/2020, 05:14:20 PM
    Author     : nvasq_
--%>
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
        <legend>Registrar Organizador</legend>
<s:form action="Registrar">    
    
    <s:textfield  label="Nombre o razon social " name="txtnombreorazonsocial"></s:textfield>
    <s:textfield  label="RFC" name="txtrfc"></s:textfield>
    <s:textfield  label="Contacto" name="txtcontacto"></s:textfield>
    <s:textfield  label="URL" name="txturl"></s:textfield>
    <s:textfield  label="Correo" name="txtcorreo"></s:textfield>
    <s:textfield  label="Telefono" name="txttelefono"></s:textfield>
    <s:textfield  label="Dirección" name="txtdireccion"></s:textfield>
    <s:submit  value="Registrar" />
</s:form>

    </fieldset> 
</div>
    </body>
</html>
