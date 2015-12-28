package modelo;

import java.util.ArrayList;

class Paciente {
    private String nombre;
    private String apellido;
    private ObraSocial obraSocial;
    private ArrayList<OrdenMedica> ordenMedica;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }

    public ArrayList<OrdenMedica> getOrdenMedica() {
        return ordenMedica;
    }

    public void setOrdenMedica(ArrayList<OrdenMedica> ordenMedica) {
        this.ordenMedica = ordenMedica;
    }

    public Paciente(String nombre, String apellido, ObraSocial obraSocial, ArrayList<OrdenMedica> ordenMedica) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.obraSocial = obraSocial;
        this.ordenMedica = ordenMedica;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", apellido=" + apellido + ", obraSocial=" + obraSocial + ", ordenMedica=" + ordenMedica + '}';
    }
}
