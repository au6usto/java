
package campeonato;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private int goles;

    public Jugador(String nombre, int goles) {
        this.nombre = nombre;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", goles=" + goles + "}\n";
    }

    @Override
    public int compareTo(Jugador t) {
        //return ((Jugador)t).nombre.compareTo(nombre);
        return  goles - t.getGoles();
    }
    
}
