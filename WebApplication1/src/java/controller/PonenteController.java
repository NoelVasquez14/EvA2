/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import com.opensymphony.xwork2.ActionSupport;

import java.io.File;

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
    private String txtnombrecompleto;
    private String txtsexo;
    private String txtcv;
    private String txtfoto;
    private String txtcuenta; 
    private String txtpassword;
    private String txtcorreo;
    private String txtnivelacademico;
    private Ponente objPon;
 private Ponente con;
 
  private File archivo;

    public String getTxtnombrecompleto() {
        return txtnombrecompleto;
    }

    public void setTxtnombrecompleto(String txtnombrecompleto) {
        this.txtnombrecompleto = txtnombrecompleto;
    }

    public String getTxtsexo() {
        return txtsexo;
    }

    public void setTxtsexo(String txtsexo) {
        this.txtsexo = txtsexo;
    }

    public String getTxtcv() {
        return txtcv;
    }

    public void setTxtcv(String txtcv) {
        this.txtcv = txtcv;
    }

    public String getTxtfoto() {
        return txtfoto;
    }

    public void setTxtfoto(String txtfoto) {
        this.txtfoto = txtfoto;
    }

    public String getTxtcuenta() {
        return txtcuenta;
    }

    public void setTxtcuenta(String txtcuenta) {
        this.txtcuenta = txtcuenta;
    }

    public String getTxtpassword() {
        return txtpassword;
    }

    public void setTxtpassword(String txtpassword) {
        this.txtpassword = txtpassword;
    }

    public String getTxtcorreo() {
        return txtcorreo;
    }

    public void setTxtcorreo(String txtcorreo) {
        this.txtcorreo = txtcorreo;
    }

    public String getTxtnivelacademico() {
        return txtnivelacademico;
    }

    public void setTxtnivelacademico(String txtnivelacademico) {
        this.txtnivelacademico = txtnivelacademico;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
 
 /*
 public String Registrar(){
    File nuevoArchivo = new File("/", archivo.getName());
    archivo.renameTo(nuevoArchivo);
        
    return SUCCESS;
     }
    public String getNombre()
{
    return archivo.getName();
}
    
public String getRuta()
{
    return archivo.getAbsolutePath();
}
  */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrecompleto() {
        return txtnombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.txtnombrecompleto = nombrecompleto;
    }

    public String getSexo() {
        
        return txtsexo;
    }

    public void setSexo(String sexo) {
        this.txtsexo = sexo;
    }

    public String getCv() {
        return txtcv;
    }

    public void setCv(String cv) {
        this.txtcv = cv;
    }

    public String getFoto() {
        return txtfoto;
    }

    public void setFoto(String foto) {
        this.txtfoto = foto;
    }

    public String getCuenta() {
        return txtcuenta;
    }

    public void setCuenta(String cuenta) {
        this.txtcuenta = cuenta;
    }

    public String getPassword() {
        return txtpassword;
    }

    public void setPassword(String password) {
        this.txtpassword = password;
    }

    public String getCorreo() {
        return txtcorreo;
    }

    public void setCorreo(String correo) {
        this.txtcorreo = correo;
    }

    public String getNivelacademico() {
        return txtnivelacademico;
    }

    public void setNivelacademico(String nivelacademico) {
        this.txtnivelacademico = nivelacademico;
    }
    
    
    //public String getNombre() {
      //  return nombre;
    //}


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
