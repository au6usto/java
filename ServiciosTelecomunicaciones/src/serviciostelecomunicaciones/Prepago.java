package serviciostelecomunicaciones;

import java.util.ArrayList;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Prepago extends Cliente{
    static private double totalVendido = 0;

    public Prepago(String nombre, int dni, String numero, String direccion, ArrayList<Producto> servicios) {
        super(nombre, dni, numero, direccion, servicios);
        double total = 0;
        for (Producto servicio : servicios) {
            total += servicio.getPrecio();
        }
        Prepago.totalVendido = total;
    }
    

    
     public static double getTotalVendido() {
        return totalVendido;
    }

    @Override
    public String toString() {
        return super.toString() + " Prepago{Total vendido=" + Prepago.getTotalVendido() + '}';
    }
    
    
}
