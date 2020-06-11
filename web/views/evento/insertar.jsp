
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <title>Registro Evento</title>
</head>
<body style="background: coral">
       
       <p>
        <p>
            <br>
            <br>
            <br> 
<div align="center">
<table>

<tr>
<td>
    <fieldset style="width: 300px"> 
        <legend>Registrar Evento</legend>
<form action="Registrar">    
    
    <s:textfield  label="Titulo" name="titulo"  required="true" ></s:textfield>
    <s:textfield  label="descripcion" name="descripcion" required="true"></s:textfield>
    <s:textfield label="fechainicio"  name="fechainicio" type="datetime-local" required="true"/>
    <s:textfield label="fechainicio"  name="fechafin" type="datetime-local" required="true"/>
    <s:textfield  label="Observaciones" name="observaciones" required="true"></s:textfield>
    <s:textfield  label="Logotipo" name="logotipo"  required="true"></s:textfield>
    <s:textfield  label="Eslogan" name="slogan" required="true"></s:textfield>
    <s:textfield  label="Lugar" name="lugar"  required="true"></s:textfield>
    
    <s:textfield  label="Id Categoria" name="categoria_id" required="true"></s:textfield>
      <s:textfield label="Inicio Registro"  name="inicioregistro" type="datetime-local" required="true"/>
    <s:textfield label="Cierre registo"  name="cierreregistro" type="datetime-local" required="true" />
    <s:textfield label="Id Organizador" name="id_organizador" required="true"></s:textfield>
    <s:submit  value="Registrar" />
<form>

    </fieldset> 
</div>
    </body>
</html>
