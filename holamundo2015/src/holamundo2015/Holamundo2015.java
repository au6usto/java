/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo2015;

/**
 *
 * @author au6usto
 */
public class Holamundo2015 {

    /**
     * @param args the command line arguments
     */
    
    public static int sumar (int a, int b){
        int resultado = a + b;
        return resultado;
    }
    
    public static int fac(int n) {
        if (n<=1){
            return 1;
        }
        return n* fac(n-1);
    }
    
    public static void main(String[] args) {
        int a = 0;
        long ab = 1; // para menores a -2^32 mayores a 2^32
        byte ac = 2;
        short ad = 3;
        // No se recomienda para valroes monetarios.
        double b = 1.5; //El recomendado y más utilizado
        float c = 1.5f;
        boolean vivo = true;
        char inicial = 'c';
        
        System.out.println("Hola Mundo!!!");
        System.out.println(inicial);
        
        for (int i = 0; i<10; i++) {
            if (i%2 == 0) {
                System.out.println("i: " + i);
            }
        }
        
        int i = 0;
        while (i <10) {
            System.out.println("i: " + i);
            i++;
        }
        
        int numeros[] = {5,4,3,2,1};
        System.out.println(numeros[4]);
        for (int j=0; j < 10; j++) {
            System.out.println(numeros[j]);
        }
        
        
        int numero;
        numero = 2;
        int res = sumar (numero,2);
        
        System.out.println("Suma: " + res);
        System.out.println("fac(5): " + fac(5));
        
    }
    
}
