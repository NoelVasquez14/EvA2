/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelos.Horario;


import utils.MySqlConexion;

/**
 *
 * @author nvasq_
 */
public class GestionHorario {
    
private int id;  
    public void RegistrarEntradas(Horario data){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "INSERT INTO HORARIO(catalogo_id , ponente_id ) VALUES (? , ? )";
         pstm = cnx.prepareStatement(sql);
         pstm.setInt(1,data.getCatalogo_id());
         pstm.setInt(2,data.getPonente_id());
        
         
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
    
    public void Eliminar(Horario dato){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "DELETE FROM HORARIO  WHERE id=(?) ";
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
    
    public void Actualizar(Horario data , int id){
     Connection cnx= null;
     PreparedStatement pstm = null;
    
     try {
         cnx = MySqlConexion.getConection();
         String sql = "UPDATE  HORARIO SET catalogo_id=(?),ponente_id=(?)  WHERE id="+id;
         
         pstm = cnx.prepareStatement(sql);
       
         pstm.setInt(1,data.getCatalogo_id());
         pstm.setInt(2,data.getPonente_id());
      
       
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