package practicacontroldelectura;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClientesController {

    static VentanaClientes ventanaClientes = new VentanaClientes();
    static DB db = new DB();

    public static void showWindow(String apellido) {
        ventanaClientes.setVisible(true);
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Id");
        table.addColumn("Nombre");
        table.addColumn("Apellido");
        table.addColumn("Direccion");
        table.addColumn("Fecha de nacimiento");
        table.addColumn("Telefono");
        table.addColumn("Email");
        if (apellido.equals("") || apellido.isEmpty() || apellido.length() > 200) {
            for (Cliente cliente : db.getClientes()) {
                Object[] row = new Object[7];
                row[0] = cliente.getId();
                row[1] = cliente.getNombre();
                row[2] = cliente.getApellido();
                row[3] = cliente.getDireccion();
                row[4] = cliente.getFecha();
                row[5] = cliente.getTelefono();
                row[6] = cliente.getEmail();
                table.addRow(row);
            }
        } else {
            for (Cliente cliente : db.buscarClientes(apellido)) {
                Object[] row = new Object[7];
                row[0] = cliente.getId();
                row[1] = cliente.getNombre();
                row[2] = cliente.getApellido();
                row[3] = cliente.getDireccion();
                row[4] = cliente.getFecha();
                row[5] = cliente.getTelefono();
                row[6] = cliente.getEmail();
                table.addRow(row);
            }
        }
        ventanaClientes.getjTable1().setModel(table);
    }

    public static void buttonBuscarCliente() {
        String apellido = ventanaClientes.getjTextField1().getText();
        showWindow(apellido);
    }

    public static void buttonCreateCustomer() {
        String name = ventanaClientes.getjTextField2().getText();
        String lastName = ventanaClientes.getjTextField3().getText();
        String email = ventanaClientes.getjTextField4().getText();

        if (name.length() == 0 || lastName.length() == 0 || email.length() == 0) {
            JOptionPane.showMessageDialog(ventanaClientes, "Ocurrió un error al ingresar los datos. Por lo menos debes ingresar nombre, apellido y email");
        } else {
            Cliente customerObj = new Cliente(1, name, lastName, email);
            db.agregar(customerObj);
            showWindow("");
        }
    }
}
