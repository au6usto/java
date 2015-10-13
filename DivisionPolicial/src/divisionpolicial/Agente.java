/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionpolicial;

/**
 *
 * @author au6usto
 */
public class Agente{
    private static int id = 1;

    private final int numero;
    private String nombre;
    private int antigüedad;    
    
    public Agente(String nombre, int antigüedad) {
        this.numero = Agente.id++;
        this.nombre = nombre;
        this.antigüedad = antigüedad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public int getNumero() {
        return numero;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }

    @Override
    public String toString() {
        return "Agente{" + "nombre=" + nombre + ", antig\u00fcedad=" + antigüedad + '}';
    }
    
    public double calcularSueldo(){
        return 100.00;
    }
    
    public int calcularIntMultas(){
        return 1;
    }
    
}



