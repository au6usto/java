
package ejemploparadefensa;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Asignatura {
    
    private static int id;
    private int codigo;
    private String nombre;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.codigo = Asignatura.id++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
    
}
