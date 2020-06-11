/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import modelos.Pago;
import utils.MySqlConexion;

/**
 *
 * @author nvasq_
 */
public class GestionPago {
    
private int id;  
    public void RegistrarEntradas(Pago data){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "INSERT INTO PAGO( fechaPago , participante_id ) VALUES (? ,?)";
         pstm = cnx.prepareStatement(sql);
         pstm.setDate(1,  data.getFechapago());
         pstm.setInt(2,data.getParticipanteId());
        
         
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
    
    public void Eliminar(Pago dato){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "DELETE FROM PAGO  WHERE id=(?) ";
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
    
    public void Actualizar(Pago data , int id){
     Connection cnx= null;
     PreparedStatement pstm = null;
    
     try {
         cnx = MySqlConexion.getConection();
         String sql = "UPDATE  ORGANIZADOR SET fechapago=(?), participante_id=(?)  WHERE id="+id;
         
         pstm = cnx.prepareStatement(sql);
       
         pstm.setDate(1,  data.getFechapago());
         pstm.setInt(2,data.getParticipante_id());
        
         
         
        
         
         
       
       
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