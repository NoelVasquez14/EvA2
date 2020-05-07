<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
         
        <title  >Organizador</title>
    
    </head>
    <body>
        <h1 align="center" >Lista de Organizadores</h1>
        
        <p>
            <s:a  action ="insertar" cssClass="btn btn-success" > Agregar</s:a>
    </p>
        <table class="table table-bordered">
            <thead> 
            <th>ID</th>
            <th>Nombre o razón social</th>
            <th>rfc</th>
            <th>contacto</th>
            <th>url</th>
            <th>correo</th>
            <th>telefono</th>
            <th>direccion</th>
            
            
            <th>ACCIONES</th>
            </thead>
            <tbody>
            <s:iterator value="datos" var="dato" status="estado"> 
                <tr>
                    <td> <s:property value="id" />  </td>
                    <td> <s:property value="nombreorazonsocial" />  </td>
                    <td> <s:property value="rfc" />  </td>
                    <td> <s:property  value="contacto" />  </td>
                    <td> <s:property value="url" />  </td>
                    <td> <s:property value="correo" />  </td>
                    <td> <s:property value="telefono" />  </td>
                    <td> <s:property value="direccion" />  </td>
                    <td> 
                        <s:a action="execute1"> 
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

