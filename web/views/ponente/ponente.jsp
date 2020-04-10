<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
         
        <title  >Ponente</title>
    
    </head>
    <body>
        <h1 align="center" >Lista de Ponentes</h1>
        
        <p>
            <s:a  action ="execute" cssClass="btn btn-success" href="views/categoria/insertar.jsp"> Agregar</s:a>
    </p>
        <table class="table table-bordered">
            <thead> 
            <th>ID</th>
            <th>Nombre completo</th>
            <th>sexo</th>
            <th>Foto</th>
            <th>CV</th>
            <th>Nivel academico</th>
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
                    <td> <s:property value="sexo" />  </td>
                    <td> <s:property  value="foto" />  </td>
                    <td> <s:property value="cv" />  </td>
                    <td> <s:property value="nivelacademico" />  </td>
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
