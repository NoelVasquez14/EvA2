/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.ArrayList;

import mantenimientos.GestionActividad;
import modelos.Actividad;





public class ActividadController extends ActionSupport{
    
  
  private int id;
  private ActividadController actividad;
  private ArrayList<Actividad> datos;

private Actividad objAct;
private String descripcion;



    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  

   

    

private Actividad con;

private int largo;

    public Actividad getCon() {
        return con;
    }

    public void setCon(Actividad con) {
        this.con = con;
    }

    public ArrayList<Actividad> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Actividad> datos) {
        this.datos = datos;
        
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


  
 
     @Override    
     public String execute() throws SQLException, Exception {
       
         this.datos=new ArrayList<>();
         this.con=new Actividad();
         this.datos=con.getData("select * from Actividad");
          return "SUCCESS";
      }
     public ActividadController getUsuario()
{
    return actividad;
}

  
public String ingresar(){
    objAct = new Actividad (descripcion);
    try {
        GestionActividad ac = new GestionActividad();
        ac.RegistrarEntradas(objAct);
        return "exito";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
}

public String execute1() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Actividad();
         this.datos=con.getData("select * from ACTIVIDAD where id=" +id);
          
          return "SUCCESS";
      }

public String  Actualizar(){
    objAct = new Actividad (descripcion);
    
    try {
        GestionActividad ac = new GestionActividad();
        ac.Actualizar(objAct , id);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
    }
public String eliminar(){
    objAct = new Actividad(id);
    
    try {
        GestionActividad ac = new GestionActividad();
        ac.Eliminar(objAct);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
}
    public Actividad getObjCat() {
        return objAct;
    }

    public void setObjCat(Actividad objAct) {
        this.objAct = objAct;
    }

    public Actividad getObjAct() {
        return objAct;
    }

    public void setObjAct(Actividad objAct) {
        this.objAct = objAct;
    }

}
    

