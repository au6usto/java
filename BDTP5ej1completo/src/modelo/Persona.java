/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author usuario
 */
public abstract class Persona extends Entidad {
    private int dni;
    private String nombre;
    private String domicilio;
    private String telefono;
    private Fecha fechanacimiento;

    public Persona() {
    }

    public Persona(String nombre, Conexion conexion) {
        super(nombre, conexion);
    }

    public Persona(int dni, String nombre, String domicilio, String telefono, Fecha fechanacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Fecha getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Fecha fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
