
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <title>EditarActividad</title>
</head>

<body style="background: coral">
       
       <p>
        <p>
            <br>
            <br>
            <br> 

    <div align="center">
        <fieldset style="width: 300px"> 
            <legend>Actualizar Catalogo</legend>
            <s:form action="Actualizar">   
                 <s:iterator value="datos" var="dato" status="estado"> 
                  <s:textfield name="id" label ="id" />  
                     <s:textfield name="titulo" label ="titulo" /> 
                      <s:textfield name="actividad_id" label="actividad_id" />  
                       <s:textfield name="evento_id" label="evento_id"/>  
                       <s:textfield  name="costo" label="costo" /> 
                        <s:textfield name="totalhoras" label="totalhoras"/> 
                         <s:textfield name="cupolimite" label="Cupolimite" />  
                <s:submit  value="Registrar" />
                 </s:iterator>
            </s:form>

        </fieldset> 
    </div> 
    </body>
</html>
