package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * UTN-FRT ISI
 *
 * @author au6usto
 */
public class DB {

    Connection connection;
    Statement statement;

    public DB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/acme", "root", "");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }

    public void create(ToDo todo) {
        try {
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            String createdAt = dateFormat.format(todo.getCreatedAt());

            String updatedAt = dateFormat.format(todo.getUpdatedAt());

            String sql = "Insert into todos(todo,importance,created_at,updated_at)"
                    + " values ('%todo','%importance','%created_at','%updated_at')";
            sql = sql.replace("%todo", todo.getTodo());
            sql = sql.replace("%importance", todo.getImportance());
            sql = sql.replace("%created_at", createdAt);
            sql = sql.replace("%updated_at", updatedAt);
            //System.out.println(sql);
            statement.execute(sql);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public ArrayList<ToDo> retrieve() {
        ArrayList<ToDo> list = new ArrayList<>();
        try {
            ResultSet res = statement.executeQuery("select * from todos");
            while (res.next()) {
                ToDo todo = new ToDo(
                        res.getInt("id"),
                        res.getString("todo"),
                        res.getString("importance"),
                        res.getDate("created_at"),
                        res.getDate("updated_at")
                );
                list.add(todo);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return list;
    }

    public void update(ToDo todo) {
        try {
            String sql = "update todos"
                    + " set todo = '%todo',"
                    + " importance = '%importance' "
                    + " where id = '%id'";
            sql = sql.replace("%id", "" + todo.getId());
            sql = sql.replace("%todo", todo.getTodo());
            sql = sql.replace("%importance", todo.getImportance());
            //System.out.println(sql);
            statement.execute(sql);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void delete(int id) {
        try {
            String sql = "delete from todos where id = '%id'";
            sql = sql.replace("%id", "" + id);
            //System.out.println(sql);
            statement.execute(sql);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
