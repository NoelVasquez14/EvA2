/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelos.Categoria;
import utils.MySqlConexion;

/**
 *
 * @author nvasq_
 */
public class GestionCategoria {
    
    public void RegistrarEntradas(Categoria data){
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
    public void RegistrarCategoria(Categoria data){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "INSERT INTO CATEGORIA(descripcion) VALUES (?)";
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
}
