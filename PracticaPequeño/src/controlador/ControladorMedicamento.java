package controlador;

import javax.swing.table.DefaultTableModel;
import modelo.*;
import vistas.VentanaAltaMedicamento;

public class ControladorMedicamento {
    public static VentanaAltaMedicamento ventana = new VentanaAltaMedicamento(); //crea el objeto ventana
    public static DB db = new DB();//crea DB
    
    public static void mostrar(){
        ventana.setVisible(true);//hace visible la ventana
        DefaultTableModel tabla = new DefaultTableModel();//crea tabla
        tabla.addColumn("nombre");//agrega la columna nombre
        tabla.addColumn("dosis");//agrega la columna dosis
        for(Medicamento medicamento: db.mostrarMedicamentos()){//traigo los medicamentos y recorro el listado
            Object[] fila = new Object[2];//Crea Vector de tipo OBJECT con 2 posiciones
            fila[0] = medicamento.getNombre();//carga la posicion 1 con el nombre
            fila[1] = medicamento.getDosis();//carga la posicion 2 con la dosis
            tabla.addRow(fila);//agrega la fila con los datos del vector FILA
        }
        ventana.getjTable1().setModel(tabla);//trae el JTABLE de VentanaAltaMedicamento y reemplaza los valores con los de TABLA
    }
    
    public static void crear(){
        Medicamento medicamento = new Medicamento(ventana.getJTextField1(), ventana.getJTextField2());
        db.crearMedicamento(medicamento);
        ControladorMedicamento.mostrar();
        //ventana
    }
    
    public static void borrar(){
        int fila = ventana.getjTable1().getSelectedRow();//obtiene nro de fila seleccionado
        Object data = (Object)ventana.getjTable1().getValueAt(fila, 0);//obtiene el valor contenido en la fila seleccionada
        String nombre = (String) data;//convierte OBJECT a STRING
        if (nombre.length() > 0) {//valida que no este vacio
            int opcion = javax.swing.JOptionPane.showConfirmDialog(null, "Confirmar eliminacion");//cartel de confirmacion
            if (opcion == javax.swing.JOptionPane.YES_OPTION) { 
                db.borrarMedicamento(nombre);
                ControladorMedicamento.mostrar();
            }
        }
    }
    
    public static void actualizar(){
        Medicamento mNew = new Medicamento(ventana.getJTextField1(), ventana.getJTextField2());
        int fila = ventana.getjTable1().getSelectedRow();
        Object data1 = (Object)ventana.getjTable1().getValueAt(fila, 0);
        Object data2 = (Object)ventana.getjTable1().getValueAt(fila, 1);
        String nombre = (String) data1;
        String dosis = (String) data2;
        Medicamento mOld = new Medicamento(nombre, dosis);
        db.actualizarMedicamento(mNew, mOld);
        ControladorMedicamento.mostrar();
    }
}
