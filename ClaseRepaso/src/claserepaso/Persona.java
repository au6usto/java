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
public class Persona {
    private String apellido;
    private String nombre;
    private int documento;

    public Persona(String apellido, String nombre, int documento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    
    
}
