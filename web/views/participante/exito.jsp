<%-- 
    Document   : evento
    Created on : 5/04/2020, 12:43:39 PM
    Author     : nvasq_
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
         
        <title>Actividad</title>
    
   </head>
   <body style="background: coral">
       
       <p>
        <p>
            <br>
            <br>
            <br> 
       
        
    <center>
        <h1> Registro grabado con éxito</h1>
        <h4> Nombre completo: <s:property value= "objPar.nombrecompleto"/>  </h4>
        <h4> CURP: <s:property value= "objPar.curp"/> </h4>
        <h4> Institucion de procedencia: <s:property value= "objPar.intitucionprocedencia"/> </h4>
        <h4> Cuenta: <s:property value= "objPar.cuenta"/> </h4>
        <h4> Password: <s:property value= "objPar.password"/> </h4>
        
               <s:a  action ="regresar" cssClass="btn btn-primary" > Catalogo Participantes</s:a>
                <s:a  action ="insertar" cssClass="btn btn-primary" > Registro Nuevo </s:a>
    </center>
    
    </body>
            
      
        
        
       
</html>
