/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Calendar;

/**
 *
 * @author usuario
 */
public class Fecha {
    private int dia, mes, anio;

    public Fecha() {
        Calendar fecha = Calendar.getInstance();
        dia = fecha.get(Calendar.DAY_OF_MONTH);
        mes = fecha.get(Calendar.MONTH);
        anio = fecha.get(Calendar.YEAR);
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public Fecha(String fecha,boolean c){
        if(c){
        this.dia= Integer.parseInt(fecha.substring(0,2));
        this.mes= Integer.parseInt(fecha.substring(3,5));
        this.anio= Integer.parseInt(fecha.substring(6));
        }
        else{
        this.anio= Integer.parseInt(fecha.substring(0,4));
        this.mes= Integer.parseInt(fecha.substring(5,7));
        this.dia= Integer.parseInt(fecha.substring(8,10));
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public String getFecha(boolean c){
        String cmes = mes<10?"0"+mes:""+mes;
        String cdia = dia<10?"0"+dia:""+dia;
        if(c)
        return ""+anio+"-"+cmes+"-"+cdia;
        else
        return cdia+"/"+cmes+"/"+anio;
    }

    @Override
    public String toString() {
        return ""+dia + "/" + mes + "/" + anio;
    }

}
