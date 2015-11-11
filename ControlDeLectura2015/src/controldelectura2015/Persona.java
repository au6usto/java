
package controldelectura2015;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Persona {
    private int dni;
    private String nombre;
    private Fecha fecha;

    public Persona(int dni, String nombre, Fecha fecha) {
        this.dni = dni;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
}
