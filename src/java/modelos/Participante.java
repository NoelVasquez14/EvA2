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
public class Participante {
    private Connection con;
    private PreparedStatement consultas;
    private ResultSet datos;
    private String server, user , bd, pass;
    private ArrayList<Participante> arreglo;
   
    public Participante(){
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
   
      public ArrayList<Participante> getData(String sql) throws SQLException, Exception
     {
         this.arreglo= new ArrayList<>();
         this.con();
         this.consultas=this.con.prepareStatement(sql);
         this.datos=this.consultas.executeQuery();
         
         while(this.datos.next())
         {
             this.arreglo.add(new Participante(datos.getInt("id"),datos.getString("nombrecompleto"), 
              datos.getString("curp"),datos.getString("institucionprocedencia")
            , datos.getString("cuenta"), datos.getString("password"), datos.getString("correo")));
         }
         
         return this.arreglo;
         
       
     }
      
      private int id;
      private String nombrecompleto;
      private String curp;
      private String intitucionprocedencia;
      private String cuenta;
      private String password;
      private String correo;
      
     public Participante(int id , String nombrecompleto , String curp, String institucionprocedencia,  String cuenta , String password , String correo ){
    this.id= id;
    this.nombrecompleto=nombrecompleto;
    this.curp= curp;
    this.intitucionprocedencia=institucionprocedencia;
    this.cuenta=cuenta;
    this.password=password;
    this.correo=correo;
    
    
}

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getIntitucionprocedencia() {
        return intitucionprocedencia;
    }

    public void setIntitucionprocedencia(String intitucionprocedencia) {
        this.intitucionprocedencia = intitucionprocedencia;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

   

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
      
}
