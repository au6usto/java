/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;

/**
 *
 * @author gustavo
 */
public class CprePago extends Cliente {
     private ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();

    public CprePago(int dni, String nombre) {
        super(dni, nombre);
    }
    
     public void agregarTarjeta(Tarjeta tarjeta){
        tarjetas.add(tarjeta);
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    @Override
    public String toString() {
        return "CprePago{" + "tarjetas=" + tarjetas + '}';
    }
    
    
}
