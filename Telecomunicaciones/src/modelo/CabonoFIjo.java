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
public class CabonoFIjo extends Cliente {
    private int monto;
    private int nro_cuenta;
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public CabonoFIjo(int dni, String nombre) {
        super(dni, nombre);
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public CabonoFIjo(int dni,String nombre,int monto,int nro_cuenta){
        super(dni,nombre);
        this.monto=monto;
        this.nro_cuenta=nro_cuenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNro_cuenta() {
        return nro_cuenta;
    }

    public void setNro_cuenta(int nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "CabonoFIjo{" + "monto=" + monto + ", nro_cuenta=" + nro_cuenta + ", productos=" + productos + '}';
    }

    
   
}
