
package modelos;


import controller.CategoriaController_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class Categoria {
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
    private ArrayList<Categoria> arreglo;
    private String categoria;

    
    public Categoria(){
        this.server ="localhost";
        this.user="root";
        this.pass="";
        this.bd= "eva";
        
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    private int id;
    private String descripcion;

    public Categoria(int id, String descripcion) {
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
 }
    
    

