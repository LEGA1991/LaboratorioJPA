/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriojpa;

/**
 *
 * @author est1534809
 */
public class Persona {
    private String nombre;
    private String apellido;
    private boolean conectado;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean getConectado(){
        return conectado;
    }
    
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    
    
    
}
