
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <title>Editar</title>
</head>

<body style="background: coral">
       
       <p>
        <p>
            <br>
            <br>
            <br> 
    <div align="center">
        <fieldset style="width: 300px"> 
            <legend>Actualizar Participante</legend>
            <s:form action="Actualizar">   
                <s:iterator var="dato" value="datos" >
                <s:textfield name="id" label="ID" />
                <s:textfield  label="NOMBRE COMPLETO" name="nombrecompleto"></s:textfield>
                <s:textfield  label="RFC" name="curp"></s:textfield>
                <s:textfield  label="Intitucion de procedencia" name="intitucionprocedencia"></s:textfield>
                <s:textfield  label="Cuenta" name="cuenta"></s:textfield>
                <s:password  label="Password" name="password"></s:password>
               
                      
                     
                 
                <s:submit  value="Registrar" />
                </s:iterator>
                
            </s:form>

        </fieldset> 
    </div> 
    </body>
</html>
