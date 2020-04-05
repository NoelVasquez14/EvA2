/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Conectar;
import modelos.Categoria;


public class CategoriaController_1 extends ActionSupport{
    
   
  private  String nombre; 

    public String getNombre() {
        return nombre;
    }

private Conectar con;
private ArrayList<Categoria> datos;
private int largo;

    public Conectar getCon() {
        return con;
    }

    public void setCon(Conectar con) {
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
         this.con=new Conectar();
         this.datos=con.getData("select id,descripcion from Categoria");
          return SUCCESS;
      }
  
    
    
}
