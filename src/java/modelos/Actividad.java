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
import controller.ActividadController;
import utils.MySqlConexion;
/**
 *
 * @author nvasq_
 */


public class Actividad {
    
      private String descripcion;
 private Connection con;
    private PreparedStatement consultas;
    private ResultSet datos;
    private String server, user , bd, pass;
    private ArrayList<Categoria> arreglo;
    private ArrayList<Actividad> arreglo1;
    private Actividad a;
    public String sql = "insert into actividad(descripcion) values (?);";
     private int id;
 
   
     
     
    
    public Actividad(){
        this.server ="localhost";
        this.user="root";
        this.pass="";
        this.bd= "eva";
        
    }
 
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
   
      public ArrayList<Categoria> getData(String sql) throws SQLException, Exception
     {
         this.arreglo= new ArrayList<>();
         this.con();
         this.consultas=this.con.prepareStatement(sql);
         this.datos=this.consultas.executeQuery();
         
         while(this.datos.next())
         {
             this.arreglo.add(new Categoria(datos.getInt("id"),datos.getString("descripcion")));
         }
         
         return this.arreglo;
         
       
     }
      
      
    public Actividad( String descripcion) {
        
        this.descripcion = descripcion;
    }
    
    public class Categoria {
   
   public int id;
   public String descripcion;

    public Categoria(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
      
     

    public Categoria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
   
}
     public boolean insertarActividad(Actividad a) throws Exception{
          
      
         boolean resultado= false;
          Connection con1 = con;
          PreparedStatement ps= con1.prepareStatement(sql);
          ps.setString(1, a.getDescripcion());
          if (ps.executeUpdate()==1){
              resultado = true;
              ps.close();
              con.close();
          }
          
          return resultado;
      }
}
