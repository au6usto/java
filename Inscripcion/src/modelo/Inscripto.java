/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Inscripto {
    private ArrayList<Materia> materias = new ArrayList<Materia>();
    
     public void agregarMaterias(Materia materia){
        materias.add(materia);
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Inscripto{" + "materias=" + materias + '}';
    }
    
    
}
