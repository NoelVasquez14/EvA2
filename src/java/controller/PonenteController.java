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

import modelos.Ponente;


/**
 *
 * @author nvasq_
 */
public class PonenteController extends  ActionSupport{
     private  String nombre; 
private int id;
 private PonenteController Ponente;
    private String nombrecompleto;
    private String sexo;
    private String cv;
    private String foto;
    private String cuenta; 
    private String password;
    private String correo;
    private String nivelacademico;

 private Ponente con;
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

    public String getSexo() {
        
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNivelacademico() {
        return nivelacademico;
    }

    public void setNivelacademico(String nivelacademico) {
        this.nivelacademico = nivelacademico;
    }
    public String getNombre() {
        return nombre;
    }


private ArrayList<Ponente> datos;

private int largo;

    public Ponente getCon() {
        return con;
    }
   

    public void setCon(Ponente con) {
        this.con = con;
    }

    public ArrayList<Ponente> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Ponente> datos) {
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
         this.con=new Ponente();
         this.datos=con.getData("select * from ponente");
         
          return SUCCESS;
      }
  
     
     public PonenteController getPonente()
{
    return Ponente;
}

}
