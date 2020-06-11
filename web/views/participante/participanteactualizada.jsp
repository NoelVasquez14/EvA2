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
         
        <title>participante</title>
    
   </head>
    <body style="background: coral">
       
       <p>
        <p>
            <br>
            <br>
            <br> 
       
        
    <center>
        <h1 style="color:red"> Registro actualizado con éxito</h1>
         <h4> ID: <s:property value= "id"/> </h4>
        <h4> Descripcion: <s:property value= "objPar.nombre"/> </h4>
        <h4> Descripcion: <s:property value= "objPar.curp"/> </h4>
        <h4> Descripcion: <s:property value= "objPar.intitucionprocedencia"/> </h4>
        <h4> Descripcion: <s:property value= "objPar.cuenta"/> </h4>
        <h4> Descripcion: <s:property value= "objPar.password"/> </h4>
        
        
              
        
        
               <s:a  action ="regresar" cssClass="btn btn-primary" > Catalogo Organizadores</s:a>
                <s:a  action ="insertar" cssClass="btn btn-primary" > Registro Nuevo </s:a>
    </center>
    
    </body>
            
      
        
        
       
</html>
