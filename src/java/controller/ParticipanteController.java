/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import mantenimientos.GestionParticipante;
import modelos.Participante;


/**
 *
 * @author nvasq_
 */
public class ParticipanteController extends  ActionSupport{
     private  String nombre; 
private int id;
 private ParticipanteController Participante;
    private String txtnombre;
   private String txtcurp;
   private String txtinstitucion;
    private String txtcuenta; 
    private String txtpassword;
  private Participante objPar;
  
  
    
     public String ingresar(){
    objPar = new Participante(txtnombre , txtcurp, txtinstitucion, txtcuenta , txtpassword);
    try {
        GestionParticipante ac = new GestionParticipante();
        ac.RegistrarParticipante(objPar);
        return "exito";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
   }
    
   
//metodo para editar datos de la tabla actividad
    public String  Actualizar(){
    objPar = new Participante(txtnombre,txtcurp,txtinstitucion,txtcuenta,txtpassword);
    
    try {
        GestionParticipante ac= new GestionParticipante();
        ac.Actualizar(objPar , id);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
    }
    
//metodo que permite eliminar la actividad a traves de la id
public String eliminar(){
    objPar = new Participante(id);
    
    try {
        GestionParticipante ac = new GestionParticipante();
        ac.Eliminar(objPar);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
}
public String execute1() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Participante();
         this.datos=con.getData("select * from PARTICIPANTE where id=" +id);
          
          return "SUCCESS";
      }


    public void setParticipante(ParticipanteController Participante) {
        this.Participante = Participante;
    }

  

  

 private Participante con;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(String txtnombre) {
        this.txtnombre = txtnombre;
    }

    public String getTxtcurp() {
        return txtcurp;
    }

    public void setTxtcurp(String txtcurp) {
        this.txtcurp = txtcurp;
    }

    public String getTxtinstitucion() {
        return txtinstitucion;
    }

    public void setTxtinstitucion(String txtinstitucion) {
        this.txtinstitucion = txtinstitucion;
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
 

 
 
     @Override    
     public String execute() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Participante();
         this.datos=con.getData("select * from participante");
         
          return SUCCESS;
      }
  
     


  public Participante getObjPar() {
        return objPar;
    }

    public void setObjPar(Participante objPar) {
        this.objPar = objPar;
    }
 
}
