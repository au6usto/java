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
public class Tarjeta {
    private double monto;
    private String descrip;

    public Tarjeta() {
    }

    public Tarjeta(double monto, String descrip) {
        this.monto = monto;
        this.descrip = descrip;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "monto=" + monto + ", descrip=" + descrip + '}';
    }
    
}
