/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author gustavo
 */
public class Producto {
    private double monto;
    private String descripcion;

    
    public Producto(){
    
    }
    
    public Producto(double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
    }
    
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "monto=" + monto + ", descripcion=" + descripcion + '}';
    }
    
}
