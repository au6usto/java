package modelo;
import java.util.ArrayList;
import java.sql.*;
public class DB {
    Connection conexion;
    Statement statement;
    public DB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(
              "jdbc:mysql://localhost/videoclub","root","");
            statement = conexion.createStatement();
        } catch(Exception e){ System.err.println(e); }
    }
    public void agregar(Socio socio){
        try{
            String sql = "Insert into socios(documento,nombre)"
            + " values ('%documento','%nombre')";
            sql = sql.replace("%nombre", socio.getNombre());
            sql = sql.replace("%documento",socio.getDocumento());
            System.out.println(sql);
            statement.execute(sql);
        } catch(Exception e){ System.err.println(e); }
    }
    public void eliminar(int codigo){
        try{
            String sql = 
               "delete from socios where codigo = '%codigo'";
            sql = sql.replace("%codigo",""+codigo);
            System.out.println(sql);
            statement.execute(sql);
        } catch(Exception e){ System.err.println(e); }
    }
    public void modificar(Socio socio){
        try{
            String sql = "update socios"
            + " set documento = '%documento',"
            + " nombre = '%nombre' "
            + " where codigo = '%codigo'";        
            sql = sql.replace("%nombre", socio.getNombre());
            sql = sql.replace("%documento",socio.getDocumento());
            sql = sql.replace("%codigo",""+socio.getCodigo()); 
            System.out.println(sql);
            statement.execute(sql);
        } catch(Exception e){ System.err.println(e); }
    }
    public ArrayList<Socio> getSocios(){
        ArrayList<Socio> lista = new ArrayList<Socio>();
        try{
            ResultSet res = 
              statement.executeQuery("select * from socios");
            while (res.next()){
                Socio socio = new Socio(
                        res.getInt("codigo"),
                        res.getString("documento"),
                        res.getString("nombre"),
                        res.getString("domicilio")
                );
                lista.add(socio);
            }
        } catch(Exception e){ System.err.println(e); }
        return lista;
    }    
}
