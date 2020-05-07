
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <title>Editar</title>
</head>

<body>

    <div align="center">
        <fieldset style="width: 300px"> 
            <legend>Actualizar Participante</legend>
            <s:form action="Actualizar">   
                <s:textfield name="id" label="ID" />
                <s:textfield  label="NOMBRE COMPLETO" name="txtnombre"></s:textfield>
                <s:textfield  label="RFC" name="txtcurp"></s:textfield>
                <s:textfield  label="CONTACTO" name="txtinstitucion"></s:textfield>
                <s:textfield  label="URL" name="txtcuenta"></s:textfield>
                <s:password  label="CORREO" name="txtpassword"></s:password>
               
                      
                     
                 
                <s:submit  value="Registrar" />
            </s:form>

        </fieldset> 
    </div> 
    </body>
</html>
