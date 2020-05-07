
package modelos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;



/**
 *
 * @author nvasq_
 */
public class Evento {
    private Connection con;
    private PreparedStatement consultas;
    private ResultSet datos;
    private String server, user , bd, pass;
    private ArrayList<Evento> arreglo;
    private int id;
    private String titulo;
    private String descripcion;
    private Date fechainicio;
    private Date fechafin;
    private String observaciones;
    private String logotipo;
    private String slogan;
    private String lugar;
    private int categoria_id;
    private Date  inicioregistro;
    private Date cierreregistro;
    private int id_organizador;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getLogotipo() {
        return logotipo;
    }

    public void setLogotipo(String logotipo) {
        this.logotipo = logotipo;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getInicioregistro() {
        return inicioregistro;
    }

    public void setInicioregistro(Date inicioregistro) {
        this.inicioregistro = inicioregistro;
    }

    public Date getCierreregistro() {
        return cierreregistro;
    }

    public void setCierreregistro(Date cierreregistro) {
        this.cierreregistro = cierreregistro;
    }

    public int getId_organizador() {
        return id_organizador;
    }

    public void setId_organizador(int id_organizador) {
        this.id_organizador = id_organizador;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }
    

    public Evento(int id, String titulo, String descripcion, Date fechainicio, Date fechafin, String observaciones, String logotipo, String slogan, String lugar, int categoria_id, Date inicioregistro, Date cierreregistro, int id_organizador) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.observaciones = observaciones;
        this.logotipo = logotipo;
        this.slogan = slogan;
        this.lugar = lugar;
        this.categoria_id = categoria_id;
        this.inicioregistro = inicioregistro;
        this.cierreregistro = cierreregistro;
        this.id_organizador = id_organizador;
    }
     public Evento( String titulo, String descripcion, Date fechainicio, Date fechafin, String observaciones, String logotipo, String slogan, String lugar, int categoria_id, Date inicioregistro, Date cierreregistro, int id_organizador) {
        
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.observaciones = observaciones;
        this.logotipo = logotipo;
        this.slogan = slogan;
        this.lugar = lugar;
        this.categoria_id = categoria_id;
        this.inicioregistro = inicioregistro;
        this.cierreregistro = cierreregistro;
        this.id_organizador = id_organizador;
    }
    
     public Evento(int id) {
        this.id = id;
        
    }
   
    public Evento(){
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
   
      public ArrayList<Evento> getData(String sql) throws SQLException, Exception
     {
         this.arreglo= new ArrayList<>();
         this.con();
         this.consultas=this.con.prepareStatement(sql);
         this.datos=this.consultas.executeQuery();
         
         while(this.datos.next())
         {
             this.arreglo.add(new Evento(datos.getInt("id"),datos.getString("titulo"), 
              datos.getString("descripcion"),datos.getDate("fechainicio")
            , datos.getDate("fechafin"), datos.getString("observaciones"), datos.getString("logotipo")
                     , datos.getString("eslogan"),datos.getString("lugar"), datos.getInt("categoria_id"),datos.getDate("inicioregistro")
             ,datos.getDate("cierreregistro"),datos.getInt("organizador_id"))); 
         }
         
         return this.arreglo;
         
       
     }
}