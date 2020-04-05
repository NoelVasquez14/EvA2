/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Evento;
import modelos.Evento.Categoria;



public class EventoController extends ActionSupport{
    
   
  private  String nombre; 

    public String getNombre() {
        return nombre;
    }

private Evento con;
private ArrayList<Categoria> datos;
private int largo;

    public Evento getCon() {
        return con;
    }

    public void setCon(Evento con) {
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
         this.con=new Evento();
         this.datos=con.getData("select id,descripcion from Actividad");
         
          return SUCCESS;
      }
  
    
    
}
