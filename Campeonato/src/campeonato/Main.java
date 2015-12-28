/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author au6usto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Tevez", 10);
        Jugador j2 = new Jugador("Riquelme", 5);
        Jugador j3 = new Jugador("Palermo", 8);
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        
        Collections.sort(jugadores);
        
        System.out.println(jugadores);
        
    }
    
}
