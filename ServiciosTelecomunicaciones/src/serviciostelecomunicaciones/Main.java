package serviciostelecomunicaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * UTN-FRT ISI
 *
 * @author au6usto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creo Servicios
        Fecha vencimiento = new Fecha(12, 11, 2015);
        Producto producto1 = new Producto(50, 0, vencimiento);
        Producto producto2 = new Producto(150, 1, vencimiento);
        Producto producto3 = new Producto(200, 2, vencimiento);
        Tarjeta tarjeta1 = new Tarjeta(100, 0, vencimiento);
        Tarjeta tarjeta2 = new Tarjeta(200, 1, vencimiento);
        Tarjeta tarjeta3 = new Tarjeta(300, 2, vencimiento);

        ArrayList<Producto> todosServicios;
        todosServicios = new ArrayList<>();
        todosServicios.add(producto1);
        todosServicios.add(producto2);
        todosServicios.add(producto3);
        
        //Servicios de Usuario 1
        ArrayList<Producto> arrayServicios = new ArrayList<>();
        arrayServicios.add(producto1);
        arrayServicios.add(producto2);
        arrayServicios.add(producto3);
        arrayServicios.add(tarjeta1);

        //Servicios de Usuario 2
        ArrayList<Producto> arrayServicios2 = new ArrayList<>();
        arrayServicios2.add(producto1);
        arrayServicios2.add(producto2);
        arrayServicios2.add(tarjeta2);

        //Servicios de Usuario 3
        ArrayList<Producto> arrayServicios3 = new ArrayList<>();
        arrayServicios3.add(tarjeta1);
        arrayServicios3.add(tarjeta2);
        arrayServicios3.add(tarjeta3);
        
        //Creo usuarios
        Abono c1 = new Abono("Augusto", 3213245, "4324234", "25 de Mayo 90", arrayServicios);
        Abono c2 = new Abono("Pequeño", 5435433, "765476456", "25 de Mayo 90", arrayServicios2);
        Prepago c3 = new Prepago("Matías", 3245355, "344353", "25 de Mayo 90", arrayServicios3);

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("----------------------");
        System.out.println("Cantidad de Tarjetas vendidas: " + Tarjeta.getTarjetasVendidas());
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("Total Productos Prepagos: $" + Prepago.getTotalVendido());
        System.out.println("----------------------");
        ranking(clientes, todosServicios);
    }

    public static void ranking(ArrayList<Cliente> clientes, ArrayList<Producto> productos) {
        String[][] ranking = new String[productos.size()][2];

        for (int i = 0; i < productos.size(); i++) {
            ranking[i][0] = productos.get(i).getNombre();
            ranking[i][1] = "0";
        }

        for (Cliente cliente : clientes) {
            for (Producto producto : cliente.productos) {
                for (String[] ranking1 : ranking) {
                    if (producto.getNombre().equals(ranking1[0])) {
                        int counter = Integer.parseInt(ranking1[1]) + 1;
                        ranking1[1] = Integer.toString(counter);
                    }
                }
            }

        }
        
        Arrays.sort(ranking, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String quantity1 = entry1[0];
                final String quantity2 = entry2[0];
                return quantity1.compareTo(quantity2);
            }
        });
        
        System.out.println("Ranking de Productos vendidos");
        System.out.println("----------------------");
        for (String[] ranking1 : ranking) {
            System.out.println(ranking1[0] + " \t\t|\t\t " + ranking1[1]);
        }
        System.out.println("----------------------");
    }

}
