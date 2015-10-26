
package defensatp2015;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Multa {
    private static int id = 0;
    private int nroMulta;
    private String tipo;
    private String fecha;

    public Multa(int nroMulta, String tipo, String fecha) {
        this.nroMulta = nroMulta;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Multa.id = id;
    }

    public int getNroMulta() {
        return nroMulta;
    }

    public void setNroMulta(int nroMulta) {
        this.nroMulta = nroMulta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Multa{" + "nroMulta=" + nroMulta + ", tipo=" + tipo + ", fecha=" + fecha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.nroMulta;
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
        final Multa other = (Multa) obj;
        if (this.nroMulta != other.nroMulta) {
            return false;
        }
        return true;
    }
    
    
}
