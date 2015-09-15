/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author au6usto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Coca Cola");
        empresa.getClientes().add(new Cliente("Juan",18,"Empresa1",321312));
        empresa.getClientes().add(new Cliente("Jebus",32,"Empresa2",32132312));
        empresa.getClientes().add(new Cliente("Elisabet",42,"Empresa2",66132312));
        empresa.mostrarClientes();
        
    }
    
}
