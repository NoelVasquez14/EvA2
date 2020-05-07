<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        
    </head>
    <body>
        
           <div class="flex-center position-ref full-height">
            
            <div class="content">
                <div class="title m-b-md">
                    STRUTS2
                </div>

                <div class="links">

                    <s:a action="categoria/categoria" > 

                        <i class="btn btn-primary">CATEGORIA</i> 
                    </s:a>   
                    <s:a action="actividad/actividad" > 

                        <i class="btn btn-primary">ACTIVIDAD</i> 
                    </s:a>  
                    <s:a action="ponente/ponente" > 

                        <i class="btn btn-primary">PONENTE</i> 
                    </s:a>  
                 
                    <s:a action="participante/participante" > 

                    <i class="btn btn-primary">PARTICIPANTE</i> 
                    </s:a>  
                     <s:a action="organizador/organizador" > 

                    <i class="btn btn-primary">ORGANIZADOR</i> 
                    </s:a>  
                </div>
            </div>
        </div>
            
    </body>
</html>
