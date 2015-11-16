/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import modelo.GestorEmpleados;
import vista.VGestorEmpleado;

/**
 *
 * @author Tere
 */
public class EjemploMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         GestorEmpleados modelo = new GestorEmpleados();
        VGestorEmpleado vista = new VGestorEmpleado();
        Controlador control = new Controlador(vista,modelo);
        control.mostrar();
        vista.setControlador(control);
        vista.ejecutar();
     
    }
    
}
