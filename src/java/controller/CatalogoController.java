package controller;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.ArrayList;
import mantenimientos.GestionCatalogo;
import modelos.Catalogo;



public class CatalogoController extends ActionSupport {
    private int id;
    private String titulo;
    private int actividad_id;
    private int evento_id;
    private double costo;
    private int totalhoras;
    private int cupolimite;
    private Catalogo objCat;
    private ArrayList<Catalogo> datos;
     private Catalogo con;
     private CatalogoController Catalogo;
    
     public String ingresar(){
    objCat = new Catalogo( titulo , actividad_id , evento_id , costo, totalhoras , cupolimite );
    try {
        GestionCatalogo ac = new GestionCatalogo();
        ac.RegistrarEntradas(objCat);
        return "exito";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    
}
    
    
    public String  Actualizar(){
    objCat = new Catalogo(titulo , actividad_id , evento_id , costo, totalhoras , cupolimite);
    
    try {
        GestionCatalogo ac = new GestionCatalogo();
        ac.Actualizar(objCat, id);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
    
    }
    
//metodo que permite eliminar la actividad a traves de la id
public String eliminar(){
    objCat = new Catalogo (id);
    
    try {
        GestionCatalogo ac = new GestionCatalogo();
        ac.Eliminar(objCat);
        return "SUCCESS";
    } catch (Exception e){
        e.printStackTrace();
        return "error";
    }
}
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getActividad_id() {
        return actividad_id;
    }

    public void setActividad_id(int actividad_id) {
        this.actividad_id = actividad_id;
    }

    public int getEvento_id() {
        return evento_id;
    }

    public void setEvento_id(int evento_id) {
        this.evento_id = evento_id;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getTotalhoras() {
        return totalhoras;
    }

    public void setTotalhoras(int totalhoras) {
        this.totalhoras = totalhoras;
    }

    public int getCupolimite() {
        return cupolimite;
    }

    public void setCupolimite(int cupolimite) {
        this.cupolimite = cupolimite;
    }

    public Catalogo getObjCat() {
        return objCat;
    }

    public void setObjCat(Catalogo objCat) {
        this.objCat = objCat;
    }

     public Catalogo getCon() {
        return con;
    }
   

    public void setCon(Catalogo con) {
        this.con = con;
    }
     @Override    
     public String execute() throws SQLException, Exception {
      
         this.datos=new ArrayList<>();
         this.con=new Catalogo();
         this.datos=con.getData("select * from catalogo");
         
          return "SUCCESS";
      }
  
         
 public String execute1() throws SQLException, Exception {
         this.datos=new ArrayList<>();
         this.con=new Catalogo();
         this.datos=con.getData("select * from CATALOGO where id=" +id);
          
          return "SUCCESS";
      }
     public CatalogoController getOrganizador()
{
    return Catalogo;
}

    public ArrayList<Catalogo> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Catalogo> datos) {
        this.datos = datos;
    }

    public CatalogoController getCatalogo() {
        return Catalogo;
    }

    public void setCatalogo(CatalogoController Catalogo) {
        this.Catalogo = Catalogo;
    }
    
    
    
}
