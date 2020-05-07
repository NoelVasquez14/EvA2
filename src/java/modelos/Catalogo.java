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
public class Catalogo {
 private int id;
    private String titulo;
    private int actividad_id;
    private int evento_id;
    private double costo;
    private int totalhoras;
    private int cupolimite;
 private Connection con;
    private PreparedStatement consultas;
    private ResultSet datos;
    private String server, user , bd, pass;
    private ArrayList<Catalogo> arreglo;
    
    
    public Catalogo(){
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
   
      public ArrayList<Catalogo> getData(String sql) throws SQLException, Exception
     {
         this.arreglo= new ArrayList<>();
         this.con();
         this.consultas=this.con.prepareStatement(sql);
         this.datos=this.consultas.executeQuery();
         
         while(this.datos.next())
         {
             this.arreglo.add(new Catalogo(datos.getInt("id"),datos.getString("titulo"), 
              datos.getInt("actividad_id"),datos.getInt("evento_id")
            , datos.getDouble("costo"), datos.getInt("totalhoras"), datos.getInt("cupolimite")));
         }
         
         return this.arreglo;
         
       
     }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getActividad_id() {
        return actividad_id;
    }

    public void setActividad_id(int actividad_id) {
        this.actividad_id = actividad_id;
    }

    public int getEvento_id() {
        return evento_id;
    }

    public void setEvento_id(int evento_id) {
        this.evento_id = evento_id;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getTotalhoras() {
        return totalhoras;
    }

    public void setTotalhoras(int totalhoras) {
        this.totalhoras = totalhoras;
    }

    public int getCupolimite() {
        return cupolimite;
    }

    public void setCupolimite(int cupolimite) {
        this.cupolimite = cupolimite;
    }

    public Catalogo( String titulo, int actividad_id, int evento_id, double costo, int totalhoras, int cupolimite) {
    
        this.titulo = titulo;
        this.actividad_id = actividad_id;
        this.evento_id = evento_id;
        this.costo = costo;
        this.totalhoras = totalhoras;
        this.cupolimite = cupolimite;
    }

    public Catalogo(int id, String titulo, int actividad_id, int evento_id, double costo, int totalhoras, int cupolimite) {
        this.id = id;
        this.titulo = titulo;
        this.actividad_id = actividad_id;
        this.evento_id = evento_id;
        this.costo = costo;
        this.totalhoras = totalhoras;
        this.cupolimite = cupolimite;
    }

    public Catalogo(int id) {
        this.id = id;
    }
    
    
       
}
