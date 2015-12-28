/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;
import modelo.*;
/**
 *
 * @author gustavo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Producto pro1= new Producto(22,"Datos");
       Producto pro2= new Producto(53,"SMS");
       Producto pro3= new Producto(30,"Llamadas");
       Producto pro4= new Producto(30,"SMS");
       
       Tarjeta tar1 = new Tarjeta(30,"Datos");
       Tarjeta tar2 = new Tarjeta(30,"Lamadas");
       Tarjeta tar3 = new Tarjeta(30,"SMS");
       Tarjeta tar4 = new Tarjeta(30,"Llamadas");
       
       CabonoFIjo c1= new CabonoFIjo(20300322,"Juan",229,293939);
       c1.agregarProducto(pro1);
       c1.agregarProducto(pro2);
       CabonoFIjo c2= new CabonoFIjo(29384737,"Rosa",229,292343);
       c2.agregarProducto(pro4);
       c2.agregarProducto(pro3);
       
       CprePago c3 = new CprePago(29394853,"Jose");
       c3.agregarTarjeta(tar1);
       c3.agregarTarjeta(tar2);
       CprePago c4 = new CprePago(94857463,"Jorgelina");
       c4.agregarTarjeta(tar3);
       c4.agregarTarjeta(tar4);
       
       Compañia com = new Compañia();
        com.agregarTarjeta(c1);
        com.agregarTarjeta(c2);
        com.agregarFijo(c3);
        com.agregarFijo(c4);
        
        com.factuCabono();
        com.totalVenCPre();
        com.ranking();
    }
    
}
