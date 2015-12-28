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
public class Paciente extends Persona {
    private int codigo;
    private ObraSocial obrasocial;

    public Paciente() {
    }

    public Paciente(Conexion conexion) {
        super("Pacientes",conexion);
        obrasocial = new ObraSocial(conexion);
    }

    public Paciente(int dni, String nombre, String domicilio, String telefono, Fecha fechanacimiento, int codigo, ObraSocial obrasocial) {
        super(dni, nombre, domicilio, telefono, fechanacimiento);
        this.codigo = codigo;
        this.obrasocial = obrasocial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ObraSocial getObrasocial() {
        return obrasocial;
    }

    public void setObrasocial(ObraSocial obrasocial) {
        this.obrasocial = obrasocial;
    }

    @Override
    public void agregar() {
        String sql="INSERT INTO paciente SET "+
                "dni='"+getDni()+"', "+
                "codigo='"+getCodigo()+"', "+
                "nombre='"+getNombre()+"', "+
                "domicilio='"+getDomicilio()+"', "+
                "obrasocial='"+getObrasocial().getCodigo()+"', "+
                "fechanacimiento='"+getFechanacimiento().getFecha(true)+"'";
        try{
            getConexion().getSentencia().execute(sql);
        }
        catch (SQLException e){
            System.out.println("Error al agregar en Pacientes");
        }
    }

    @Override
    public void modificar() {
        String sql="UPDATE paciente SET "+
                "nombre='"+getNombre()+"', "+
                "domicilio='"+getDomicilio()+"', "+
                "obrasocial='"+getObrasocial().getCodigo()+"', "+
                "fechanacimiento='"+getFechanacimiento().getFecha(true)+"', "+
                "WHERE dni='"+getDni()+"'";
        try{
            getConexion().getSentencia().executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Error al modificar en pacientes");
        }
    }

    @Override
    public void eliminar() {
        String sql="DELETE FROM paciente WHERE codigo='"+codigo+"'";
        try{
            getConexion().getSentencia().executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Error al eliminar en pacientes ");
        }
    }

    @Override
    public boolean buscar() {
        String sql="SELECT * FROM paciente WHERE dni='"+getDni()+"'";
        try{
            getConexion().getSentencia().executeQuery(sql);
            ResultSet rs = getConexion().getSentencia().getResultSet();
            if(rs.next()){
                setCodigo(rs.getInt("codigo"));
                setNombre(rs.getString("nombre"));
                setDomicilio(rs.getString("domicilio"));
                setFechanacimiento(new Fecha(rs.getString("fechanacimiento"),false));
                getObrasocial().setCodigo(rs.getInt("obrasocial"));
                getObrasocial().buscar();
                return true;
            }
        }
        catch (SQLException e){
            System.out.println("Error al buscar en Paciente");
        }
        return false;
    }

    @Override
    public ArrayList leer() {
        String sql="SELECT * FROM paciente ";
        ArrayList tmp = new ArrayList();
        try{
            getConexion().getSentencia().executeQuery(sql);
            ResultSet rs = getConexion().getSentencia().getResultSet();
            while(rs.next()){
                Object fila[] = new Object[6];
                fila[0] = rs.getInt("dni");
                fila[1] = rs.getInt("codigo");
                fila[2] = rs.getString("nombre");
                fila[3] = rs.getString("domicilio");
                fila[4] = rs.getString("fechanacimiento");
                fila[5] = rs.getInt("obrasocial");
                tmp.add(fila);
            }
        }
        catch (SQLException e){
            System.out.println("Error al leer en paciente");
        }
        return tmp;
    }
    

}
