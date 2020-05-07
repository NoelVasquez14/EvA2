/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import modelos.Evento;

import utils.MySqlConexion;

/**
 *
 * @author nvasq_
 */
public class GestionEvento {
    
private int id;  
    public void RegistrarEntradas(Evento data){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "INSERT INTO EVENTO (titulo,  descripcion,  fechainicio,  fechafin, observaciones,  logotipo, slogan,  lugar, categoria_id, inicioregistro,  cierreregistro,  id_organizador) VALUES (? , ? , ? ,? ,? ,? ,?,?,?,?,? , ?)";
         pstm = cnx.prepareStatement(sql);
         pstm.setString(1,data.getTitulo());
         pstm.setString(2,data.getDescripcion());
         pstm.setDate(3,data.getFechainicio());
         pstm.setDate(4,data.getFechafin());
         pstm.setString(5,data.getObservaciones());
         pstm.setString(6,data.getLogotipo());
         pstm.setString(7,data.getSlogan());
           pstm.setString(8,data.getLugar());
           pstm.setInt(9,data.getCategoria_id());
            pstm.setDate(10,data.getInicioregistro());
         pstm.setDate(11,data.getCierreregistro());
         pstm.setInt(12,data.getId_organizador());
         
           
         
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
    
    public void Eliminar(Evento dato){
     Connection cnx= null;
     PreparedStatement pstm = null;
     try {
         cnx = MySqlConexion.getConection();
         String sql = "DELETE FROM EVENTO  WHERE id=(?) ";
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
    
    public void Actualizar(Evento data , int id){
     Connection cnx= null;
     PreparedStatement pstm = null;
    
     try {
         cnx = MySqlConexion.getConection();
         String sql = "UPDATE  ORGANIZADOR SET nombreorazonsocial=(?),rfc=(?),contacto=(?),url=(?),correo=(?),telefono=(?),direccion=(?)  WHERE id="+id;
         
         pstm = cnx.prepareStatement(sql);
       
     pstm = cnx.prepareStatement(sql);
         pstm.setString(1,data.getTitulo());
         pstm.setString(2,data.getDescripcion());
         pstm.setDate(3,data.getFechainicio());
         pstm.setDate(4,data.getFechafin());
         pstm.setString(5,data.getObservaciones());
         pstm.setString(6,data.getLogotipo());
         pstm.setString(7,data.getSlogan());
           pstm.setString(7,data.getLugar());
           pstm.setInt(9,data.getCategoria_id());
            pstm.setDate(3,data.getInicioregistro());
         pstm.setDate(4,data.getCierreregistro());
         pstm.setInt(9,data.getId_organizador());
        
         
         
       
       
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