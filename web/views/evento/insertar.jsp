
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <title>Registro Evento</title>
</head>
<body>
<div align="center">
<table>

<tr>
<td>
    <fieldset style="width: 300px"> 
        <legend>Registrar Evento</legend>
<form action="Registrar">    
    
    <s:textfield  label="Titulo" name="titulo" ></s:textfield>
    <s:textfield  label="descripcion" name="descripcion"></s:textfield>
    <td>  <label>Fecha inicio:</label>
            <input type="date" name="fechainicio" > </td>
        <td>  <label>Fecha final:</label>
            <input type="date" name="fechafin" > </td>

    <s:textfield  label="Observaciones" name="observaciones"></s:textfield>
    <s:textfield  label="Logotipo" name="logotipo"></s:textfield>
    <s:textfield  label="Eslogan" name="slogan"></s:textfield>
    <s:textfield  label="Lugar" name="lugar"></s:textfield>
    
    <s:textfield  label="Id Categoria" name="categoria_id"></s:textfield>
        <td>  <label> inicio de registro:</label>
            <input type="date" name="inicioregistro" > </td>
      <td>  <label>Fecha inicio:</label>
          <input type="date" name="cierreregistro" > </td>
    <s:textfield label="Id Organizador" name="id_organizador"></s:textfield>
    <s:submit  value="Registrar" />
<form>

    </fieldset> 
</div>
    </body>
</html>
