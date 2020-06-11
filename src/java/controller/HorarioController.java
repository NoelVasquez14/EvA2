/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import mantenimientos.GestionHorario;
import modelos.Horario;

/**
 *
 * @author nvasq_
 */
public class HorarioController   extends ActionSupport{
    private Horario objHor;
    private int id;
    private int catalogo_id;
    private int ponente_id;
    private Horario  con;
private ArrayList<Horario> datos;



public String ingresar(){
    objHor = new Horario( catalogo_id ,ponente_id);
    try {
        GestionHorario ac = new GestionHorario();
        ac.RegistrarEntradas(objHor);
        return "exito";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
}

//metodo para editar datos de la tabla actividad
    public String  Actualizar(){
    objHor = new  Horario (catalogo_id , ponente_id);
    
    try {
        GestionHorario ac = new GestionHorario();
        ac.Actualizar(objHor , id);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
    }
    
//metodo que permite eliminar la actividad a traves de la id
public String eliminar(){
    objHor = new Horario (id);
    
    try {
        GestionHorario ac = new GestionHorario();
        ac.Eliminar(objHor);
        return "SUCCESS";
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

    public int getCatalogo_id() {
        return catalogo_id;
    }

    public void setCatalogo_id(int catalogo_id) {
        this.catalogo_id = catalogo_id;
    }

    public int getPonente_id() {
        return ponente_id;
    }

    public void setPonente_id(int ponente_id) {
        this.ponente_id = ponente_id;
    }

    public Horario getObjHor() {
        return objHor;
    }

    public void setObjHor(Horario objHor) {
        this.objHor = objHor;
    }
    
     @Override    
     public String execute() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Horario();
         this.datos=con.getData("select * from horario");
         
          return "SUCCESS";
      }
     //buscar la actividad por su id
     
 public String execute1() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Horario();
         this.datos=con.getDatos("select * from horario where id=" +id);
          
          return "SUCCESS";
      }

    public ArrayList<Horario> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Horario> datos) {
        this.datos = datos;
    }
    
    
}
