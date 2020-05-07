<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=x-MacArabic">
        <title>JSP Page</title>
    </head>
    <body>
       <s:actionerror />
   
   Nombre: <s:property value="nombre" /><br />
Ruta: <s:property value="ruta" /><br />
Autor: <s:property value="nombrecompleto" /><br />
Content Type: <s:property value="archivoContentType" />
    </body>
</html>
