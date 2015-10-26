/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defensatp2015;

import java.util.ArrayList;

/**
 *
 * @author au6usto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Agente> listaAgentes = new ArrayList<>();
        //1
        AgenteIntervencion ai1 = new AgenteIntervencion(7, 3232344, "Perez", "Juan", 5000.00);
        AgenteIntervencion ai2 = new AgenteIntervencion(5, 3232345, "Jose", "Gonzalez", 5000.00);
        //2
        listaAgentes.add(ai1);
        listaAgentes.add(ai2);
        //3
        ArrayList<Multa> multas1 = new ArrayList<>();
        Multa m1 = new Multa(100,"Velocidad", "10/10/15");
        Multa m2 = new Multa(101,"Giro en U", "10/10/15");
        Multa m3 = new Multa(100,"Velocidad", "10/10/15");
        Multa m4 = new Multa(101,"Giro en U", "10/10/15");
        
        Main.agregarMulta(m1, multas1);
        Main.agregarMulta(m2, multas1);
        Main.agregarMulta(m3, multas1);
        Main.agregarMulta(m4, multas1);
             
        AgenteTransito at1 = new AgenteTransito(multas1, 3232346, "Gerardo", "Ramirez", 4500.00);
        
        ArrayList<Multa> multas2 = new ArrayList<>();
        Multa m5 = new Multa(102,"Velocidad", "10/10/15");
        
        Main.agregarMulta(m5, multas2);
        
        AgenteTransito at2 = new AgenteTransito(multas2, 3232347, "Dario", "Mansilla", 4500.00);
        
        listaAgentes.add(at1);
        listaAgentes.add(at2);
        //4
        for (Agente agente : listaAgentes) {
            System.out.println(agente.toString());
        }
        
    }
    //5
    public static void agregarMulta(Multa m, ArrayList<Multa> multas){
        if(!multas.contains(m)){
            multas.add(m);
        }
    }
    
}
