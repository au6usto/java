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
public class Empleado extends Persona{
    private double sueldo;

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(double sueldo, String nombre, int edad) {
        super(nombre,edad);
        this.sueldo = sueldo;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Sueldo Bruto: $"+sueldo);
        System.out.println("Sueldo Neto: $"+calcularSalario());
    }
    
    public void calcularSalario(){
        
    }
    
}
