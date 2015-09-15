/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author au6usto
 */
public class Empresa {
    private String nombre;
    ArrayList<Cliente> clientes;
    public Empresa(String nombre) {
        this.nombre= nombre;
        clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void mostrarClientes(){
        
        for (Cliente cliente : clientes) {
            System.out.println();
            cliente.mostrar();
        }
    }
    
}
