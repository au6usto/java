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
public class Socio extends Persona {
    private int numero;
    private boolean mayorEdad;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }
    
}
