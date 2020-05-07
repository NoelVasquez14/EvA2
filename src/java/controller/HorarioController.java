/*
 * Bienvenido 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelos.Horario;

/**
 *
 * @author nvasq_
 */
public class HorarioController {
    private Horario objHor;
    private int id;
    private int catalogo_id;
    private int ponente_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatalogo_id() {
        return catalogo_id;
    }

    public void setCatalogo_id(int catalogo_id) {
        this.catalogo_id = catalogo_id;
    }

    public int getPonente_id() {
        return ponente_id;
    }

    public void setPonente_id(int ponente_id) {
        this.ponente_id = ponente_id;
    }
    
    
    
}
