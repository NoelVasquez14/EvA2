/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.ConversionErrorFieldValidator;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.UrlValidator;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import mantenimientos.GestionOrganizador;


import modelos.Organizador;


/**
 *
 * @author nvasq_
 */
public class OrganizadorController extends  ActionSupport{
     private  String nombre; 
private int id;
 private OrganizadorController Organizador;
    private String txtnombreorazonsocial;
    private String txtrfc;
    private String txtcontacto;
    private String txturl;
    private String txtcorreo; 
    private String txttelefono;
    private String txtdireccion;
   
 
    private Organizador objOrg;

    public String ingresar(){
    objOrg = new Organizador(txtnombreorazonsocial , txtrfc, txtcontacto, txturl , txtcorreo, txttelefono, txtdireccion );
    try {
        GestionOrganizador ac = new GestionOrganizador();
        ac.RegistrarEntradas(objOrg);
        return "exito";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
}
    
    //metodo que manda un objeto de tipo organizador a la clase GestionOrganizador 
    public String  Actualizar(){
    objOrg = new Organizador (txtnombreorazonsocial , txtrfc, txtcontacto, txturl , txtcorreo, txttelefono, txtdireccion);
    
    try {
        GestionOrganizador ac = new GestionOrganizador();
        ac.Actualizar(objOrg, id);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    }
    
//metodo que permite eliminar al organizador a traves de la id
public String eliminar(){
    objOrg = new Organizador (id);
    
    try {
        GestionOrganizador ac = new GestionOrganizador();
        ac.Eliminar(objOrg);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreorazonsocial() {
        return txtnombreorazonsocial;
    }

    public void setNombreorazonsocial(String nombreorazonsocial) {
        this.txtnombreorazonsocial = nombreorazonsocial;
    }

    public String getRfc() {
        return txtrfc;
    }

    public void setRfc(String rfc) {
        this.txtrfc = rfc;
    }

    public String getContacto() {
        return txtcontacto;
    }

    public void setContacto(String contacto) {
        this.txtcontacto = contacto;
    }

    public String getUrl() {
        return txturl;
    }

    public void setUrl(String url) {
        this.txturl = url;
    }

    public String getCorreo() {
        return txtcorreo;
    }

    public void setCorreo(String correo) {
        this.txtcorreo = correo;
    }

    public String getTelefono() {
        return txttelefono;
    }

    public void setTelefono(String telefono) {
        this.txttelefono = telefono;
    }

    public String getDireccion() {
        return txtdireccion;
    }

    public void setDireccion(String direccion) {
        this.txtdireccion = direccion;
    }
    
    

    public Organizador getObjOrg() {
        return objOrg;
    }

    public void setObjOrg(Organizador objOrg) {
        this.objOrg = objOrg;
    }
    
 private Organizador con;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

private ArrayList<Organizador> datos;

private int largo;

    public Organizador getCon() {
        return con;
    }
   

    public void setCon(Organizador con) {
        this.con = con;
    }

    public ArrayList<Organizador> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Organizador> datos) {
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
         this.con=new Organizador();
         this.datos=con.getData("select * from organizador");
         
          return "SUCCESS";
      }
  
         //este codigo realiza la consulta de el rganizador con el id seleccionado
 public String execute1() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Organizador();
         this.datos=con.getData("select * from ORGANIZADOR where id=" +id);
          
          return "SUCCESS";
      }
     public OrganizadorController getOrganizador()
{
    return Organizador;
}

}
