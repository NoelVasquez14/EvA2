
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
         
        <title>Catalogo</title>
    
    </head>
    <body>
        <h1>CATALOGO</h1>
        
        <p>
       <s:a   cssClass="btn btn-success" action="insertar" > Agregar</s:a>
    </p>
        <table class="table table-bordered">
            <thead> 
            <th>ID</th>
            <th>TITULO</th>
            <th>ID ACTIVIDAD </th>
            <th>ID EVENTO</th>
            <th>COSTO</th>
            <th>TOTAL DE HORAS </th>
            <th>CUPO LIMITE </th>
            <th>ACCIONES</th>
            </thead>
            <tbody>
            <s:iterator value="datos" var="dato" status="estado"> 
                <tr>
                    <td> <s:property value="id" />  </td>
                    <td> <s:property value="titulo" />  </td>
                     <td> <s:property value="actividad_id" />  </td>
                      <td> <s:property value="evento_id" />  </td>
                       <td> $<s:property value="costo" />  </td>
                        <td> <s:property value="totalhoras" />  </td>
                         <td> <s:property value="cupolimite" />  </td>
                    <td> <s:a action="execute1" > 
                            <s:param name="id" value="id"/>
                            <i class="btn btn-primary">EDITAR</i> 
                        </s:a>   
                        <s:a action="eliminar"> 
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
