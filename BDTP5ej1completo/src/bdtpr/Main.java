/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bdtpr;

import controlador.Controlador;
import java.sql.SQLException;
import modelo.Conexion;

/**
 *
 * @author Marta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException, ClassNotFoundException  {
        // TODO code application logic here
         Conexion con = new Conexion();
        if(con.conectar()<0){
            System.out.println("Error no se puede iniciar la Aplicacion");
            System.exit(0);
        }
        Controlador controlador = new Controlador(con);
        controlador.ejecutar();
    }

}
