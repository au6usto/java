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
public class Compañia {
    private ArrayList<CprePago> prepagos = new ArrayList<CprePago>();
    private ArrayList<CabonoFIjo> fijos = new ArrayList<CabonoFIjo>();
    
    
    public void agregarFijo(CprePago prepago){
        prepagos.add(prepago);
    }
    
    public void agregarTarjeta(CabonoFIjo abono){
        fijos.add(abono);
    }
    public void factuCabono(){
         float ac=0;
        int index=1; 
        
        System.out.println("Valor de facturación a cada cliente con abono fijo:");
        for(CabonoFIjo tmp : fijos) {
            ac=0;
            for(Producto tmp1 : tmp.getProductos()) {
                ac+=tmp1.getMonto();
            }
            System.out.println(index+". Cliente: " + tmp.getNombre() + " - Facturación: $" + ac);
            index++;
        }
    }
    
    public void totalVenCPre() {
        int index=1;
        float ac=0,vt=0;
        
        System.out.println("\nValor total de ventas de productos a clientes pre-pagos:");
        for(CprePago tmp : prepagos) {
            ac=0;
            for(Tarjeta tmp1 : tmp.getTarjetas()) {
                ac+=tmp1.getMonto();
            }
            vt+=ac;
            index++;
        }
        System.out.println("Venta total: $" + vt);
    }
    public void ranking() {
        int ac1=0,ac2=0,ac3=0;
        
        System.out.println("\nRanking de Productos según cantidad vendida:");
        for(CabonoFIjo tmp : fijos) {
            for(Producto tmp1 : tmp.getProductos()) {
                if(tmp1.getDescripcion().matches("Datos")) {
                    ac1++;
                }
                if(tmp1.getDescripcion().matches("SMS")) {
                    ac2++;
                }
                if(tmp1.getDescripcion().matches("Llamadas")) {
                    ac3++;
                }
            }
        }
        for(CprePago tmp2 : prepagos) {
            for(Tarjeta tmp3 : tmp2.getTarjetas()) {
                if(tmp3.getDescrip().matches("Datos")) {
                    ac1++;
                }
                if(tmp3.getDescrip().matches("SMS")) {
                    ac2++;
                }
                if(tmp3.getDescrip().matches("Llamadas")) {
                    ac3++;
                }
            }
        }
        System.out.println("Producto: Datos - Cantidad: " + ac1);
        System.out.println("Producto: SMS: " + ac2);
        System.out.println("Producto: Llamads: " + ac3);
        
    }
    

    public ArrayList<CprePago> getPrepagos() {
        return prepagos;
    }

    public void setPrepagos(ArrayList<CprePago> prepagos) {
        this.prepagos = prepagos;
    }

    public ArrayList<CabonoFIjo> getFijos() {
        return fijos;
    }

    public void setFijos(ArrayList<CabonoFIjo> fijos) {
        this.fijos = fijos;
    }

    @Override
    public String toString() {
        return "Compa\u00f1ia{" + "prepagos=" + prepagos + ", fijos=" + fijos + '}';
    }
   
   
}
