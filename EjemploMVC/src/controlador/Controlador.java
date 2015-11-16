/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.GestorEmpleados;
import vista.VEmpleado;
import vista.VGestorEmpleado;

/**
 *
 * @author Tere
 */
public class Controlador implements ActionListener{
    private VEmpleado vistaE;
    private VGestorEmpleado vista;
    private GestorEmpleados modelo;

    public Controlador(VGestorEmpleado vista, GestorEmpleados modelo) {
        this.vista = vista;
        this.modelo = modelo;
         this.vistaE = new VEmpleado(vista, true);
        vistaE.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(vista.ADD_LISTA))
        {       vistaE.ejecutar();       }
        if(e.getActionCommand().equals(vista.MOD_LISTA))
        {       modificarEmpleado();      }
        if(e.getActionCommand().equals(vista.DEL_LISTA))
        {       eliminarEmpleado();         }
        if(e.getActionCommand().equals(vistaE.ADD_EMPLEADO))
        {       agregarEmpleado();        }
        
    }
    
    
    public void agregarEmpleado(){
          Empleado empleado = new Empleado(vistaE.getNroDocumento(),vistaE.getjTFApellido(), vistaE.getjTFNombre(), vistaE.getjTFSueldo());
          
        modelo.agregarEmpleados(empleado);           
       this.mostrar();
        
    }
    
    public void modificarEmpleado(){
        
    }
    
    public void eliminarEmpleado(){
        int indice = vista.getjTEmpleados().getSelectedRow();
        System.out.println("indice" + indice);
        if (indice > -1) {
            int opcion = javax.swing.JOptionPane.showConfirmDialog(null, "Confirmar eliminacion");
            if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                modelo.borrarEmpleado(indice);
                this.mostrar();
            }
        }
        
        
    }
    
    
    public void mostrar(){
        // vistaE.setVisible(true);
       DefaultTableModel datos = new DefaultTableModel();
       datos.addColumn("Documento");
       datos.addColumn("Apellido, Nombre");
       datos.addColumn("sueldo");
       for (Empleado empleado : modelo.getListaEmpleados()){
           Object[] fila = new Object[3];
           fila[0] = empleado.getDni();
           fila[1] = empleado.getApellido() +" , "+ empleado.getNombre();
           fila[2] = empleado.getSueldo();
           datos.addRow(fila);
       }
       vista.getjLTotal().setText(String.valueOf(total()));
       vista.getjTEmpleados().setModel(datos);
       
    }
    
    public float total(){
        float total = 0.0f;
        for(Empleado empleado : modelo.getListaEmpleados()){
            total = total + empleado.getSueldo();
            
        }
        return total;
    }
    
}
