package controlador;
import javax.swing.table.*;
import modelo.*;
import vista.*;
public class ControladorVideoClub {
   static VentanaSocios ventanaSocios = new VentanaSocios();
   static DB db = new DB();
   public static void mostrarVentanaSocios(){
       ventanaSocios.setVisible(true);
       DefaultTableModel datos = new DefaultTableModel();
       datos.addColumn("Codigo");
       datos.addColumn("Documento");
       datos.addColumn("Nombre");
       for (Socio socio : db.getSocios()){
           Object[] fila = new Object[3];
           fila[0] = socio.getCodigo();
           fila[1] = socio.getDocumento();
           fila[2] = socio.getNombre();
           datos.addRow(fila);
       }
       ventanaSocios.getjTable1().setModel(datos);
   }
   public static void botonAgregarSocio(){
       String documento = 
            ventanaSocios.getjTextField1().getText();
       String nombre = 
            ventanaSocios.getjTextField2().getText();
       Socio socio = new Socio(0,documento,nombre,"");
       db.agregar(socio);
       mostrarVentanaSocios();
   }
}
