/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;

import modelos.Categoria;
import modelos.Evento;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;


public class CategoriaController_1 extends ActionSupport{
    
   
  private  String nombre; 
  private String txtDescuento;
  
  private String Descripcion;

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcio) {
        this.Descripcion = Descripcio;
    }
  

    public String getTxtDesc() {
        return txtDescuento;
    }

    public void setTxtDesc(String txtDesc) {
        this.txtDescuento = txtDesc;
    }

    public String getTxtDescuento() {
        return txtDescuento;
    }

    public void setTxtDescuento(String txtDescuento) {
        this.txtDescuento = txtDescuento;
    }

   

    public String getNombre() {
        return nombre;
    }

private Categoria con;
private ArrayList<Categoria> datos;
private int largo;

    public Categoria getCon() {
        return con;
    }

    public void setCon(Categoria con) {
        this.con = con;
    }

    public ArrayList<Categoria> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Categoria> datos) {
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
         this.con=new Categoria();
         this.datos=con.getData("select * from Categoria");
          return SUCCESS;
      }
      
      
     
    
     } 
