/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelos.Catalogo;
import utils.MySqlConexion;

/**
 *
 * @author nvasq_
 */
public class GestionCatalogo {
    private int id;
    public void RegistrarEntradas(Catalogo data){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "INSERT INTO CATALOGO(titulo , actividad_id , evento_id  , costo , totalhoras , cupolimite) VALUES (? , ? , ? ,? ,? ,?)";
         pstm = cnx.prepareStatement(sql);
         pstm.setString(1,data.getTitulo());
         pstm.setInt(2,data.getActividad_id());
         pstm.setInt(3,data.getEvento_id());
         pstm.setDouble(4,data.getCosto());
         pstm.setInt(5,data.getTotalhoras());
         pstm.setInt(6,data.getCupolimite());
         
         
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
    
    public void Eliminar(Catalogo dato){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "DELETE FROM  CATALOGO  WHERE id=(?) ";
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
    
    public void Actualizar(Catalogo data , int id){
     Connection cnx= null;
     PreparedStatement pstm = null;
    
     try {
         cnx = MySqlConexion.getConection();
         String sql = "UPDATE  CATALOGO SET titulo=(?),actividad_id=(?),evento_id=(?),costo=(?),totalhoras=(?),cupolimite=(?)  WHERE id="+id;
         
         pstm = cnx.prepareStatement(sql);
       
         pstm = cnx.prepareStatement(sql);
         pstm.setString(1,data.getTitulo());
         pstm.setInt(2,data.getActividad_id());
         pstm.setInt(3,data.getEvento_id());
         pstm.setDouble(4,data.getCosto());
         pstm.setInt(5,data.getTotalhoras());
         pstm.setInt(6,data.getCupolimite());
         
         
        
         
         
       
       
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
