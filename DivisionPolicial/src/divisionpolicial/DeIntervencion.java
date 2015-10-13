/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionpolicial;

/**
 *
 * @author au6usto
 */
public class DeIntervencion  extends Agente{
    private String especialidad;
    private String clasificacion;
    private int intervenciones;
    
    public DeIntervencion(String nombre, int antigüedad, String especialidad, String clasificacion, int intervenciones) {
        super(nombre, antigüedad);
        this.especialidad = especialidad;
        this.clasificacion = clasificacion;
        this.intervenciones = intervenciones;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(int intervenciones) {
        this.intervenciones = intervenciones;
    }
    
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo() * getAntigüedad();
    }
    
    @Override
    public int calcularIntMultas(){
        return getIntervenciones();
    }

    @Override
    public String toString() {
        return super.toString() + " DeIntervencion{" + "especialidad=" + especialidad + ", clasificacion=" + clasificacion + ", intervenciones=" + intervenciones + '}';
    }
    
    
}
