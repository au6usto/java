/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasep1;

/**
 *
 * @author au6usto
 */
public class Persona {

    private int edad;
    private String nombre;
    
    public Persona() {
        this.edad = 21;
    }

    public Persona(int edad) {
        this.edad = edad;
        this.nombre = "NN";
    }

    public Persona(String nombre) {
        this.edad = 21;
        this.nombre = "";
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

