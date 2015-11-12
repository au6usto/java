package practicacontroldelectura;

import java.sql.*;
import java.util.ArrayList;

public class DB {
    Connection conexion;
    Statement statement;
    public DB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(
              "jdbc:mysql://localhost/acme","root","");
            statement = conexion.createStatement();
        } catch(Exception e){ System.err.println(e); }
    }
    public void agregar(Cliente cliente){
        try{
            String sql = "Insert into clientes(nombre, apellido, direccion, fecha_nacimiento, telefono, email)"
            + " values ('%nombre', '%apellido', '%direccion', '%fecha', '%telefono', '%email')";
            sql = sql.replace("%nombre", cliente.getNombre());
            sql = sql.replace("%apellido", cliente.getApellido());
            sql = sql.replace("%direccion", cliente.getDireccion());
            sql = sql.replace("%fecha", cliente.getFecha());
            sql = sql.replace("%telefono", cliente.getTelefono());
            sql = sql.replace("%email", cliente.getEmail());
            System.out.println(sql);
            statement.execute(sql);
        } catch(Exception e){ System.err.println(e); }
    }

    public ArrayList<Cliente> getClientes(){
        ArrayList<Cliente> lista = new ArrayList<>();
        try{
            ResultSet res = 
              statement.executeQuery("select * from clientes");
            while (res.next()){
                Cliente cliente = new Cliente(
                        res.getInt("id"),
                        res.getString("nombre"),
                        res.getString("apellido"),
                        res.getString("direccion"),
                        res.getString("fecha_nacimiento"),
                        res.getString("telefono"),
                        res.getString("email")
                );
                lista.add(cliente);
                System.out.print(cliente.toString());
            }
        } catch(Exception e){ System.err.println(e); }
        return lista;
    }
    
    public ArrayList<Cliente> buscarClientes(String apellido){
        ArrayList<Cliente> lista = new ArrayList<>();
        try{
            ResultSet res = 
              statement.executeQuery("select * from clientes where apellido='" + apellido + "'");
            while (res.next()){
                Cliente cliente = new Cliente(
                        res.getInt("id"),
                        res.getString("nombre"),
                        res.getString("apellido"),
                        res.getString("direccion"),
                        res.getString("fecha_nacimiento"),
                        res.getString("telefono"),
                        res.getString("email")
                );
                lista.add(cliente);
            }
        } catch(Exception e){ System.err.println(e); }
        return lista;
    }
}
