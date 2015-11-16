package model;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * UTN-FRT ISI
 *
 * @author au6usto
 */
public class DB {

    Connection connection;
    PreparedStatement ps;
    String sql = null;

    public DB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/acme", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }

    public void createStudent(Student student) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String birthday = dateFormat.format(student.getBirthday());
            String createdAt = dateTimeFormat.format(student.getCreatedAt());
            String updatedAt = dateTimeFormat.format(student.getUpdatedAt());
            
            sql = "INSERT INTO students(dni,docket,name,lastName,phoneNumber,address,email,birthday,createdAt,updatedAt) VALUES (?,?,?,?,?,?,?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, student.getDni());
            ps.setString(2, student.getDocket());
            ps.setString(3, student.getName());
            ps.setString(4, student.getLastName());
            ps.setString(5, student.getPhoneNumber());
            ps.setString(6, student.getAddress());
            ps.setString(7, student.getEmail());
            ps.setString(8, birthday);
            ps.setString(9, createdAt);
            ps.setString(10, updatedAt);
            System.out.println(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public ArrayList<Student> retrieveStudents(String searchString) {
        ArrayList<Student> list = new ArrayList<>();
        try {
            if (searchString.length() > 1) {
                sql = "SELECT * FROM students WHERE lastName=? OR name=? OR dni=? OR docket=? OR email=?";
                ps = connection.prepareStatement(sql);
                ps.setString(1, searchString);
                ps.setString(2, searchString);
                ps.setString(3, searchString);
                ps.setString(4, searchString);
                ps.setString(5, searchString);

            } else {
                sql = "SELECT * FROM students";
                ps = connection.prepareStatement(sql);
            }
            System.out.println(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student(
                        rs.getInt("id"),
                        rs.getString("dni"),
                        rs.getString("docket"),
                        rs.getString("name"),
                        rs.getString("lastName"),
                        rs.getString("phoneNumber"),
                        rs.getString("address"),
                        rs.getString("email"),
                        rs.getDate("birthday"),
                        rs.getDate("createdAt"),
                        rs.getDate("updatedAt")
                );
                list.add(student);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return list;
    }

    public void updateStudent(Student student) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String birthday = dateFormat.format(student.getBirthday());
            String updatedAt = dateTimeFormat.format(student.getUpdatedAt());
            
            sql = "UPDATE students SET dni = ?, docket = ?, name = ?, lastName = ?, "
                    + "phoneNumber = ?, address = ?, email = ?, birthday = ?, "
                    + "updatedAt = ? WHERE id = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, student.getDni());
            ps.setString(2, student.getDocket());
            ps.setString(3, student.getName());
            ps.setString(4, student.getLastName());
            ps.setString(5, student.getPhoneNumber());
            ps.setString(6, student.getAddress());
            ps.setString(7, student.getEmail());
            ps.setString(8, birthday);
            ps.setString(9, updatedAt);
            ps.setInt(11, student.getId());
            
            System.out.println(sql);
            ps.execute(sql);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void deleteStudent(int id) {
        try {
            sql = "DELETE FROM students WHERE id = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            System.out.println(sql);
            ps.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
