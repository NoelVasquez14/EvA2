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
        <h1 align="center" >Lista de Participnates</h1>
        
        <p>
            <s:a  action ="execute" cssClass="btn btn-success" href="views/categoria/insertar.jsp"> Agregar</s:a>
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
                    <td> <s:property  value="institucionprocedencia" />  </td>
                    <td> <s:property value="cuenta" />  </td>
                    <td> <s:property value="password" />  </td>
                    <td> <s:property value="correo" />  </td>
                    <td> 
                        <s:a action="editar" href="views/categoria/editar.jsp"> 
                            <s:param name="id" value="id"/>
                            <i class="btn btn-primary">EDITAR</i> 
                        </s:a>   
                        <s:a href="views/categoria/eliminar.jsp"> 
                                <s:param name="id" value="id"/>
                                <i action="execute" class="btn btn-danger">ELIMINAR</i> 
                        </s:a>    
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </body>
            
      
        
        
       
</html>