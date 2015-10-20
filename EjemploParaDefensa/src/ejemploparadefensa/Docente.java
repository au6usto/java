package ejemploparadefensa;

import java.util.ArrayList;
import java.util.Collections;

/**
 * UTN-FRT ISI
 *
 * @author au6usto
 */
public class Docente extends Persona implements Comparable<Docente>{

    ArrayList<Asignatura> listaAsignaturas;

    public Docente(String apellido, String nombre, int dni, ArrayList<Asignatura> listaAsignaturas) {
        super(apellido, nombre, dni);
        this.listaAsignaturas = listaAsignaturas;
    }

    public ArrayList<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }
    
    public int cantidadAsignaturas() {
        return listaAsignaturas.size();
    }

    public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public void agregar(Asignatura a) {
        listaAsignaturas.add(a);
    }

    @Override
    public String toString() {
        return super.toString() + " Docente{" + "listaAsignaturas=" + listaAsignaturas.size() + "}\n";
    }

    @Override 
    public int compareTo(Docente aThat) {
    final int BEFORE = -1;
    final int EQUAL = 0;
    final int AFTER = 1;

    //this optimization is usually worthwhile, and can
    //always be added
    if (this == aThat) {
        return EQUAL;
    }

    //primitive numbers follow this form
    if (this.cantidadAsignaturas() < aThat.cantidadAsignaturas()){
        return BEFORE;
    }
    if (this.cantidadAsignaturas() > aThat.cantidadAsignaturas()) {
        return AFTER;
    }

    //booleans follow this form
    //if (!this.fIsNewAccount && aThat.fIsNewAccount) return BEFORE;
    //if (this.fIsNewAccount && !aThat.fIsNewAccount) return AFTER;

    //objects, including type-safe enums, follow this form
    //note that null objects will throw an exception here
    //int comparison = this.fAccountType.compareTo(aThat.fAccountType);
    //if (comparison != EQUAL) return comparison;

    //comparison = this.fLastName.compareTo(aThat.fLastName);
    //if (comparison != EQUAL) return comparison;

    //comparison = this.fFirstName.compareTo(aThat.fFirstName);
    //if (comparison != EQUAL) return comparison;

    //if (this.fBalance < aThat.fBalance) return BEFORE;
    //if (this.fBalance > aThat.fBalance) return AFTER;

    //all comparisons have yielded equality
    //verify that compareTo is consistent with equals (optional)
    //assert this.equals(aThat) : "compareTo inconsistent with equals.";

    return EQUAL;
  }

   
}
