
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" ></script>
        <title>EditarActividad</title>
</head>

<body style="background: coral">
<p>
        <p>
            <br>
            <br>
            <br>
    <div align="center">
        <div>
            <legend style="background: wheat">Actualizar Actividad</legend>
        </div>
        
        <div  border-color="red">
        <fieldset style="width: 300px"   > 
            
            
            <s:form action="Actualizar"  >   
                 <s:iterator value="datos" var="dato" status="estado" > 
                    <s:textfield name="id" label="id" />
                    <s:textfield  label="Descripcion" name="descripcion"></s:textfield>
                    <s:submit  value="Registrar" />
               </s:iterator>
            </s:form>
            

        </fieldset> 
        </div>
    </div> 
    </center>
    </body>
</html>
