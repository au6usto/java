/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos;

/**
 *
 * @author au6usto
 */
import model.DB;
import controller.StudentsController;
import views.StudentView;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DB db = new DB();
        System.out.println("asd11");
        StudentView studentView = new StudentView();
        System.out.println("asd22");
        StudentsController controller = new StudentsController(studentView, db);
        System.out.println("asd33");
        controller.retrieveStudents();
        System.out.println("asd44");
        studentView.setController(controller);
        System.out.println("asd55");
        studentView.execute();
        System.out.println("asd66");
    }

}
