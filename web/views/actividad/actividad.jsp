
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
         
        <title>Actividades</title>
    
    </head>
    <body>
        <h1>Lista de actividade</h1>
        
        <p>
       <s:a   cssClass="btn btn-success" action="insertar" > Agregar</s:a>
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
                    <td> <s:a action="execute1" > 
                            <s:param name="id" value="id"/>
                            <i class="btn btn-primary">EDITAR</i> 
                        </s:a>   
                        <s:a action="eliminarActividad"> 
                                <s:param name="id" value="id"/>
                                <i  class="btn btn-danger">ELIMINAR</i> 
                        </s:a> 
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </body>
            
      
        
        
       
</html>
