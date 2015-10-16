package serviciostelecomunicaciones;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Tarjeta extends Producto{
    
    static private int id = 0;
    private int numero;

    public Tarjeta(double precio, int nombre, Fecha vencimiento) {
        super(precio, nombre, vencimiento);
        this.setNumero(Tarjeta.id++);
        incrementTarjetasVendidas();

    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }  
    
    private void incrementTarjetasVendidas() {
        Tarjeta.id++;
    }

    public static int getTarjetasVendidas() {
        return id;
    }
}
