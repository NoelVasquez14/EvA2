/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import modelos.Participante;


/**
 *
 * @author nvasq_
 */
public class ParticipanteController extends  ActionSupport{
     private  String nombre; 
private int id;
 private ParticipanteController Participante;
    private String nombrecompleto;
   private String curp;
   private String intitucionprocedencia;
    private String cuenta; 
    private String password;
  

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getIntitucionprocedencia() {
        return intitucionprocedencia;
    }

    public void setIntitucionprocedencia(String intitucionprocedencia) {
        this.intitucionprocedencia = intitucionprocedencia;
    }
 

 private Participante con;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

 


    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

 
    public String getNombre() {
        return nombre;
    }


private ArrayList<Participante> datos;

private int largo;

    public Participante getCon() {
        return con;
    }
   

    public void setCon(Participante con) {
        this.con = con;
    }

    public ArrayList<Participante> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Participante> datos) {
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
         this.con=new Participante();
         this.datos=con.getData("select * from participante");
         
          return SUCCESS;
      }
  
     
     public ParticipanteController getParticipante()
{
    return Participante;
}

}
