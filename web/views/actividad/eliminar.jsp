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
     
    <center>
        <h1> Registro eliminado con éxito</h1>
        <h2> Se elimino correctamente la actividad con: </h2>
        <h4> Id: <s:property value= "objAct.id"/> </h4>
               <s:a  action ="regresar" cssClass="btn btn-primary" > Catalogo Actividades</s:a>
                
    </center>
    
    </body>
            
      
        
        
       
</html>
