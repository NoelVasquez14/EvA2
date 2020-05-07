/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author nvasq_
 */
public class Login {
    private String usuario;
    private String password;
    private ArrayList<Login> arreglo;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
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
