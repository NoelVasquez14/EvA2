<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  />
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" ></script>
    </head>
    <body  style="background: #99ffcc">
        
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
        
    </body>
    </html>
