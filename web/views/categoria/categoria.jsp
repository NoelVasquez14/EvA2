
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
        <h1>Lista de categorias</h1>
        
        <p>
            <s:a  action ="execute" cssClass="btn btn-success" href="views/categoria/insertar.jsp"> Agregar</s:a>
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
