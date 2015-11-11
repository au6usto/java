
package controldelectura2015;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void agregarJugador(Jugador j){
        jugadores.add(j);
    }
    public void mostrar(){
        System.out.println("Equipo: " + getNombre());
        System.out.println("Jugadores: ");
        
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getNombre() + "\t" + jugador.getPosicion());
        }
    }
    
}
