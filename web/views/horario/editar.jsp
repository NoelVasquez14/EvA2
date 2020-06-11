
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <title>EditarOrganizador</title>
</head>

<body style="background: coral">
       
       <p>
        <p>
            <br>
            <br>
            <br> 
    <div align="center">
        <fieldset style="width: 300px"> 
            <legend>Actualizar horario</legend>
            <s:form action="Actualizar">

                <s:iterator value="datos" var="dato" status="estado"> 
                    <s:textfield name="id" label="ID" />
                    <s:textfield  label="categoria_id" name="catalogo_id"></s:textfield>
                    <s:textfield  label="RFC" name="ponente_id"></s:textfield>
      
                      
                    <s:submit  value="Registrar" />
                </s:iterator > 
            </s:form>

        </fieldset> 
    </div> 
    </body>
</html>
