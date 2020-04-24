/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nvasq_
 */
public class Pago {
    private Connection con;
    private PreparedStatement consultas;
    private ResultSet datos;
    private String server, user , bd, pass;
    private ArrayList<Pago> arreglo;
   
    public Pago(){
        this.server ="localhost";
        this.user="root";
        this.pass="";
        this.bd= "eva";
        
    }
    
    public void con() throws Exception
    {
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
            this.con=DriverManager.getConnection("jdbc:mysql://"+this.server+"/"+this.bd, this.user, this.pass);      
     } catch (ClassNotFoundException e)
     {
         e.printStackTrace();
         
     }
    }
     public void desconectar() throws SQLException
     {
         this.con.close();
     } 
   
      public ArrayList<Pago> getData(String sql) throws SQLException, Exception
     {
         this.arreglo= new ArrayList<>();
         this.con();
         this.consultas=this.con.prepareStatement(sql);
         this.datos=this.consultas.executeQuery();
         
         while(this.datos.next())
         {
             this.arreglo.add(new Pago(datos.getInt("id"),datos.getString("fechapago"), 
              datos.getInt("participante_id")));
         }
         
         return this.arreglo;
         
       
     }
      
      private int id;
      private String fechapago;
      private int participante_id;
      
      
     public Pago(int id , String fechapago , int participante_id ){
    this.id= id;
    this.fechapago=fechapago;
    this.participante_id=participante_id;
    
}

    public int getParticipante_id() {
        return participante_id;
    }

    public void setParticipante_id(int participante_id) {
        this.participante_id = participante_id;
    }
     

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    public int getParticipanteId() {
        return participante_id;
    }

    public void setIdponente(int participante_id) {
        this.participante_id = participante_id;
    }

   
}
