/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author au6usto
 */
public class Alquiler {
    private String fechaAlquiler;
    private String fechaDev;
    private Socio unSocio;
    private Empleado unEmpleado;
    private Pelicula miPelicula;

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(String fechaDev) {
        this.fechaDev = fechaDev;
    }

    public Socio getUnSocio() {
        return unSocio;
    }

    public void setUnSocio(Socio unSocio) {
        this.unSocio = unSocio;
    }
    

    public Empleado getUnEmpleado() {
        return unEmpleado;
    }

    public void setUnEmpleado(Empleado unEmpleado) {
        this.unEmpleado = unEmpleado;
    }

    public Pelicula getMiPelicula() {
        return miPelicula;
    }

    public void setMiPelicula(Pelicula miPelicula) {
        this.miPelicula = miPelicula;
    }
    
    
    
}
