/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
;
import modelos.Categoria;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;


import mantenimientos.GestionCategoria;



public class CategoriaController_1 extends ActionSupport {

   
  
  private int id;
  private CategoriaController_1 categoria;
  private ArrayList<Categoria> datos;
 
private Categoria objCat;
private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




   

   

    

private Categoria con;

private int largo;

    public Categoria getCon() {
        return con;
    }

    public void setCon(Categoria con) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


  
 
     @Override    
     public String execute() throws SQLException, Exception {
       
         this.datos=new ArrayList<>();
         this.con=new Categoria();
         this.datos=con.getData("select * from Categoria");
          return "SUCCESS";
      }
     public CategoriaController_1 getUsuario()
{
    return categoria;
}

  
public String ingresar(){
    objCat = new Categoria (descripcion);
    try {
        GestionCategoria ac = new GestionCategoria();
        ac.RegistrarCategoria(objCat);
        return "exito";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
}

public String execute1() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Categoria();
         this.datos=con.getData("select * from CATEGORIA where id=" +id);
          
          return SUCCESS;
      }

public String  Actualizar(){
    objCat = new Categoria (descripcion);
    
    try {
        GestionCategoria ac = new GestionCategoria();
        ac.Actualizar(objCat , id);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
    }
public String eliminar(){
    objCat = new Categoria (id);
    
    try {
        GestionCategoria ac = new GestionCategoria();
        ac.Eliminar(objCat);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
}
    public Categoria getObjCat() {
        return objCat;
    }

    public void setObjCat(Categoria objCat) {
        this.objCat = objCat;
    }

}

    


