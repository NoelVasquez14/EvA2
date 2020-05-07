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
    private String txtnombrecompleto;
   private String txtcurp;
   private String txtintitucion;
    private String txtcuenta; 
    private String txtpassword;
  private Participante objPar;

    public void setParticipante(ParticipanteController Participante) {
        this.Participante = Participante;
    }

   public String ingresar(){
    objPar = new Participante(txtnombrecompleto , txtcurp, txtintitucion, txtcuenta , txtpassword);
    try {
        GestionParticipante ac = new GestionParticipante();
        ac.RegistrarEntradas(objPar);
        return "exito";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
   }
    

    public Participante getObjPar() {
        return objPar;
    }

    public void setObjPar(Participante objPar) {
        this.objPar = objPar;
    }
 

 private Participante con;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTxtnombrecompleto() {
        return txtnombrecompleto;
    }

    public void setTxtnombrecompleto(String txtnombrecompleto) {
        this.txtnombrecompleto = txtnombrecompleto;
    }

    public String getTxtcurp() {
        return txtcurp;
    }

    public void setTxtcurp(String txtcurp) {
        this.txtcurp = txtcurp;
    }

    public String getTxtisntitucion() {
        return txtintitucion;
    }

    public void setTxtintitucion(String txtintitucion) {
        this.txtintitucion = txtintitucion;
    }

    public String getTxtcuenta() {
        return txtcuenta;
    }

    public void setTxtcuenta(String txtcuenta) {
        this.txtcuenta = txtcuenta;
    }

    public String getTxtcontrase–a() {
        return txtpassword;
    }

    public void setTxtcontrase–a(String txtpassword) {
        this.txtpassword= txtpassword;
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
 

    public String getTxtpassword() {
        return txtpassword;
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
