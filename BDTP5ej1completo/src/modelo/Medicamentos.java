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
public class Medicamentos extends Entidad {
    private int codigo;
    private String descripcion;
    private String monodroga;
    private int cantidad;
    private float precio;

    public Medicamentos() {
    }

    public Medicamentos(Conexion conexion) {
        super("Medicamentos",conexion);
    }

    public Medicamentos(int codigo, String descripcion, String monodroga, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monodroga = monodroga;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMonodroga() {
        return monodroga;
    }

    public void setMonodroga(String monodroga) {
        this.monodroga = monodroga;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    @Override
    public void agregar() {
        String sql="INSERT INTO medicamentos SET "+
                "codigo='"+getCodigo()+"', "+
                "descripcion='"+getDescripcion()+"', "+
                "monodroga='"+getMonodroga()+"', "+
                "cantidad='"+getCantidad()+"', "+
                "precio='"+getPrecio()+"' ";
        try{
            getConexion().getSentencia().execute(sql);
        }
        catch (SQLException e){
            System.out.println("Error al agregar en Medicamentos");
        }
    }

    @Override
    public void modificar() {
        String sql="UPDATE medicamentos SET "+
                "descripcion='"+getDescripcion()+"', "+
                "monodroga='"+getMonodroga()+"', "+
                "cantidad='"+getCantidad()+"', "+
                "precio='"+getPrecio()+"' "+
                "WHERE codigo='"+getCodigo()+"'";
        try{
            getConexion().getSentencia().executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Error al modificar en medicamentos");
        }
    }

    @Override
    public void eliminar() {
        String sql="DELETE FROM medicamentos WHERE codigo='"+getCodigo()+"'";
        try{
            getConexion().getSentencia().executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Error al eliminar en medicamentos ");
        }
    }

    @Override
    public boolean buscar() {
        String sql="SELECT * FROM medicamentos WHERE codigo='"+getCodigo()+"'";
        try{
            getConexion().getSentencia().executeQuery(sql);
            ResultSet rs = getConexion().getSentencia().getResultSet();
            if(rs.next()){
                setDescripcion(rs.getString("descripcion"));
                setMonodroga(rs.getString("monodroga"));
                setCantidad(rs.getInt("cantidad"));
                setPrecio(rs.getFloat("precio"));
                return true;
            }
        }
        catch (SQLException e){
            System.out.println("Error al buscar en medicamentos"+e);
        }
        return false;
    }

    @Override
    public ArrayList leer() {
        String sql="SELECT * FROM medicamentos ";
        ArrayList tmp = new ArrayList();
        try{
            getConexion().getSentencia().executeQuery(sql);
            ResultSet rs = getConexion().getSentencia().getResultSet();
            while(rs.next()){
                Object fila[] = new Object[5];
                fila[0] = rs.getInt("codigo");
                fila[1] = rs.getString("descripcion");
                fila[2] = rs.getString("monodrogra");
                fila[3] = rs.getInt("cantidad");
                fila[4] = rs.getFloat("precio");
                tmp.add(fila);
            }
        }
        catch (SQLException e){
            System.out.println("Error al leer en medicamentos");
        }
        return tmp;
    }

    

}
