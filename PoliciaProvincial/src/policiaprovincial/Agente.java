
package policiaprovincial;

import java.util.ArrayList;

public class Agente {
    private int numero;
    private String nombre;
    private int antiguedad;

    public Agente(int numero, String nombre, int antiguedad) {
        this.numero = numero;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public void calcularSueldo(){
        System.out.print("El sueldo de: " + nombre + " es: ");
    }
    
    public void ranking(ArrayList<Agente> agentes){
        int aux;
        for(int i=0; i<agentes.size()-1;i++){
            for(int j=0; j<agentes.size()-i-1;i++){
                if(agentes.get(j+1).<agentes.get(j)){
                    aux=agentes[j+1];
                    agentes[j+1]=agentes[j];
                    agentes[j]=aux;               
                }
            }
        }
        
        for (Agente agente : agentes) {
            }
    }
}
