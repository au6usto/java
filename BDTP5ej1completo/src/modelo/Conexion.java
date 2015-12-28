/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author usuario
 */
public class Conexion {
    private String servidor="localhost";
    private String usuario="root";
    private String clave="";
    private String basedato="paradigmas";
    private Connection conexion;
    private Statement sentencia;

    public Conexion() {
    }

    public Conexion(String servidor, String usuario, String clave, String basedato) {
        this.servidor = servidor;
        this.usuario = usuario;
        this.clave = clave;
        this.basedato = basedato;
    }

    public int conectar() throws SQLException, ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+servidor+"/"+basedato;
            conexion = DriverManager.getConnection(url, usuario, clave);
            sentencia = conexion.createStatement();
            return 1;
        }
        catch(SQLException e){
            System.out.println("Error no se puede conectar a la base de datos");
            return -1;
        }
        catch(ClassNotFoundException e){
            System.out.println("Error no se encuentra el Driver");
            return -2;
        }
    }
    public String getBasedato() {
        return basedato;
    }

    public void setBasedato(String basedato) {
        this.basedato = basedato;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Statement getSentencia() {
        return sentencia;
    }

    public void setSentencia(Statement sentencia) {
        this.sentencia = sentencia;
    }
    
}
