/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Actividad;
import utils.MySqlConexion;

/**
 *
 * @author nvasq_
 */
public class GestionActividad {
    private ArrayList<Actividad> datos;
    private int id;
    private String txtdescripcion;
    public void RegistrarEntradas(Actividad data){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "INSERT INTO ACTIVIDAD(descripcion) VALUES (?)";
         pstm = cnx.prepareStatement(sql);
         pstm.setString(1,data.getDescripcion());
         
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
    
    public void Eliminar(Actividad dato){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "DELETE FROM ACTIVIDAD  WHERE id=(?) ";
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
   
    
    
    public void Actualizar(Actividad datos , int id){
     Connection cnx= null;
     PreparedStatement pstm = null;
    
     try {
         cnx = MySqlConexion.getConection();
         String sql = "UPDATE  ACTIVIDAD SET descripcion=(?) WHERE id="+id;
         
        // String sql ="update ACTIVIDAD set descripcion=(?)  WHERE id="+id;
         pstm = cnx.prepareStatement(sql);
         pstm.setString(1 , datos.getDescripcion());
        
         
         
       
       
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

    
    
}
