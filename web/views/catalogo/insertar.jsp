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
        <title>CATALOGO</title>
</head>
<body>
<div align="center">
<table>

<tr>
<td>
    <fieldset style="width: 300px"> 
        <legend>Registrar Catalogo</legend>
<s:form action="Registrar">    
    <s:textfield  label="Titulo" name="titulo"></s:textfield>
    <s:textfield label="ID Actividad" name="actividad_id"  />
    <s:textfield label="ID Evento" name="evento_id" />
    <s:textfield label="costo" name="costo" />
    <s:textfield label="Total horas" name="totalhoras" />
    <s:textfield label="Cupo Limite" name="cupolimite" />
                 <s:submit  value="Registrar" />
</s:form>

    </fieldset> 
</div>
    </body>
</html>
