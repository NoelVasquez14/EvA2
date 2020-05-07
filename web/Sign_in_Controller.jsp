<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="rest_fb.User_Profile"%>
<%@page import="rest_fb.Get_User_Details"%>

 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
  
 <%
 String access_token=(String)request.getParameter("access_token");
 Get_User_Details obj_Get_User_Details=new Get_User_Details();
 User_Profile obj_User_Profile=obj_Get_User_Details.Get_Profile_info(access_token);
 %>
   <fieldset aling="center" style="border-color: #0e12ff" >
  <label style="color: black" style="text-decoration: black" >Nombre de usuario: </label>
 <%=obj_User_Profile.getUser_name() %> <br>
 <label style="color: black" > ID_Usuario: </label>
  <%=obj_User_Profile.getId() %> <br>
  <label style="color: black" >  Email : </label>
 <%=obj_User_Profile.getEmail() %> <br>
  <label style="color: black" >   Link : </label>
 <%=obj_User_Profile.getLink() %> <br>
  <label style="color: black" >   Picture : </label>
 <%=obj_User_Profile.getPicture() %> <br>
 
 </fieldset>
</body>
</html>