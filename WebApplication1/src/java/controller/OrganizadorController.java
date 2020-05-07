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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTxtnombreorazonsocial() {
        return txtnombreorazonsocial;
    }

    public void setTxtnombreorazonsocial(String txtnombreorazonsocial) {
        this.txtnombreorazonsocial = txtnombreorazonsocial;
    }

    public String getTxtrfc() {
        return txtrfc;
    }

    public void setTxtrfc(String txtrfc) {
        this.txtrfc = txtrfc;
    }

    public String getTxtcontacto() {
        return txtcontacto;
    }

    public void setTxtcontacto(String txtcontacto) {
        this.txtcontacto = txtcontacto;
    }

    public String getTxturl() {
        return txturl;
    }

    public void setTxturl(String txturl) {
        this.txturl = txturl;
    }

    public String getTxtcorreo() {
        return txtcorreo;
    }

    public void setTxtcorreo(String txtcorreo) {
        this.txtcorreo = txtcorreo;
    }

    public String getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(String txttelefono) {
        this.txttelefono = txttelefono;
    }

    public String getTxtdireccion() {
        return txtdireccion;
    }

    public void setTxtdireccion(String txtdireccion) {
        this.txtdireccion = txtdireccion;
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
         
          return SUCCESS;
      }
  
     
     public OrganizadorController getOrganizador()
{
    return Organizador;
}

}
