/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ObraSocial extends Entidad {
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;

    public ObraSocial() {
    }

    public ObraSocial(Conexion conexion) {
        super("Obra Social", conexion);
    }

    public ObraSocial(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void agregar() {
        String sql="INSERT INTO obrasocial SET "+
                "codigo='"+codigo+"', "+
                "nombre='"+nombre+"', "+
                "direccion='"+direccion+"', "+
                "telefono='"+telefono+"'";
        try{
            getConexion().getSentencia().execute(sql);
        }
        catch (SQLException e){
            System.out.println("Error al agregar en O.Social");
        }
    }

    @Override
    public void modificar() {
        String sql="UPDATE obrasocial SET "+
                "nombre='"+nombre+"', "+
                "direccion='"+direccion+"', "+
                "telefono='"+telefono+"' " +
                "WHERE codigo='"+codigo+"'";
        try{
            getConexion().getSentencia().executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Error al modificar en O.Social");
        }
    }

    @Override
    public void eliminar() {
        String sql="DELETE FROM obrasocial WHERE codigo='"+codigo+"'";
        try{
            getConexion().getSentencia().executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Error al eliminar en O.Social");
        }
    }

    @Override
    public boolean buscar() {
        String sql="SELECT * FROM obrasocial WHERE codigo='"+codigo+"'";
        try{
            getConexion().getSentencia().executeQuery(sql);
            ResultSet rs = getConexion().getSentencia().getResultSet();
            if(rs.next()){
                setCodigo(rs.getInt("codigo"));
                setNombre(rs.getString("nombre"));
                setDireccion(rs.getString("direccion"));
                setTelefono(rs.getString("telefono"));
                return true;
            }
        }
        catch (SQLException e){
            System.out.println("Error al buscar en O.Social");
        }
        return false;
    }

    @Override
    public ArrayList leer() {
        String sql="SELECT * FROM obrasocial ";
        ArrayList tmp = new ArrayList();
        try{
            getConexion().getSentencia().executeQuery(sql);
            ResultSet rs = getConexion().getSentencia().getResultSet();
            while(rs.next()){
                Object fila[] = new Object[4];
                fila[0] = rs.getInt("codigo");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("direccion");
                fila[3] = rs.getString("telefono");
                tmp.add(fila);
            }
        }
        catch (SQLException e){
            System.out.println("Error al leer en O.Social");
        }
        return tmp;
    }

}
