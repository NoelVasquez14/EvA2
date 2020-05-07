<%-- 
    Document   : participoante
    Created on : 10/04/2020, 12:25:55 AM
    Author     : nvasq_
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
         
        <title  >Participante</title>
    
    </head>
    <body>
        <h1 align="center" >Lista de Participantes</h1>
        
        <p aling="center">
            <s:a  action ="insertar" cssClass="btn btn-success" > Agregar</s:a>
            
    </p>
    
           
    
        <table class="table table-bordered">
            <thead> 
            <th>ID:</th>
            <th>Nombre completo:</th>
            <th>Crup:</th>
            <th>Institucin de procedencia:</th>
            <th>cuenta</th>
            <th>password</th>
            <th>correo</th>
            
            <th>ACCIONES</th>
            </thead>
            <tbody>
            <s:iterator value="datos" var="dato" status="estado"> 
                <tr>
                    <td> <s:property value="id" />  </td>
                    <td> <s:property value="nombrecompleto" />  </td>
                    <td> <s:property value="curp" />  </td>
                    <td> <s:property  value="intitucionprocedencia" />  </td>
                    <td> <s:property value="cuenta" />  </td>
                    <td> <s:property value="password" />  </td>
                    
                    <td> 
                        <s:a action="editar" > 
                            <s:param name="id" value="id"/>
                            <i class="btn btn-primary">EDITAR</i> 
                        </s:a>   
                        <s:a action="eliminar"> 
                                <s:param name="id" value="id"/>
                                <i action="eliminar" class="btn btn-danger">ELIMINAR</i> 
                        </s:a>    
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </body>
            
      
        
        
       
</html>