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
public class CampeonatoFutbol {

    /**
     * @param args the command line arguments
     * Agregar una clase Torneo
     * nombre
     * año
     * 
     * Crear 
     */
    public static void main(String[] args) {
        
        Equipo e1 = new Equipo("Boca");
        e1.add(new Jugador("Tevez",1));
        e1.add(new Jugador("Orion",2));
        e1.add(new Jugador("Gago",3));
        
        e1.mostrar();
    }
    
}
