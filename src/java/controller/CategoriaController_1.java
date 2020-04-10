/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Categoria;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;


import modelos.Actividad;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.xml.ws.Action;
import modelos.Conectar;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;


public class CategoriaController_1 extends ActionSupport {

   
  
   private static final long serialVersionUID = 1L;
  private  String nombre; 
  private String txtDescuento;
  private CategoriaController_1 categoria;
  private String descripcion;

 
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcio) {
        this.descripcion = Descripcio;
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
     public CategoriaController_1 getUsuario()
{
    return categoria;
}

  
}

    


