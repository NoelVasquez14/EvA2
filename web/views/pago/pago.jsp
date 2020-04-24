<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
         
        <title  >Pagos</title>
    
    </head>
    <body>
        <h1 align="center" >Lista de Pagos</h1>
        
        <p>
            <s:a  action ="execute" cssClass="btn btn-success" href="views/categoria/insertar.jsp"> Agregar</s:a>
    </p>
        <table class="table table-bordered">
            <thead> 
            <th>ID</th>
            <th>fechade pago</th>
            <th>Participante_id:</th>
            
            
            
            <th>ACCIONES</th>
            </thead>
            <tbody>
            <s:iterator value="datos" var="dato" status="estado"> 
                <tr>
                    <td> <s:property value="id" />  </td>
                    <td> <s:property value="fechapago" />  </td>
                    <td> <s:property value="participante_id" />  </td>
                    
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

