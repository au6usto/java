
package policiaprovincial;

public class AgenteIntervencion extends Agente {
    private String especialidad;
    private String clasificacion;
    private int intervenciones;

    public AgenteIntervencion(String especialidad, String clasificacion, int intervenciones, int numero, String nombre, int antiguedad) {
        super(numero, nombre, antiguedad);
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
    
public void calcularSueldo(){
   
    super.calcularSueldo(); 
    System.out.println(super.getAntiguedad()*1000);
}
}
