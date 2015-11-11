
package controldelectura2015;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Alumno extends Persona{
    private int legajo;
    private String carrera;

    public Alumno(int dni, String nombre, Fecha fecha, int legajo, String carrera) {
        super(dni, nombre, fecha);
        this.carrera = carrera;
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
    
}
