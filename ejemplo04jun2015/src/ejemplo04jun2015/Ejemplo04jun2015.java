package ejemplo04jun2015;

/**
 *
 * @author au6usto
 */
public class Ejemplo04jun2015 {

    public static int fibo(int n){ 
        int res1=1;
        int res2=1;
        
        for(int i=2;i<=n;i++){
            res2 = res1 + res2;
            res1 = res2 - res1;
        }
        
        return res2;
    }
    
    public static int fibo2(int n) {
        int res;
        switch(n) {
            case 0: 
                res = 1; 
                break;
            case 1: 
                res = 1;
                break;
            default: 
                res = fibo(n-1) + fibo(n-2);
                break;
        }
        return res;
    }
    
    public static void main(String[] args) {
        int res= fibo(12);
        int res2= fibo2(12);
        System.out.println("Fibo 12 = "+res);
        System.out.println("Fibo 12 = "+res2);
    }
    
}
