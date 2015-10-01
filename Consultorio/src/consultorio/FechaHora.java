/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio;

/**
 *
 * @author au6usto
 */
public class FechaHora extends Fecha {
    
    private int hora;
    private int minutos;
    private int segundos;

    public FechaHora(int dia, int mes, int año,int hora, int minutos, int segundos) {
        super(dia, mes, año);
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return super.toString() + " " + hora + ":" + minutos + ":" + segundos;
    }
    
}
