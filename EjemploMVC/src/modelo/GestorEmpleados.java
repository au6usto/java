/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Tere
 */
public class GestorEmpleados {
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public GestorEmpleados() {
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    
    public void agregarEmpleados(Empleado empleado){
        if(!listaEmpleados.contains(empleado))
            listaEmpleados.add(empleado);        
    }
    
    public void borrarEmpleado(int i){
        
            listaEmpleados.remove(i);
    }
    
}
