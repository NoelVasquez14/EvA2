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
//insertar datos

    public void setTxtdescripcion(String txtdescripcion) {
        this.txtdescripcion = txtdescripcion;
    }

public String ingresar(){
    objAct = new Actividad (txtdescripcion);
    try {
        GestionActividad ac = new GestionActividad();
        ac.RegistrarEntradas(objAct);
        return "exito";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
}

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

 

}
    

