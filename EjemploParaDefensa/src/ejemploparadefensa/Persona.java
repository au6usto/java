
package ejemploparadefensa;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Persona {
    private static int id = 0;
    private String apellido;
    private String nombre;
    private int dni;
    private int legajo;

    public Persona(String apellido, String nombre, int dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = Persona.id++;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public int getLegajo() {
        return legajo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Persona{" + "apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", legajo=" + legajo + "}";
    }
    
    
}
