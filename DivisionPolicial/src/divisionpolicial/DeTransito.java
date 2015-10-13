/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionpolicial;

import java.util.ArrayList;

/**
 *
 * @author au6usto
 */
public class DeTransito extends Agente{
    
    ArrayList<Multa> multas;
    
    public DeTransito(String nombre, int antigüedad, ArrayList<Multa> multas) {
        super(nombre, antigüedad);
        this.multas = multas;
    }

    public ArrayList<Multa> getMultas() {
        return multas;
    }

    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }
       
    @Override
    public int calcularIntMultas(){
        return multas.size();
    }
   
    @Override
    public double calcularSueldo(){
        return calcularIntMultas() * super.calcularSueldo();
    }

    @Override
    public String toString() {
        return super.toString() + " DeTransito{" + "multas=" + multas.size() + '}';
    }
    
    public void mostrarMultas() {
        for (Multa multa : multas) {
            System.out.println(multa.toString());
        }
    }
}
