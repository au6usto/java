package controller;

import javax.swing.table.DefaultTableModel;
import model.*;
import views.*;

/**
 * UTN-FRT ISI
 *
 * @author au6usto
 */
public class StudentsController{
    static StudentFormView form = new StudentFormView();
    static StudentView studentView = new StudentView(form);
    static DB db = new DB();

    public static void createStudent(){
        Student student = new Student(form.getjTextFieldDni(), form.getjTextFieldDocket(), form.getjTextFieldName(), form.getjTextFieldLastName(), form.getjTextFieldPhoneNumber(), form.getjTextFieldAddress(), form.getjTextFieldEmail());

        db.createStudent(student);
        StudentsController.retrieveStudents();

    }

    public static void updateStudent() {

    }

    public static void deleteStudent() {
        int index = studentView.getjTable1().getSelectedRow();
        System.out.println("indice: " + index);
        if (index > -1) {
            int opcion = javax.swing.JOptionPane.showConfirmDialog(null, "Confirmar eliminacion");
            if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                db.deleteStudent(index);
                StudentsController.retrieveStudents();
            }
        }

    }

    public static void retrieveStudents() {
        studentView.setVisible(true);
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
