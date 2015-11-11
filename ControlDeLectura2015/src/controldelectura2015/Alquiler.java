
package controldelectura2015;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Alquiler {
    private Cliente cliente;
    private Pelicula pelicula;

    public Alquiler(Cliente cliente, Pelicula pelicula) {
        this.cliente = cliente;
        this.pelicula = pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }  
    
}
