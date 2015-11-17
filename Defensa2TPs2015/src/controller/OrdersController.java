package controller;

import javax.swing.table.DefaultTableModel;
import model.*;
import views.*;

/**
 * UTN-FRT ISI
 *
 * @author au6usto
 */
public class OrdersController{
    static OrderFormView form = new OrderFormView();
    static OrdersView ordersView = new OrdersView(form);
    static DB db = new DB();

    public static void createOrder(){
        Order orders = new Order(form.getjTextFieldCode(), form.getjTextFieldName(),  Double.parseDouble(form.getjTextFieldPrice()));
        db.createOrder(orders);
        OrdersController.retrieveOrders();
    }

    public static void updateOrder() {

    }

    public static void deleteOrder() {
        int row = ordersView.getjTable1().getSelectedRow();
        Object data = (Object)ordersView.getjTable1().getValueAt(row, 0);
        int index = (int) data;
        if (index > -1) {
            int opcion = javax.swing.JOptionPane.showConfirmDialog(null, "Confirmar eliminacion");
            if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                db.deleteOrder(index);
                OrdersController.retrieveOrders();
            }
        }

    }

    public static void retrieveOrders() {
        ordersView.setVisible(true);
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Id");
        table.addColumn("Código");
        table.addColumn("Nombre");
        table.addColumn("Precio");
        for (Order orders : db.retrieveOrders("")) {
            Object[] row = new Object[10];
            row[0] = orders.getId();
            row[1] = orders.getCode();
            row[2] = orders.getName();
            row[3] = orders.getPrice();
            table.addRow(row);
        }
        ordersView.getjTable1().setModel(table);
    }

}
