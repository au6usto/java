/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonatofutbol;
import java.util.*;
/**
 *
 * @author au6usto
 */
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;
    
    public Equipo(String nombre){
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void add(Jugador j){
        jugadores.add(j);
    }
    
    public void mostrar(){
        System.out.println("Equipo: "+ nombre);
        for (int i = 0; i < jugadores.size(); i++) {
            if (i == 0) {
                System.out.print("(Capitan)");
            }
            Jugador j = jugadores.get(i);
            j.mostrar();
        }
    }
}
