<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  /> 
          
        <title>Registro Actividad</title>
    </head> 
    <body  style="background: coral">
        <div align="center" >


            <tr>
                <td>
                    <fieldset align="center" style="width: 300px" class="table ">
                        <s:form action="Registrar" align="center"  style="background:  " >    
                            <legend style="width: 300px">INSERTAR Actividad  </legend>
                            <s:textfield name="descripcion" label="Descripcion" />
                            <s:submit value="Registrar" />
                        </s:form>


                    </fieldset>  
        </div>
    </body>
</html>
