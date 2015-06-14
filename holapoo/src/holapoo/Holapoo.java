/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holapoo;

/**
 *
 * @author au6usto
 */

class Cuenta{
    double saldo;
    String dueño = "";
    
    void depositar (double m) {
        saldo+=m;
    }
    void extraer(double m){
        saldo -=m;
    }
    void mostrar(){
        System.out.println(dueño + ": " + saldo);
    }
    
}
public class Holapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.dueño = "jose";
        c2.dueño = "Bart";
        c1.depositar(100);
        c1.extraer(50);
        c1.mostrar();
        c2.mostrar();
    }
    
}
