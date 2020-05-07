
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <title>EditarOrganizador</title>
</head>

<body>

    <div align="center">
        <fieldset style="width: 300px"> 
            <legend>Actualizar AOrganizador</legend>
            <s:form action="Actualizar">   
                <s:textfield name="id" label="ID" />
                <s:textfield  label="NOMBRE COMPLETO" name="txtnombreorazonsocial"></s:textfield>
                <s:textfield  label="RFC" name="txtrfc"></s:textfield>
                <s:textfield  label="CONTACTO" name="txtcontacto"></s:textfield>
                <s:textfield  label="URL" name="txturl"></s:textfield>
                <s:textfield  label="CORREO" name="txtcorreo"></s:textfield>
                <s:textfield  label="TELEFONO" name="txttelefono"></s:textfield>
                <s:textfield  label="DIRECCION" name="txtdireccion"></s:textfield>
                      
                     
                 
                <s:submit  value="Registrar" />
            </s:form>

        </fieldset> 
    </div> 
    </body>
</html>
