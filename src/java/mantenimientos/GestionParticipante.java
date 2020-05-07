/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import modelos.Participante;
import utils.MySqlConexion;

/**
 *
 * @author nvasq_
 */
public class GestionParticipante {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public void RegistrarParticipante(Participante data){
     Connection cnx= null;
    
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "INSERT INTO PARTICIPANTE(nombrecompleto , curp , intitucionprocedencia , cuenta , password) VALUES ( ? , ? , ? , ? , ?)";
         pstm = cnx.prepareStatement(sql);
        pstm.setString(1,data.getNombrecompleto());
         pstm.setString(2,data.getCurp());
         pstm.setString(3,data.getIntitucionprocedencia());
         pstm.setString(4,data.getCuenta());
         pstm.setString(5,data.getPassword());
         
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
     public void Actualizar(Participante datos ,  int id){
     Connection cnx= null;
     PreparedStatement pstm = null;
    
     try {
         cnx = MySqlConexion.getConection();
         String sql = "UPDATE  PARTICIPANTE SET nombrecompleto=(?),curp=(?),intitucionprocedencia=(?),cuenta=(?),password=(?)  WHERE id="+id;
         
        // String sql ="update ACTIVIDAD set descripcion=(?)  WHERE id="+id;
         pstm = cnx.prepareStatement(sql);
         pstm.setString(1 , datos.getNombrecompleto());
         pstm.setString(2 , datos.getCurp());
         pstm.setString(3 , datos.getIntitucionprocedencia());
         pstm.setString(4 , datos.getCuenta());
         pstm.setString(5 , datos.getPassword());
         
        
       
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
     
    public void Eliminar(Participante dato){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "DELETE FROM PARTICIPANTE  WHERE id=(?) ";
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
}
