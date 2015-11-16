
package controlador;

import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import vista.*;
import modelo.*;

public class Controlador {
    //private StudentFormView form;
    private VentanaPrincipal studentView;
    private Inscripto db = new Inscripto();
    
    public void createStudent() throws ParseException {
        
        int codigo = Integer.parseInt(ventanaFormulario.getjTextField1().getText());
        String nombre = ventanaFormulario.getjTextField2().getText();
        String profesor = ventanaFormulario.getjTextField3().getText();
        
        Materia materia = new Materia(codigo, nombre, profesor);
        
        int codigo = Integer.parseInt(ventanaFormulario.getTextFieldCodigoCarrera().getText());
        
        Carrera carrera = new Carrera(codigo, nombre);
        
        materia.setCarerra(null);

        db.agregarMaterias(materia);
        
        this.mostrar();

    }

    public void updateStudent() {

    }


    public void retrieveStudents() {
        //studentView.setVisible(true);
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Id");
        table.addColumn("DNI");
        table.addColumn("Legajo");
        table.addColumn("Apellido y Nombre");
        table.addColumn("Teléfono");
        table.addColumn("Dirección");
        table.addColumn("Email");
        table.addColumn("Fecha de Nac");
        table.addColumn("Creado");
        table.addColumn("Actualizado");
        for (Student student : db.retrieveStudents("")) {
            Object[] row = new Object[10];
            row[0] = student.getId();
            row[1] = student.getDni();
            row[2] = student.getDocket();
            row[3] = student.getLastName() + " , " + student.getName();
            row[4] = student.getPhoneNumber();
            row[5] = student.getAddress();
            row[6] = student.getEmail();
            row[7] = student.getBirthday();
            row[8] = student.getCreatedAt();
            row[9] = student.getUpdatedAt();
            table.addRow(row);
        }
        studentView.getjTable1().setModel(table);
    }
}
