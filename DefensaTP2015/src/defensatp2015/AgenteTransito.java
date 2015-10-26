
package defensatp2015;

import java.util.ArrayList;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class AgenteTransito extends Agente{
    private ArrayList<Multa> multas;

    public AgenteTransito(ArrayList<Multa> multas, int nroDocumento, String apellido, String nombre, double sueldoBase) {
        super(nroDocumento, apellido, nombre, sueldoBase);
        this.multas = multas;
    }

    public ArrayList<Multa> getMultas() {
        return multas;
    }

    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }
    
    public void agregar(Multa multa) {
        multas.add(multa);
    }

    @Override
    public String toString() {
        return super.toString() + " Sueldo: $" + calcularSueldo();
    }
       
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo() + multas.size() * this.getSueldoBase();
    }
    
}
