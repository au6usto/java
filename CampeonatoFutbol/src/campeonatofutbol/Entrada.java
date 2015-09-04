/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonatofutbol;

/**
 *
 * @author au6usto
 */
public class Entrada {
    private int numero;
    private String tipo;
    private int asiento;

    public Entrada(int numero, String tipo, int asiento) {
        this.numero = numero;
        this.tipo = tipo;
        this.asiento = asiento;
    }
    
    public void mostrar (){
        System.out.print("N°: "+numero+"\tTipo: "+tipo+"\tAsiento:"+asiento );
    }
    
}
