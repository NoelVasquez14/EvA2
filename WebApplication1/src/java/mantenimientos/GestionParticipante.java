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
    
    public void RegistrarEntradas(Participante data){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "INSERT INTO PARTICIPANTE(  nombrecompleto, curp, intitucionprocedencia, cuenta, password) VALUES (? ,? ,?,?,?)";
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
}
