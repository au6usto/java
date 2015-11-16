package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.*;
import views.*;

/**
 * UTN-FRT ISI
 *
 * @author au6usto
 */
public class StudentsController implements ActionListener {

    private StudentFormView form;
    private StudentView studentView;
    private DB db = new DB();

    public StudentsController(StudentView studentView, DB db) {
        this.studentView = studentView;
        this.db = db;
        this.form = new StudentFormView(studentView, true);
        studentView.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(StudentView.ADD_LIST)) {
            form.execute();
        }
        if (e.getActionCommand().equals(StudentView.MOD_LIST)) {
            updateStudent();
        }
        if (e.getActionCommand().equals(StudentView.DEL_LIST)) {
            deleteStudent();
        }
        if (e.getActionCommand().equals(StudentFormView.ADD_STUDENT)) {
            try {
                createStudent();
            } catch (ParseException ex) {
                Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void createStudent() throws ParseException {
        Date sd = new SimpleDateFormat("dd MMM yyyy").parse(form.getjTextFieldBirthday());
        java.sql.Date birthday = new java.sql.Date(sd.getTime());
        Student student = new Student(form.getjTextFieldDni(), form.getjTextFieldDocket(), form.getjTextFieldName(), form.getjTextFieldLastName(), form.getjTextFieldPhoneNumber(), form.getjTextFieldAddress(), form.getjTextFieldEmail(), birthday);

        db.createStudent(student);
        this.retrieveStudents();

    }

    public void updateStudent() {

    }

    public void deleteStudent() {
        int indice = studentView.getjTable1().getSelectedRow();
        System.out.println("indice" + indice);
        if (indice > -1) {
            int opcion = javax.swing.JOptionPane.showConfirmDialog(null, "Confirmar eliminacion");
            if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                db.deleteStudent(indice);
                this.retrieveStudents();
            }
        }

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
