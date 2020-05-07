/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelos.Categoria;
import modelos.Organizador;
import utils.MySqlConexion;

/**
 *
 * @author nvasq_
 */
public class GestionOrganizador {
    
private int id;  
    public void RegistrarEntradas(Organizador data){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "INSERT INTO ORGANIZADOR(nombreorazonsocial , rfc , contacto , url , correo , telefono , direccion) VALUES (? , ? , ? ,? ,? ,? ,?)";
         pstm = cnx.prepareStatement(sql);
         pstm.setString(1,data.getNombreorazonsocial());
         pstm.setString(2,data.getRfc());
         pstm.setString(3,data.getContacto());
         pstm.setString(4,data.getUrl());
         pstm.setString(5,data.getCorreo());
         pstm.setString(6,data.getTelefono());
         pstm.setString(7,data.getDireccion());
         
         pstm.executeUpdate();
         
     } catch(Exception e){
         e.printStackTrace();
     }
     finally{
         try{
             if (pstm != null){
                 pstm.close();
                 
             }
             if(cnx != null){
                 cnx.close();
                 
             }
             
         } catch(Exception e2){ 
             e2.printStackTrace();
         }
     }
 }
    
    public void Eliminar(Organizador dato){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "DELETE FROM ORGANIZADOR  WHERE id=(?) ";
         pstm = cnx.prepareStatement(sql);
         pstm.setInt(1,dato.getId());
         
         pstm.executeUpdate();
         
     } catch(Exception e){
         e.printStackTrace();
     }
     finally{
         try{
             if (pstm != null){
                 pstm.close();
                 
             }
             if(cnx != null){
                 cnx.close();
                 
             }
             
         } catch(Exception e2){ 
             e2.printStackTrace();
         }
     }
 }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
}   
    
    public void Actualizar(Organizador data , int id){
     Connection cnx= null;
     PreparedStatement pstm = null;
    
     try {
         cnx = MySqlConexion.getConection();
         String sql = "UPDATE  ORGANIZADOR SET nombreorazonsocial=(?),rfc=(?),contacto=(?),url=(?),correo=(?),telefono=(?),direccion=(?)  WHERE id="+id;
         
         pstm = cnx.prepareStatement(sql);
       
         pstm.setString(1,data.getNombreorazonsocial());
         pstm.setString(2,data.getRfc());
         pstm.setString(3,data.getContacto());
         pstm.setString(4,data.getUrl());
         pstm.setString(5,data.getCorreo());
         pstm.setString(6,data.getTelefono());
         pstm.setString(7,data.getDireccion());
         
         
        
         
         
       
       
         pstm.executeUpdate();
        
     } catch(Exception e){
         e.printStackTrace();
     }
     finally{
         try{
             if (pstm != null){
                 pstm.close();
                 
             }
             if(cnx != null){
                 cnx.close();
                 
             }
             
         } catch(Exception e2){ 
             e2.printStackTrace();
         }
     }
 }

 
}