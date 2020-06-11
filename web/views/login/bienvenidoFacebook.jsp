
<%@page import="rest_fb.User_Profile"%>
<%@page import="rest_fb.Get_User_Details"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" ></script>
    </head>
    
    
    <body>
        
            <header class="top-header">
            <nav class="navbar navbar-expand-lg navbar-light bg-dark" >
 
<a class="navbar-brand" style="color: white">
    <img src="/evaStruts/imagenes/logo2.png"    <img src="/imagenes/logo.png" width="60" height="60" class="d-inline-block align-top" alt="">
 
    STRUTS2
   
  </a>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" 
           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
          Categoria
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="categoria/categoria">Lista de categorias</a>
          <a class="dropdown-item" href="categoria/insertar">Agregar Categoria</a>
          
        </div>
      </li>
    </ul>
      <ul class="navbar-nav mr-auto">
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" 
           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
          Actividad
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="actividad/actividad">Lista de acitvidades</a>
          <a class="dropdown-item" href="actividad/insertar">Agregar actividad</a>
          
        </div>
      </li>
    </ul>
      <ul class="navbar-nav mr-auto">
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" 
           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
         Catalogo
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="catalogo/catalogo">Lista de catalogos</a>
          <a class="dropdown-item" href="catalogo/insertar">Agregar catalogo</a>
          
        </div>
      </li>
    </ul>
      <ul class="navbar-nav mr-auto">
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" 
           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
         participante
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="participante/participante">Lista de participantes</a>
          <a class="dropdown-item" href="participante/insertar">Agregar participante</a>
          
        </div>
      </li>
    </ul>
      <ul class="navbar-nav mr-auto">
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" 
           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
        Horario
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="horario/horario">Lista de horarios</a>
          <a class="dropdown-item" href="horario/horario">Agregar horario</a>
          
        </div>
      </li>
    </ul>
      <ul class="navbar-nav mr-auto">
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" 
           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
        Pago
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="pago/pago">Lista de pago</a>
          <a class="dropdown-item" href="pago/pago">Agregar pago</a>
          
        </div>
      </li>
      </ul>
      <ul class="navbar-nav mr-auto">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" 
           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
        Organizador
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="organizador/organizador">Listado de organizadores </a>
          <a class="dropdown-item" href="organizador/organizador">Agregar Organizador</a>
          
        </div>
      </li>
      </ul>
       <ul class="navbar-nav mr-auto">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" 
           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
        Evento
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="evento/evento">Listado de eventos </a>
          <a class="dropdown-item" href="evento/evento">Agregar Evento</a>
          
        </div>
      </li>
      </ul>
      <ul class="navbar-nav mr-auto">
      
  </div>
</nav>
    </header>
       <%
 String access_token=(String)request.getParameter("access_token");
 Get_User_Details obj_Get_User_Details=new Get_User_Details();
 User_Profile obj_User_Profile=obj_Get_User_Details.Get_Profile_info(access_token);
 %>
   <fieldset aling="center" style="border-color: #0e12ff" >
       <legend>  Inicio de sesión correcta </legend> 
       <label style="color: red"> Token :</label>
        <%=access_token %> <br>
  <label style="color: red" style="text-decoration: black" >Nombre de usuario: </label>
 <%=obj_User_Profile.getUser_name() %> <br>
 <label style="color: red" > ID_Usuario: </label>
  <%=obj_User_Profile.getId() %> <br>
  <label style="color: red" >  Email : </label>
 <%=obj_User_Profile.getEmail() %> <br>
  <label style="color: red" >   Picture : </label>
 <%=obj_User_Profile.getPicture() %> <br>

 
 
 </fieldset>
    </body>
</html>
