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
public class Medico extends Persona{
    
    private int matricula;
    private String especialidad;

    public Medico(int dni, String nombre, String domicilio, Fecha fechaNacimiento) {
        super(dni, nombre, domicilio, fechaNacimiento);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }
    
}
