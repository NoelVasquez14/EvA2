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


public class Actividad {
    
     private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    private PreparedStatement consultas;
     private PreparedStatement tsnt;
    private ResultSet datos;
    private String server, user , bd, pass;
    private ArrayList<Actividad> arreglo;
    private String actividad;
  private Actividad objAct;
    
    public Actividad(){
        this.server ="localhost";
        this.user="root";
        this.pass="";
        this.bd= "eva";
        
    }

    public Actividad getObjAct() {
        return objAct;
    }

    public void setObjAct(Actividad objAct) {
        this.objAct = objAct;
    }
    
    
    
    
    public String getActividad() {
        return actividad;
    }

    public void setCategoria(String actividad) {
        this.actividad = actividad;
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
   
      public ArrayList<Actividad> getData(String sql) throws SQLException, Exception
     {
         this.arreglo= new ArrayList<>();
         this.con();
         this.consultas=this.con.prepareStatement(sql);
         this.datos=this.consultas.executeQuery();
         
         while(this.datos.next())
         {
             this.arreglo.add(new Actividad(datos.getInt("id"),datos.getString("descripcion")));
         }
         
         return this.arreglo;
         
       
     }

    private int id;
    private String descripcion;

    public Actividad(int id) {
        this.id = id;
    }
    

    public Actividad(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    /*
public static boolean agregarCategoria(CategoriaController_1  descripcion){
  boolean agregado=false;
  try {
   Conectar c=new Conectar();
   Connection con=c.getCon();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    st.executeUpdate("INSERT INTO categoria VALUES (?)");
    agregado=true;
    st.close();
   }
   c.desconectar();
  } catch (SQLException e) {
   agregado=false;
   e.printStackTrace();
  }
  
  return agregado;
 }

 */

    public Actividad(String descripcion) {
        this.descripcion = descripcion;
    }

       
      
     

   
}
    