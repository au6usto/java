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
public class OrdenMedica extends Entidad {
    private int nroorden;
    private Fecha fecha;
    private Paciente paciente;
    private Medicos medico;
    private ArrayList<Medicamentos> medicamentos = new ArrayList<Medicamentos>();

    public OrdenMedica() {
    }

    public OrdenMedica(Conexion conexion){
        super("ordenmedica", conexion);
        paciente = new Paciente(conexion);
        medico = new Medicos(conexion);
    }
    
    public OrdenMedica(int nroorden, Fecha fecha, Paciente paciente, Medicos medico) {
        this.nroorden = nroorden;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
    }

    public void addMedicamento(Medicamentos medicamento){
        medicamentos.add(medicamento);
    }
    
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Medicamentos> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamentos> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public int getNroorden() {
        return nroorden;
    }

    public void setNroorden(int nroorden) {
        this.nroorden = nroorden;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public void agregar() {
        fecha = new Fecha();
        String sql="INSERT INTO ordenmedica SET "+
                "nroorden='"+nroorden+"', "+
                "paciente='"+paciente.getDni()+"', "+
                "obrasocial='"+paciente.getObrasocial().getCodigo()+"', "+
                "medico='"+medico.getMatricula()+"', "+
                "fecha='"+fecha.getFecha(true)+"'";
        try{
            getConexion().getSentencia().execute(sql);
        }
        catch (SQLException e){
            System.out.println("Error al agregar en ordenmedica");
        }
        for(int i=0;i< medicamentos.size();i++){
        String sql2 = "";
            Medicamentos tmp = medicamentos.get(i);
            sql2 += "INSERT INTO ordendetalle SET "+
                    "nroorden='"+nroorden+"', "+
                    "codigo='"+tmp.getCodigo()+"', "+
                    "cantidad='"+tmp.getCantidad()+"', "+
                    "precio='"+tmp.getPrecio()+"'  ";
        try{
            getConexion().getSentencia().execute(sql2);
        }
        catch (SQLException e){
            System.out.println("Error al agregar en detalle orden");
        }
        }
    }

    @Override
    public void modificar() {
        String sql="UPDATE ordenmedica SET "+
                "paciente='"+paciente.getDni()+"', "+
                "obrasocial='"+paciente.getObrasocial().getCodigo()+"', "+
                "medico='"+medico.getMatricula()+"', "+
                "fecha='"+fecha.getFecha(true)+"' "+
                "WHERE nroorden='"+nroorden+"'";
        try{
            getConexion().getSentencia().executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Error al modificar en orden medica");
        }
    }

    @Override
    public void eliminar() {
        String sql="DELETE FROM ordenmedica WHERE nroorden='"+nroorden+"'";
        try{
            getConexion().getSentencia().executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Error al eliminar en orden medica");
        }
    }

    @Override
    public boolean buscar() {
        String sql="SELECT * FROM ordenmedica WHERE nroorden='"+nroorden+"'";
        try{
            getConexion().getSentencia().executeQuery(sql);
            ResultSet rs = getConexion().getSentencia().getResultSet();
            if(rs.next()){
                setNroorden(rs.getInt("nroorden"));
                paciente.setCodigo(rs.getInt("paciente")) ;
                paciente.buscar();
                paciente.getObrasocial().setCodigo(rs.getInt("obrasocial"));
                paciente.getObrasocial().buscar();
                medico.setMatricula(rs.getInt("medico"));
                medico.buscar();
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
        String sql="SELECT * FROM ordenmedica ";
        ArrayList tmp = new ArrayList();
        try{
            getConexion().getSentencia().executeQuery(sql);
            ResultSet rs = getConexion().getSentencia().getResultSet();
            while(rs.next()){
                Object fila[] = new Object[5];
                fila[0] = rs.getInt("nroorden");
                fila[1] = rs.getInt("paciente");
                fila[2] = rs.getInt("obrasocial");
                fila[3] = rs.getInt("medico");
                fila[4] = rs.getDate("fecha");
                tmp.add(fila);
            }
        }
        catch (SQLException e){
            System.out.println("Error al leer en Orden medica");
        }
        return tmp;
    }

}
