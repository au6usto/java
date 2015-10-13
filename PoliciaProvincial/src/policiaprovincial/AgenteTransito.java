
package policiaprovincial;

import java.util.ArrayList;

public class AgenteTransito extends Agente {
   private ArrayList<Multa> multa;

    public AgenteTransito(ArrayList multa, int numero, String nombre, int antiguedad) {
        super(numero, nombre, antiguedad);
        this.multa = multa;
    }

    public ArrayList<Multa> getMulta() {
        return multa;
    }

    public void setMulta(ArrayList<Multa> multa) {
        this.multa = multa;
    }
   public ArrayList<Multa> multas(){
       return multa;
   }
    public void calcularSueldo(){
        super.calcularSueldo();
        System.out.println(multas().size()*1000);
    }
    

}
