/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionpolicial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author au6usto
 */
public class DivisionPolicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DeTransito t1 = new DeTransito("Tony", 23, new ArrayList<Multa>());
       DeTransito t2 = new DeTransito("Matias", 31, new ArrayList<Multa>());
       DeIntervencion t3 = new DeIntervencion("Augusto", 33, "asd", "qwe", 5);
       DeIntervencion t4 = new DeIntervencion("Pequeño", 23, "qwe", "asd", 10);
       
       ArrayList<Agente> agentes = new ArrayList();
       
       agentes.add(t4);
       agentes.add(t3);
       agentes.add(t2);
       agentes.add(t1);
       
       ArrayList<Multa> multas1 = new ArrayList<>();
       multas1.add(new Multa(500,"Giro en U"));
       multas1.add(new Multa(200.3,"Velocidad"));
       multas1.add(new Multa(400.3,"Pasar en Rojo"));
       t1.setMultas(multas1);
       
       ArrayList<Multa> multas2 = new ArrayList<>();
       multas2.add(new Multa(200.3,"Velocidad"));
       t2.setMultas(multas2);
       
       calcularSueldo(t1);
       calcularSueldo(t2);
       calcularSueldo(t3);
       calcularSueldo(t4);
       System.out.println("------------------------");
       sueldoTotal(agentes);
       System.out.println("------------------------");
       ranking(agentes);
       System.out.println("------------------------");
       calcularMultas(t1);
       System.out.println("");
       calcularMultas(t2);
    }
    
    public static void calcularMultas(DeTransito agente) { 
        System.out.print("Las multas de " + agente.getNombre() + "("+ agente.getNumero() +")");
        System.out.println(" son: "+ agente.calcularIntMultas());
        System.out.println("");
        agente.mostrarMultas();
    }
    
    public static void calcularSueldo(Agente agente) { 
        System.out.print("El Sueldo de " + agente.getNombre() + "("+ agente.getNumero() +")");
        System.out.println(" es: $"+ agente.calcularSueldo());
    }
    
    public static void sueldoTotal(ArrayList<Agente> agentes) {  
        double totalSueldos = 0;
        for (Agente agente : agentes) {
            totalSueldos += agente.calcularSueldo();
        }
        System.out.println("Sueldo total de la division: $" + totalSueldos);
    }
       
    public static void ranking(ArrayList<Agente> agentes) {
        System.out.println("------------------------");
        System.out.println("Ranking de Multas/Intervenciones");
        System.out.println("------------------------");
        Integer[] interOrMultas = new Integer[agentes.size()];
        for (int i = 0; i<agentes.size(); i++) {
            interOrMultas[i] = agentes.get(i).calcularIntMultas();
        }
        
        Arrays.sort(interOrMultas,Collections.reverseOrder());
        
        for (Integer im : interOrMultas) {
            for (Agente agente : agentes) {
                if (im == agente.calcularIntMultas()){
                    System.out.println(agente.toString());
                }
            }

        }

        System.out.println("------------------------");
    }
}
