/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploparadefensa;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author au6usto
 */
public class EjemploParaDefensa {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Persona> personas = new ArrayList<>();
    
    public static void main(String[] args) {
        Asignatura a1 = new Asignatura("Paradigmas de Programación");
        Asignatura a2 = new Asignatura("Análisis de Sistemas");
        Asignatura a3 = new Asignatura("Sintaxis y Semántica de los Lenguajes");
        Asignatura a4 = new Asignatura("Arquitectura de Computadoras");
        Asignatura a5 = new Asignatura("Analisis Matematico");
        Asignatura a6 = new Asignatura("Matematica Superior");
        Asignatura a7 = new Asignatura("Sistemas y Organizaciones");
        
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        asignaturas.add(a1);
        
        ArrayList<Asignatura> asignaturas2 = new ArrayList<>();
        asignaturas2.add(a4);
        asignaturas2.add(a5);
        asignaturas2.add(a6);
        
        ArrayList<Asignatura> asignaturas3 = new ArrayList<>();
        asignaturas3.add(a7);
        asignaturas3.add(a5);
        
        Docente d1 = new Docente("Torres", "Mabel", 353534, asignaturas);
        Docente d2 = new Docente("Araujo", "Diego", 3532323, asignaturas2);
        Docente d3 = new Docente("Cardozo", "Teresa", 353453, asignaturas3);
        Docente d4 = new Docente("Cardozo", "Teresa", 353453, asignaturas3);
        
        NoDocente n1 = new NoDocente("Bedel", "mañana", 123123, 180);
        NoDocente n2 = new NoDocente("Bedel", "siesta", 54545, 60);
        NoDocente n3 = new NoDocente("Bedel", "noche", 345345, 50);
        
        
        EjemploParaDefensa.agregarPersona(d1,personas);
        EjemploParaDefensa.agregarPersona(d2,personas);
        EjemploParaDefensa.agregarPersona(d3,personas);
        EjemploParaDefensa.agregarPersona(d4,personas);
        EjemploParaDefensa.agregarPersona(n1,personas);
        EjemploParaDefensa.agregarPersona(n2,personas);
        EjemploParaDefensa.agregarPersona(n3,personas);
        
        ArrayList<Docente> docentes = new ArrayList<>();
        
        EjemploParaDefensa.agregarPersona(d1,docentes);
        EjemploParaDefensa.agregarPersona(d2,docentes);
        EjemploParaDefensa.agregarPersona(d3,docentes);
        EjemploParaDefensa.agregarPersona(d4,docentes);
       
        System.out.println(EjemploParaDefensa.personas.toString());
        EjemploParaDefensa.ranking(docentes);
    }
    
    public static void agregarPersona(Persona p, ArrayList array) {
        if(!array.contains(p)) {
            array.add(p);
        }
    }
    
    public static void ranking(ArrayList<Docente> docentes) {
        Collections.sort(docentes,Collections.reverseOrder());
        System.out.println("Ranking");
        System.out.println("-----------------");
        System.out.println(docentes.toString());
        
    }
    
    
}

