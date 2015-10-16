package serviciostelecomunicaciones;
import java.util.ArrayList;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Abono extends Cliente{

   private double precio;

    public Abono(String nombre, int dni, String numero, String direccion, ArrayList<Producto> productos) {
        super(nombre, dni, numero, direccion, productos);
        double total = 0;
        for (Producto servicio : productos) {
            total += servicio.getPrecio();
        }
        this.precio = total - total*0.1;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + " Abono{" + "precio=" + precio + '}';
    }
   
}
