package videoclubmvc;
import modelo.*;
import controlador.*;

public class Principal {

    public static void main(String[] args) {
        //DB db = new DB();
        //db.agregar(new Socio(0,"123","jose","casa"));
        //db.eliminar(1);
        //db.modificar(new Socio(2,"333","Superman","Crip"));
        //System.out.println(db.getSocios());
        ControladorVideoClub.mostrarVentanaSocios();   
    }   
}
