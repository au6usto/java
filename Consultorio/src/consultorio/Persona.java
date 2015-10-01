/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio;

/**
 *
 * @author au6usto
 */
public class Persona {
    
    private int dni;
    private String nombre;
    private String domicilio;
    private Fecha fechaNacimiento;

    public Persona(int dni, String nombre, String domicilio, Fecha fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + "\t Nombre: "+ nombre + "\n Fecha de Nacimiento: " + fechaNacimiento + "\t Domicilio: "+ domicilio;
    }
    
}
