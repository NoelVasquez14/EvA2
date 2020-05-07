
<%@page import="rest_fb.User_Profile"%>
<%@page import="rest_fb.Get_User_Details"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    
    <body>
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
