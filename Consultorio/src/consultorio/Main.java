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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per = new Persona(34202638, "Amaya, Agustin","Las Piedras 234", new Fecha(23,04,93));
        System.out.println(per);
    }
    
}
