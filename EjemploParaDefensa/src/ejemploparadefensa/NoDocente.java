
package ejemploparadefensa;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class NoDocente extends Persona{
    private int horasTrabajadas;

    public NoDocente(String apellido, String nombre, int dni, int horastrabajadas) {
        super(apellido, nombre, dni);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() + " NoDocente{" + "horasTrabajadas=" + horasTrabajadas + "}\n";
    }
    
    
   
}
