
package defensatp2015;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class AgenteIntervencion extends Agente {
    private double porcentajeIntervenciones;

    public AgenteIntervencion(double porcentajeIntervenciones, int nroDocumento, String apellido, String nombre, double sueldoBase) {
        super(nroDocumento, apellido, nombre, sueldoBase);
        this.porcentajeIntervenciones = porcentajeIntervenciones;
    }

    public double getPorcentajeIntervenciones() {
        return porcentajeIntervenciones;
    }

    public void setPorcentajeIntervenciones(double porcentajeIntervenciones) {
        this.porcentajeIntervenciones = porcentajeIntervenciones;
    }

    @Override
    public String toString() {
        return super.toString() + " Sueldo: $" + calcularSueldo();
    }
    
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo() + getPorcentajeIntervenciones() * this.getSueldoBase();
    }
    
}
