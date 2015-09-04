/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasep1;

/**
 *
 * @author au6usto
 */
public class EjemploClaseP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        
        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
        
        p.setNombre("Pablo");
        p.setEdad(20);
        
        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
        
        Persona per1 = new Persona(33);
        System.out.println(per1.getNombre());
        System.out.println(per1.getEdad());
        
        Persona per2 = new Persona("Juan");
        System.out.println(per2.getNombre());
        System.out.println(per2.getEdad());
        
        Persona per3 = new Persona(44,"José");
        System.out.println(per3.getNombre());
        System.out.println(per3.getEdad());
    }
    
}
