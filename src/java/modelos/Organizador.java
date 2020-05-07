
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author nvasq_
 */
public class Organizador {
    private Connection con;
    private PreparedStatement consultas;
    private ResultSet datos;
    private String server, user , bd, pass;
    private ArrayList<Organizador> arreglo;
   
    public Organizador(){
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
   
      public ArrayList<Organizador> getData(String sql) throws SQLException, Exception
     {
         this.arreglo= new ArrayList<>();
         this.con();
         this.consultas=this.con.prepareStatement(sql);
         this.datos=this.consultas.executeQuery();
         
         while(this.datos.next())
         {
             this.arreglo.add(new Organizador(datos.getInt("id"),datos.getString("nombreorazonsocial"), 
              datos.getString("rfc"),datos.getString("contacto")
            , datos.getString("url"), datos.getString("correo"), datos.getString("telefono"), datos.getString("direccion")));
         }
         
         return this.arreglo;
         
       
     }
      
      private int id;
      private String nombreorazonsocial;
      private String rfc;
      private String contacto;
      private String url;
      private String correo;
      private String telefono;
      private String direccion;
      
     public Organizador(int id , String nombreorazonsocial , String rfc, String contacto,  String url , String correo , String telefono , String direccion ){
    this.id= id;
    this.nombreorazonsocial=nombreorazonsocial;
    this.rfc= rfc;
    this.contacto=contacto;
    this.url=url;
    this.correo=correo;
    this.telefono=telefono;
    this.direccion=direccion;
    
    
}

    public Organizador(String nombreorazonsocial, String rfc, String contacto, String url, String correo, String telefono, String direccion) {
        this.nombreorazonsocial = nombreorazonsocial;
        this.rfc = rfc;
        this.contacto = contacto;
        this.url = url;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Organizador(int id) {
        this.id = id;
    }

    

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreorazonsocial() {
        return nombreorazonsocial;
    }

    public void setNombreorazonsocial(String nombreorazonsocial) {
        this.nombreorazonsocial = nombreorazonsocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   

   

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
      
}
