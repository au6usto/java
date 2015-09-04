/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claserepaso;

/**
 *
 * @author au6usto
 */
public class ClaseRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno = new Alumno("perez","juan",31001635,59078);
        Alumno alumno2 = new Alumno("perez","luis",31007835,89076);
        Alumno alumno3 = new Alumno("perez","ana",31006735,98767);
        System.out.println("apellido: "+ alumno.getApellido() + " nombre: "+ alumno.getNombre()+" doc: "+ alumno.getDocumento()+ " legajo:"+ alumno.getLegajo());
        System.out.println("apellido: "+ alumno2.getApellido() + " nombre: "+ alumno2.getNombre()+" doc: "+ alumno2.getDocumento()+ " legajo:"+ alumno2.getLegajo());
        System.out.println("apellido: "+ alumno3.getApellido() + " nombre: "+ alumno3.getNombre()+" doc: "+ alumno3.getDocumento()+ " legajo:"+ alumno3.getLegajo());
    }
    
}
