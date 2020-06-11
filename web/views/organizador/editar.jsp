
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <title>EditarOrganizador</title>
</head>

<body style="background: coral" >

    <div align="center">
        <fieldset style="width: 300px"> 
            <legend>Actualizar AOrganizador</legend>
            <s:form action="Actualizar">   
                <s:iterator value="datos" var="dato" status="estado"> 
                <s:textfield name="id" label="ID"  required="true" />
                <s:textfield  label="NOMBRE COMPLETO" name="nombreorazonsocial"  required="true"></s:textfield>
                <s:textfield  label="RFC" name="rfc"  required="true"></s:textfield>
                <s:textfield  label="CONTACTO" name="contacto"  required="true"></s:textfield>
                <s:textfield  label="URL" name="url"  required="true"></s:textfield>
                <s:textfield  label="CORREO" name="correo"  required="true"></s:textfield>
                <s:textfield  label="TELEFONO" name="telefono"  required="true"></s:textfield>
                <s:textfield  label="DIRECCION" name="direccion"  required="true"></s:textfield>
                <s:submit  value="Registrar" />
                </s:iterator>
            </s:form>

        </fieldset> 
    </div> 
    </body>
</html>
