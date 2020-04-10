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
import modelos.Actividad.Categoria;



public class ActividadController extends ActionSupport{
    
   
  private  String nombre; 

    public String getNombre() {
        return nombre;
    }

private Actividad con;
private ArrayList<Categoria> datos;
private int largo;

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
