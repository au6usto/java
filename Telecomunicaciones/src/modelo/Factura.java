/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;

/**
 *
 * @author GUSTAVO
 */
public class Factura {
   private int num;
   private double monto;
   private Fecha fecha;
   private Cliente cliente;
   
   public Factura(){
       
   }
   
   public Factura(int num,double monto, Fecha fecha,Cliente cliente){
       this.num=num;
       this.monto=monto;
       this.cliente=cliente;
       this.fecha=fecha;
   }
   
  // public void agregarProducto(Producto producto){
    // productos.add(producto);
  //}

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" + "num=" + num + ", monto=" + monto + ", fecha=" + fecha + ", cliente=" + cliente + '}';
    }

    
}