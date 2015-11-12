package controller;

import model.*;
import view.*;
import javax.swing.table.DefaultTableModel;

/**
 * UTN-FRT ISI
 *
 * @author au6usto
 */
public class ToDoController {

    static ToDoView toDoView = new ToDoView();
    static DB db = new DB();

    public static void showWindow() {
        //toDoView.getjComboBox1().addItem("asdf");

        toDoView.setVisible(true);
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Id");
        table.addColumn("Nombre");
        table.addColumn("Importancia");
        table.addColumn("Creado");
        table.addColumn("Actualizado");
        for (ToDo todo : db.retrieve()) {
            Object[] row = new Object[5];
            row[0] = todo.getId();
            row[1] = todo.getTodo();
            row[2] = todo.getImportance();
            row[3] = todo.getCreatedAt();
            row[4] = todo.getUpdatedAt();
            table.addRow(row);
        }
        toDoView.getjTable1().setModel(table);
    }

    public static void buttonAddToDo() {
        String todo = toDoView.getjTextField1().getText();
        String importance = toDoView.getjComboBox1().getSelectedItem().toString();
        ToDo todoObj = new ToDo(1, todo, importance);
        db.create(todoObj);
        showWindow();
    }

    public static void buttonDeleteToDo() {
        int row = toDoView.getjTable1().getSelectedRow();
        int modelId =  Integer.parseInt(toDoView.getjTable1().getModel().getValueAt(row,0).toString());
        //System.out.println(modelId);
        db.delete(modelId);
        showWindow();
    }
}
