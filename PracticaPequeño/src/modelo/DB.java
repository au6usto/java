package modelo;

import java.sql.*;
import java.util.ArrayList;

public class DB {

    Connection connection;
    PreparedStatement ps;
    String sql = null;

    //conexion con la DB
    public DB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//hace como import
            connection = DriverManager.getConnection("jdbc:mysql://localhost/acme", "root", "");//le pasa los atributos a connection(ruta,usuario,pass)
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }

    public void crearMedicamento(Medicamento medicamento) {
        try {
            sql = "INSERT INTO medicamentos(nombre,dosis) VALUES (?,?)";
            ps = connection.prepareStatement(sql);//prepara el codigo
            ps.setString(1, medicamento.getNombre());//reemplaza primer signo de pregunta y valida los datos
            ps.setString(2, medicamento.getDosis());//reemplaza segundo signo de pregunta y valida los datos
            ps.executeUpdate();//ejecuta el sql
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public ArrayList<Medicamento> mostrarMedicamentos() {
        ArrayList<Medicamento> list = new ArrayList<>();
        try {
            sql = "SELECT * FROM medicamentos";
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Medicamento medicamento = new Medicamento(rs.getString("nombre"),rs.getString("dosis"));
                list.add(medicamento);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return list;
    }

    public void borrarMedicamento(String nombre) {
        try {            
            sql = "DELETE FROM medicamentos WHERE nombre = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void actualizarMedicamento(Medicamento mnew, Medicamento mold){
        try{
            sql = "UPDATE medicamentos SET nombre = ?, dosis = ? WHERE nombre = ? AND dosis = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, mnew.getNombre());
            ps.setString(2, mnew.getDosis());
            ps.setString(3, mold.getNombre());
            ps.setString(4, mold.getDosis());
            ps.executeUpdate();
        }catch (Exception e) {
            System.err.println(e);
        }        
    }
}