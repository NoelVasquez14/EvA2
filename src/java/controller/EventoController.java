/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Date;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import mantenimientos.GestionEvento;


import modelos.Evento;





/**
 *
 * @author nvasq_
 */
public class EventoController extends  ActionSupport{
     private  String nombre; 

 private EventoController Evento;
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
    private Date inicioregistro;
    private Date cierreregistro;
    private int id_organizador;
   
 
    private Evento objEve;

    public String ingresar(){
    objEve = new Evento(titulo , descripcion, fechainicio , fechafin , observaciones, logotipo , slogan, lugar, categoria_id , inicioregistro ,cierreregistro,id_organizador );
    try {
        GestionEvento ac = new GestionEvento();
        ac.RegistrarEntradas(objEve);
        return "exito";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String  Actualizar(){
    objEve = new Evento (titulo , descripcion, fechainicio,fechafin , observaciones, logotipo, slogan, lugar, categoria_id,inicioregistro,cierreregistro,id_organizador);
    
    try {
        GestionEvento ac = new GestionEvento();
        ac.Actualizar(objEve, id);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    }
    
//metodo que permite eliminar la actividad a traves de la id
public String eliminar(){
    objEve = new Evento (id);
    
    try {
        GestionEvento ac = new GestionEvento();
        ac.Eliminar(objEve);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
}


private ArrayList<Evento> datos;
private Evento con;
private int largo;

    public Evento getCon() {
        return con;
    }
   

    public void setCon(Evento con) {
        this.con = con;
    }
   

    public ArrayList<Evento> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Evento> datos) {
        this.datos = datos;
        
    }

 


 
     @Override    
     public String execute() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Evento();
         this.datos=con.getData("select * from evento");
         
          return SUCCESS;
      }
  
         
 public String execute1() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Evento();
         this.datos=con.getData("select * from EVENTO where id=" +id);
          
          return SUCCESS;
      }
     public EventoController getEvento()
{
    return Evento;
}

}
