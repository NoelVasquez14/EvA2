/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import modelos.Login;


public class LoginController extends ActionSupport {
 private String usuario;
 private String password;
private ArrayList<Login> objLog;
 
public String login(){
if(getUsuario().equals("admin") && getPassword().equals("password")){
    return "succes";
} 
return "error";

}
 

 
 
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
}
