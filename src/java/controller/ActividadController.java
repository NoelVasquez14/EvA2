/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Actividad;
import mantenimientos.GestionActividad;
import modelos.Actividad.Categoria;





public class ActividadController extends ActionSupport{
    
   
  private  String txtdescripcion; 
 private  int id ;
 
 
    public String getDescripcion() {
        return txtdescripcion;
    }

private Actividad con;
private ArrayList<Categoria> datos;
private int largo;
private Actividad objAct;
private Actividad objAct1;
//insertar datos

    public void setTxtdescripcion(String txtdescripcion) {
        this.txtdescripcion = txtdescripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
public String ingresar(){
    objAct = new Actividad (txtdescripcion , id);
    try {
        GestionActividad ac = new GestionActividad();
        ac.RegistrarEntradas(objAct);
        return "exito";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
}

//metodo para editar datos de la tabla actividad
    public String  Actualizar(){
    objAct = new Actividad (txtdescripcion);
    
    try {
        GestionActividad ac = new GestionActividad();
        ac.Actualizar(objAct , id);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
    }
    
//metodo que permite eliminar la actividad a traves de la id
public String eliminar(){
    objAct1 = new Actividad (id);
    
    try {
        GestionActividad ac = new GestionActividad();
        ac.Eliminar(objAct1);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
}
 /*
public String buscar() throws Exception{
     
      this.datos=new ArrayList<>();
         GestionActividad ac = new GestionActividad();
         ac.getDatos("select * from Actividad where id= +id");
      
         
          return SUCCESS;
    

}
*/

    public Actividad getObjAct() {
        return objAct;
    }

    public void setObjAct(Actividad objAct) {
        this.objAct = objAct;
    }
        
        
    public Actividad getCon() {
        return con;
    }

    public void setCon(Actividad con) {
        this.con = con;
    }

    public ArrayList<Categoria> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Categoria> datos) {
        this.datos = datos;
        
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }


 
     @Override    
     public String execute() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Actividad();
         this.datos=con.getData("select * from Actividad");
         
          return SUCCESS;
      }
     //buscar la actividad por su id
     
 public String execute1() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Actividad();
         this.datos=con.getDatos("select * from Actividad where id=" +id);
          
          return SUCCESS;
      }
    public Actividad getObjAct1() {
        return objAct1;
    }

    public void setObjAct1(Actividad objAct1) {
        this.objAct1 = objAct1;
    }

 

}
    

