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
public class Horario {
    private int id;
    private int catalogo_id;
    private int ponente_id;
     private Connection con;
    private PreparedStatement consultas;
         private String server, user , bd, pass;
          private ArrayList<Horario> arreglo;
           private ResultSet datos;
    
    public Horario(){
        this.server ="localhost";
        this.user="root";
        this.pass="";
        this.bd= "eva";
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatalogo_id() {
        return catalogo_id;
    }

    public void setCatalogo_id(int catalogo_id) {
        this.catalogo_id = catalogo_id;
    }

    public int getPonente_id() {
        return ponente_id;
    }

    public void setPonente_id(int ponente_id) {
        this.ponente_id = ponente_id;
    }

    public Horario(int id) {
        this.id = id;
    }

    public Horario(int catalogo_id, int ponente_id) {
        this.catalogo_id = catalogo_id;
        this.ponente_id = ponente_id;
    }

    public Horario(int id, int catalogo_id, int ponente_id) {
        this.id = id;
        this.catalogo_id = catalogo_id;
        this.ponente_id = ponente_id;
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
   
      public ArrayList<Horario> getData(String sql) throws SQLException, Exception
     {
         this.arreglo= new ArrayList<>();
         this.con();
         this.consultas=this.con.prepareStatement(sql);
         this.datos=this.consultas.executeQuery();
         
         while(this.datos.next())
         {
             this.arreglo.add(new Horario(datos.getInt("id"),datos.getInt("catalogo_id" ), datos.getInt("ponente_id")));
         }
         
         return this.arreglo;
         
       
     }

    
      //metodo para 0btenerdatos por id
      
      public ArrayList<Horario> getDatos(String sql) throws SQLException, Exception{
   
     this.arreglo= new ArrayList<>();
         this.con();
         this.consultas=this.con.prepareStatement(sql);
         this.datos=this.consultas.executeQuery();
         
         while(this.datos.next())
         {
             this.arreglo.add(new Horario(datos.getInt("id"),datos.getInt("catalogo_id") , datos.getInt("ponente_id")));
         }
         
         return this.arreglo;
         
    }

    public ArrayList<Horario> getArreglo() {
        return arreglo;
    }

    public void setArreglo(ArrayList<Horario> arreglo) {
        this.arreglo = arreglo;
    }
    
    
}
