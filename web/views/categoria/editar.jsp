<%-- 
    Document   : editar
    Created on : 5/04/2020, 06:17:37 PM
    Author     : nvasq_
--%>
<%@taglib uri="/struts-tags" prefix="s" %>

<%@page contentType="text/html" pageEncoding="x-MacArabic"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        
        <title>editarCategoria</title>
    </head>
   <body style="background: coral">
       
       <p>
        <p>
            <br>
            <br>
            <br> 
      <div align="center">
        <fieldset style="width: 300px" class="table table-bordered" > 
            <legend>Actualizar Categoria</legend>
            <s:form action="Actualizar" >   
                <s:iterator value="datos" var="dato">
                <s:textfield name="id" label="ID" />
                <s:textfield  label="Descripcion" name="descripcion"></s:textfield>
                <s:submit  value="Actualizar" />
              
                </s:iterator>
            </s:form>

        </fieldset> 
    </div> 
    </body>
</html>
