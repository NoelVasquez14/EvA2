/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.restfb.json.ParseException;



import java.sql.SQLException;
import java.util.ArrayList;

import java.util.Date;
import java.text.SimpleDateFormat;
import mantenimientos.GestionPago;

import modelos.Pago;


/**
 *
 * @author nvasq_
 */
public class PagoController extends  ActionSupport{
     private  String nombre; 
private int id;
 private PagoController Pago;
    private Date fechapago;
    private int participante_id;
    
   

 private Pago con;

    public Date  getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) throws java.text.ParseException {
         try {
        this.fechapago=new SimpleDateFormat("yyyy-MM-dd").parse(fechapago);
    } catch (ParseException e) {
        e.printStackTrace();
    }
       
    }

    public int getparticipante_id() {
        return participante_id;
    }

    public void setparticipante_id(int participante_id) {
        this.participante_id = participante_id;
    }
 
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

private ArrayList<Pago> datos;

private int largo;

    public Pago getCon() {
        return con;
    }
   

    public void setCon(Pago con) {
        this.con = con;
    }

  

    public void setDatos(ArrayList<Pago> datos) {
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
         this.con=new Pago();
         this.datos=con.getData("SELECT pago.id, pago.fechapago  , pago.participante_id  FROM pago INNER JOIN participante ON pago.participante_id = participante.id;");
         
          return SUCCESS;
      }
  
      private Pago objPag;

    public String ingresar(){
    objPag = new Pago((java.sql.Date) fechapago, participante_id );
    try {
        GestionPago ac = new GestionPago();
        ac.RegistrarEntradas(objPag);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "ERROR";
    }
    
    
}
    
    
    public String  Actualizar(){
    objPag = new Pago ( (java.sql.Date) fechapago, participante_id);
    
    try {
        GestionPago ac = new GestionPago();
        ac.Actualizar(objPag, id);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    }
    
//metodo que permite eliminar la actividad a traves de la id
public String eliminar(){
    objPag = new Pago (id);
    
    try {
        GestionPago ac = new GestionPago();
        ac.Eliminar(objPag);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
}


    public Pago getObjPag() {
        return objPag;
    }

    public void setObjOrg(Pago objPag) {
        this.objPag = objPag;
    }
    
 
    
   






    public ArrayList<Pago> getDatos() {
        return datos;
    }

 
  
         
 public String execute1() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Pago();
         this.datos=con.getData("select * from PAGO where id=" +id);
          
          return SUCCESS;
      }
     public PagoController getOrganizador()
{
    return Pago;
}

     public PagoController getPago()
{
    return Pago;
}

    public int getParticipante_id() {
        return participante_id;
    }

    public void setParticipante_id(int participante_id) {
        this.participante_id = participante_id;
    }

}
