/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public abstract class Entidad {
    private String nombre;
    private Conexion conexion;

    public Entidad() {
    }

    public Entidad(String nombre, Conexion conexion) {
        this.nombre = nombre;
        this.conexion = conexion;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    
    public abstract void agregar();
    public abstract void modificar();
    public abstract void eliminar();
    public abstract boolean buscar();
    public abstract ArrayList leer();

}
