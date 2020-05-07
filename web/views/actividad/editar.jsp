
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <title>EditarActividad</title>
</head>

<body>

    <div align="center">
        <fieldset style="width: 300px"> 
            <legend>Actualizar Actividad</legend>
            <s:form action="Actualizar">   
                <s:textfield name="id" label="ID" />
                <s:textfield  label="Descripcion" name="txtdescripcion"></s:textfield>
                <s:submit  value="Registrar" />
            </s:form>

        </fieldset> 
    </div> 
    </body>
</html>
