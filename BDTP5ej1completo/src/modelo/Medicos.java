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
public class Medicos extends Persona {
    private int matricula;
    private String especialidad;

    public Medicos() {
    }

    public Medicos(Conexion conexion) {
        super("Medicos",conexion);
    }

    public Medicos(int matricula, String especialidad) {
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void agregar() {
        String sql="INSERT INTO medicos SET "+
                "dni='"+getDni()+"', "+
                "matricula='"+getMatricula()+"', "+
                "nombre='"+getNombre()+"', "+
                "domicilio='"+getDomicilio()+"', "+
                "especialidad='"+getEspecialidad()+"', "+
                "telefono='"+getTelefono()+"'";
        try{
            getConexion().getSentencia().execute(sql);
        }
        catch (SQLException e){
            System.out.println("Error al agregar en Medicos");
        }
    }

    @Override
    public void modificar() {
        String sql="UPDATE medicos SET "+
                "matricula='"+getMatricula()+"', "+
                "nombre='"+getNombre()+"', "+
                "domicilio='"+getDomicilio()+"', "+
                "especialidad='"+getEspecialidad()+"', "+
                "telefono='"+getTelefono()+"' "+
                "WHERE dni='"+getDni()+"'";
        try{
            getConexion().getSentencia().executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Error al modificar en medicos");
        }
    }

    @Override
    public void eliminar() {
        String sql="DELETE FROM medicos WHERE dni='"+getDni()+"'";
        try{
            getConexion().getSentencia().executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Error al eliminar en medicos ");
        }
    }

    @Override
    public boolean buscar() {
        String sql="SELECT * FROM medicos WHERE dni='"+getDni()+"'";
        try{
            getConexion().getSentencia().executeQuery(sql);
            ResultSet rs = getConexion().getSentencia().getResultSet();
            if(rs.next()){
                setMatricula(rs.getInt("matricula"));
                setNombre(rs.getString("nombre"));
                setDomicilio(rs.getString("domicilio"));
                setTelefono(rs.getString("telefono"));
                setEspecialidad(rs.getString("especialidad"));
                return true;
            }
        }
        catch (SQLException e){
            System.out.println("Error al buscar en medicos");
        }
        return false;
    }

    @Override
    public ArrayList leer() {
        String sql="SELECT * FROM medicos ";
        ArrayList tmp = new ArrayList();
        try{
            getConexion().getSentencia().executeQuery(sql);
            ResultSet rs = getConexion().getSentencia().getResultSet();
            while(rs.next()){
                Object fila[] = new Object[6];
                fila[0] = rs.getInt("dni");
                fila[1] = rs.getInt("matricula");
                fila[2] = rs.getString("nombre");
                fila[3] = rs.getString("domicilio");
                fila[4] = rs.getString("especialidad");
                fila[5] = rs.getString("telefono");
                tmp.add(fila);
            }
        }
        catch (SQLException e){
            System.out.println("Error al leer en medicos");
        }
        return tmp;
    }

}
