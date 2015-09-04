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
public class Videclub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socio soc1 = new Socio();
        Socio soc2 = new Socio();
        
        soc1.setNombre("José");
        soc1.setMayorEdad(true);
        soc1.setNumero(1);
        soc1.setDni(12123244);
        
        soc2.setNombre("Pequeño");
        soc2.setMayorEdad(true);
        soc2.setNumero(2);
        soc2.setDni(12123245);
        
        
        
        Empleado empleado = new Empleado();
        
        empleado.setNombre("Tony");
        empleado.setDni(34202238);
        
        Pelicula peli1 = new Pelicula();
        Pelicula peli2 = new Pelicula();
        
        peli1.setGenero("Terror");
        peli1.setNombre("Scream");
        peli2.setGenero("Acción");
        peli2.setNombre("Indestructibles");
        
        Alquiler alq1 = new Alquiler();
        Alquiler alq2 = new Alquiler();
        Alquiler alq3 = new Alquiler();
        
        alq1.setUnSocio(soc1);
        alq1.setFechaAlquiler("28/8/2015");
        alq1.setFechaDev("25/8/2015");
        alq1.setMiPelicula(peli1);
        alq1.setUnEmpleado(empleado);
        
        alq2.setUnSocio(soc1);
        alq2.setFechaAlquiler("28/8/2015");
        alq2.setFechaDev("25/8/2015");
        alq2.setMiPelicula(peli2);
        alq2.setUnEmpleado(empleado);
        
        alq3.setUnSocio(soc2);
        alq3.setFechaAlquiler("28/8/2015");
        alq3.setFechaDev("25/8/2015");
        alq3.setMiPelicula(peli2);
        alq3.setUnEmpleado(empleado);
        
        System.out.println(alq1.getUnSocio().getNombre());
        System.out.println(alq1.getUnEmpleado().getNombre());
        System.out.println(alq1.getFechaAlquiler());
        System.out.println(alq1.getFechaDev());
        System.out.println(alq1.getMiPelicula().getNombre());
        System.out.println(alq1.getMiPelicula().getGenero());
        
        System.out.println("-------------------------");
        
        System.out.println(alq2.getUnSocio().getNombre());
        System.out.println(alq2.getUnEmpleado().getNombre());
        System.out.println(alq2.getFechaAlquiler());
        System.out.println(alq2.getFechaDev());
        System.out.println(alq2.getMiPelicula().getNombre());
        System.out.println(alq2.getMiPelicula().getGenero());
        
        
        
    }
    
}
