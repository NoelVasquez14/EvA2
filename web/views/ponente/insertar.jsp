<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <title>Registro Ponente</title>
</head>
<body>
<div align="center">
<table>

<tr>
<td>
    <fieldset style="width: 300px"> 
        <legend>Registrar Actividad</legend>
         <div class="container mt-4" >
        <form action="registrarponente" enctype="multipart/form-data" >
            
            
           
                <div class="card">
                    <div class="card-body">
                        <div class="form-group"> 
                            <label>Nombre:</label>
                            <input type="text" name="txtnombrecompleto" class="form-control"/>
                        
                        </div>
                        
                        <div class="form-group"> 
                            <label>Foto:</label>
                            <input type="file" name="foto" "/>
                        
                        </div>
                        
                        
                    </div>
              
                  <div class="card-footer" >
                      
                      <button class="btn btn-outline-primary" name="accion" > GUARDAR</button>  
                  </div>
                     
                </div>
                   
            
        </form>
               </div>
        
        
<s:form action="registrarponente" enctype="multipart/form-data">    
    <div class="form-group">  </div>
    <s:textfield  label="Nombre completo" name="txtnombrecompleto" placeholder="Nombre "></s:textfield>
    <s:textfield label="Sexo" name="txtsexo"  maxlength="1" />
     <s:file name="foto" label="Foto">   </s:file>
     <s:file name="cv" label="txtcv" />
     <s:textfield name="txtnivelacademico" label="Nivel academico" />
     <s:textfield name="txtcuenta" label="Cuenta"  />
     <s:password name="txtpassword" label="Password" />
      <s:submit  value="Registrar" />
</s:form>

    </fieldset> 
</div>
    </body>
</html>
