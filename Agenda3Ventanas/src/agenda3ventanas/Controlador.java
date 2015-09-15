package agenda3ventanas;
public class Controlador {
    static VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
    static VentanaAltaContacto ventanaAlta = new VentanaAltaContacto();
    static VentanaListadoContactos ventanaListado = new VentanaListadoContactos();
    static VentanaLogIn ventanaLogIn = new VentanaLogIn();
    
    public static void mostrarVentanaPrincipal(){
        ventanaPrincipal.setVisible(true);
        ventanaAlta.setVisible(false);
        ventanaListado.setVisible(false);
        ventanaLogIn.setVisible(false);
        
    }
    public static void mostrarVentanaListado(){
        ventanaPrincipal.setVisible(false);
        ventanaAlta.setVisible(false);
        ventanaListado.setVisible(true);
        ventanaLogIn.setVisible(false);
    }
    public static void mostrarVentanaAlta(){
        ventanaPrincipal.setVisible(false);
        ventanaAlta.setVisible(true);
        ventanaListado.setVisible(false);
        ventanaLogIn.setVisible(false);
    }
    public static void mostrarVentanaLogIn(){
        ventanaPrincipal.setVisible(false);
        ventanaAlta.setVisible(false);
        ventanaListado.setVisible(false);
        ventanaLogIn.setVisible(true);
    }
}
