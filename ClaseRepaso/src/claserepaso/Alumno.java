/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claserepaso;

/**
 *
 * @author au6usto
 */
public class Alumno extends Persona{
    private int legajo;
     public Alumno(String apellido, String nombre,int documento, int legajo ){
     super(apellido, nombre, documento);
     this.legajo=legajo;
     }

    public int getLegajo() {
        return legajo;
    }
    
}
