package serviciostelecomunicaciones;

import java.util.ArrayList;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Cliente {

    private String nombre;
    private int dni;
    private String numero;
    private String direccion;
    ArrayList<Producto> productos;

    public Cliente(String nombre, int dni, String numero, String direccion, ArrayList<Producto> productos) {
        this.nombre = nombre;
        this.dni = dni;
        this.numero = numero;
        this.direccion = direccion;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", numero=" + numero + ", \ndireccion=" + direccion + ", productos=" + productos.size() + "}\n Productos: "+productos.toString();
    }
    
}
