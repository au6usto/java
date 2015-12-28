package modelo;

import java.util.ArrayList;

public class Medico {
    private String nombre;
    private String apellido;
    private int matricula;
    private ArrayList<Paciente> pacientes;

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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Medico(String nombre, String apellido, int matricula, ArrayList<Paciente> pacientes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Medico{" + "nombre=" + nombre + ", apellido=" + apellido + ", matricula=" + matricula + ", pacientes=" + pacientes + '}';
    }
}
