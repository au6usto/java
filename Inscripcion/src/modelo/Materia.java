/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Gustavo
 */
public class Materia {
    private int codigo;
    private String nombre;
    private String profesor;
    private Carrera carerra;
    
    public Materia(int codigo, String nombre, String profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Carrera getCarerra() {
        return carerra;
    }

    public void setCarerra(Carrera carerra) {
        this.carerra = carerra;
    }

    public Materia() {
    }

    @Override
    public String toString() {
        return "Materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + ", carerra=" + carerra + '}';
    }
    
}
