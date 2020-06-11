<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        
    </head>
    <body >
      
           <div align="center" style="border-color: red">
            
               <div class="content" style="align-content: center">
                   <h1 style="color: red" > PROYECTO REALIZADO CON STRUST2 </h1>

                <div class="container">

                    <s:a action="categoria/categoria" > 

                        <i class="btn btn-primary" >CATEGORIA</i> 
                    </s:a>   
                    <s:a action="actividad/actividad" > 

                        <i class="btn btn-primary">ACTIVIDAD</i> 
                    </s:a>  
                    <s:a action="horario/horario" > 

                        <i class="btn btn-primary">HORARIO</i> 
                    </s:a>  
                 
                    <s:a action="participante/participante" > 

                    <i class="btn btn-primary">PARTICIPANTE</i> 
                    </s:a>  
                     <s:a action="organizador/organizador" > 

                    <i class="btn btn-primary">ORGANIZADOR</i> 
                    </s:a>  
                     <s:a action="pago/pago" > 

                    <i class="btn btn-primary">PAGO</i> 
                    </s:a>  
                    <s:a action="evento/evento" > 

                    <i class="btn btn-primary">EVENTO</i> 
                    </s:a>  
                </div>
            </div>
        </div>
          
    </body>
</html>
