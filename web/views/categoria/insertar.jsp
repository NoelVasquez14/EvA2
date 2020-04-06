<%-- 
    Document   : insertar
    Created on : 5/04/2020, 04:27:02 PM
    Author     : nvasq_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=x-MacArabic">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <fieldset  style="width: 800px;">
            <legend>Nueva Categoria</legend>
            <s:form action="ingresar">
                <s:textfield label="descripcion" name="txtDesc"></s:textfield>    
                <s:submit value="Registrar"></s:submit>
            </s:form>
            
            
            
        </fieldset>
        
       
    </center>
        
    </body>
</html>
