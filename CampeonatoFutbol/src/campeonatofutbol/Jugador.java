/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonatofutbol;

/**
 *
 * @author au6usto
 */
public class Jugador {
    private String nombre;
    private int posicion;
    
    public int getPosicion(){
        return posicion;
    }
    
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Jugador(String nombre, int posicion){
        setNombre(nombre);
        setPosicion(posicion);
    }
    
    public void mostrar() {
        System.out.println(
        "\tJugador " + nombre + ": " + posicion
        );
    }
}
