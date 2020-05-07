<%-- 
    Document   : insertar
    Created on : 6/04/2020, 05:14:20 PM
    Author     : nvasq_
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
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
     
        <legend>Registrar Organizador</legend>
<s:form action="Registrar"> 
    
  
    <input id="fechapago" name="fechapago" type="date" format="YYYY-MM-dd"/> 
    <td> <s:textfield label="idparticipante" name="participante_id" /> </td>
   
    
    <s:submit  value="Registrar" />
</s:form>

     
</div>
    </body>
</html>
