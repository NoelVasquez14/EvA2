<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="UTF-8"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
         
        <title  >Evento</title>
    
    </head>
    <body>
        <h1 align="center" >Lista de eventos</h1>
        
        <p>
            <s:a  action ="insertar" cssClass="btn btn-success" > Agregar</s:a>
    </p>
        <table class="table table-bordered">
            <thead> 
            <th>ID</th>
            <th>Titulo</th>
             <th>Descripcion</th>
            <th>Fecha inicio</th>
            <th>Fecha fin</th>
            <th>Observaciones</th>
            <th>Logotipo</th>
            <th>eslogan</th>
            <th>Lugar</th>
             <th>Categoria_Id</th>
            <th>inicio de Registro</th>
            <th>Cierre de Registro</th>
            <th>Organizador id</th>
            
            <th>ACCIONES</th>
            </thead>
            <tbody>
            <s:iterator value="datos" var="dato" status="estado"> 
                <tr>
    
                    <td> <s:property value="id" />  </td>
                    <td> <s:property value="titulo" />  </td>
                    <td> <s:property value="descripcion" />  </td>
                    <td> <s:property  value="fechainicio" />  </td>
                    <td> <s:property value="fechafin" />  </td>
                    <td> <s:property value="observaciones" />  </td>
                    <td> <s:property value="logotipo" />  </td>
                    <td> <s:property value="slogan" />  </td>
                    <td> <s:property value="lugar" />  </td>
                    <td> <s:property value="categoria_id" />  </td>
                    <td> <s:property value="inicioregistro" />  </td>
                    <td> <s:property value="cierreregistro" />  </td>
                    <td> <s:property value="id_organizador" />  </td>
                    
                    <td> 
                        <s:a action="editar" href="views/evento/editar.jsp"> 
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

