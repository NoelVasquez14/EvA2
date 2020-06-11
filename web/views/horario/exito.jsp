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
    <body>
       
        
    <center>
        <h1> Registro grabado con éxito</h1>
        <h4> Nombre o razon social: <s:property value= "objHor.catalogo_id"/> </h4>
        <h4> RFC: <s:property value= "objOrg.ponente_id"/> </h4>
       
               <s:a  action ="regresar" cssClass="btn btn-primary" > Catalogo Horarios</s:a>
                <s:a  action ="insertar" cssClass="btn btn-primary" > Registro Nuevo </s:a>
    </center>
    
    </body>
            
      
        
        
       
</html>
