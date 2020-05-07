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

import modelos.Pago;


/**
 *
 * @author nvasq_
 */
public class PagoController extends  ActionSupport{
     private  String nombre; 
private int id;
 private PagoController Pago;
    private String fechapago;
    private int participante_id;
   

 private Pago con;

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
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

    public ArrayList<Pago> getDatos() {
        return datos;
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
  
     
     public PagoController getPago()
{
    return Pago;
}

}
