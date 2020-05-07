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
import modelos.Ponente;
import utils.MySqlConexion;

/**
 *
 * @author nvasq_
 */
public class GestionPonente {
     
     PreparedStatement ps=null;
     ResultSet rs;
      private int r=0;
    public void Agregar(Ponente p){
        Connection cnx= null;
        
        try{
            String sql= "INSERT INTO PONENTE(nombrecompleto, sexo , foto , cv , cuenta, password , correo) VALUES (? , ? , ? , ? , ?, ? , ? , ?)";
        cnx = MySqlConexion.getConection(); 
        ps=cnx.prepareStatement(sql);
        ps.setString(1 , p.getNombrecompleto());
        ps.setString(2 , p.getSexo());
        ps.setString(3 , p.getFoto());
        ps.setString(4 , p.getCv());
        ps.setString(5 , p.getNivelacademico());
        ps.setString(6 , p.getCuenta());
        ps.setString(7 , p.getPassword());
        ps.setString(8, p.getCuenta());
        ps.executeUpdate();
        
       
        
        
        
        
        
        
        
        
        } catch(Exception e){
            
        }
      
        
    
    }
}
    /*
    private ArrayList<Ponente> datos;
    public void RegistrarEntradas(Ponente data){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "INSERT INTO ACTIVIDAD(nombrecompleto, sexo , foto , cv , cuenta, password , correo) VALUES (? , ? , ? , ? , ?, ? , ? , ?)";
         pstm = cnx.prepareStatement(sql);
         pstm.setString(1,data.getNombrecompleto());
         pstm.setString(1,data.getSexo());
         pstm.setString(1,data.getFoto());
         pstm.setString(1,data.getCv());
         pstm.setString(1,data.getNivelacademico());
         pstm.setString(1,data.getCuenta());
         pstm.setString(1,data.getPassword());
         pstm.setString(1,data.getCorreo());
         
         
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
    
    public void Eliminar(Ponente dato){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "DELETE FROM PONENTE WHERE id=(?) ";
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
   
    
    
    public void Actualizar(Ponente datos , int id){
     Connection cnx= null;
     PreparedStatement pstm = null;
    
     try {
         cnx = MySqlConexion.getConection();
         String sql = "UPDATE PONENTE SET descripcion= ?  WHERE id=? ";
         pstm = cnx.prepareStatement(sql);
            pstm.setString(1 , datos.getDescripcion());
         pstm.setInt(2,datos.getId());  
       
       
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
 * 
 * */


