package serviciostelecomunicaciones;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Producto {
    private double precio;
    private final String nombre;
    private final String[] nombres = new String[]{"Pack de sms", "Internet x dia", "Roaming internacional"};
    private Fecha vencimiento;

    public Producto(double precio, int nombre, Fecha vencimiento) {
        this.precio = precio;
        this.vencimiento = vencimiento;
        this.nombre = getNombres(nombre);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    private String getNombres(int nombre) {
        return this.nombres[nombre];
    }

    public Fecha getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Fecha vencimiento) {
        this.vencimiento = vencimiento;
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", nombre=" + nombre + ", vencimiento=" + vencimiento + '}';
    }
  
}
