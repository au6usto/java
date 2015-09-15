/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author au6usto
 */
public class Cliente extends Persona {
    private String nombre_empresa;
    private int telefono;
    
    public Cliente (String nombre, int edad, String nombre_empresa, int telefono){
        super(nombre, edad);
        this.nombre_empresa= nombre_empresa;
        this.telefono= telefono;
        
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
     public void mostrar(){
         String result = "nombre de Empresa" + nombre_empresa + " Teléfono: "+ telefono;
         super.mostrar();
         System.out.println(result);
     
     }
    
}
