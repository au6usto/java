
package controldelectura2015;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Jugador {
    private int posicion;
    private String nombre;

    public Jugador(int posicion, String nombre) {
        this.posicion = posicion;
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
