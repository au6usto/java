
package controldelectura2015;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public double calcularArea(){
        return getLado() * getLado();
    }
    
    public double calcularSuperficie(){
        return getLado() * 4;
    }

}
