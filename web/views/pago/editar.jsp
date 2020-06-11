
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
                 <s:iterator value="datos" var="dato" status="estado"> 
                <s:textfield name="id" label="ID" />
                <s:textfield  type="date"  label="Fecha de pago" format="YYYY-MM-dd"  pattern = "yyyy-MM-dd" name="fechapago">  </s:textfield>
                
                <s:textfield label="Participante Id" name="partipante_id" />
                      
 
                 
                <s:submit  value="Registrar" />
                </s:iterator>
            </s:form>

        </fieldset> 
    </div> 
    </body>
</html>
