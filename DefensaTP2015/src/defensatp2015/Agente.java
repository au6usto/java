
package defensatp2015;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Agente {
    private int nroDocumento;
    private String apellido;
    private String nombre;
    private double sueldoBase;

    public Agente(int nroDocumento, String apellido, String nombre, double sueldoBase) {
        this.nroDocumento = nroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
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

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Agente{" + "nroDocumento=" + nroDocumento + ", apellido=" + apellido + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + '}';
    }
    
    public double calcularSueldo(){
        return sueldoBase;
    }
}
