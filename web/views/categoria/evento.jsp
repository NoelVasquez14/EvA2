<%-- 
    Document   : evento
    Created on : 5/04/2020, 12:43:39 PM
    Author     : nvasq_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
         
        <title>Categoria</title>
    
    </head>
    <body>
        <h1>Lista de actividades</h1>
        
        <p>
        <s:a action ="add" cssClass="btn-success"> Agregar</s:a>
    </p>
        <table class="table table-bordered">
            <thead> 
            <th>ID</th>
            <th>DESCRIPCION</th>
            <th>ACCIONES</th>
            </thead>
            <tbody>
            <s:iterator value="datos" var="dato" status="estado"> 
                <tr>
                    <td> <s:property value="id" />  </td>
                    <td> <s:property value="descripcion" />  </td>
                    <td> <s:a action="editar"> 
                            <s:param name="id" value="id"/>
                            <i class="bi bi-pencil"></i> 
                         </s:a>   
                            <s:a action="eliminar"> 
                            <s:param name="id" value="id"/>
                            <i class="glyphicon glyphicon-trash"></i> 
                         </s:a>    
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </body>
            
      
        
        
       
</html>
