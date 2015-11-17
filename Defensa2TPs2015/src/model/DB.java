package model;

import java.sql.*;
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

    public void createOrder(Order order) {
        try {
            sql = "INSERT INTO orders(code,name,price) VALUES (?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, order.getCode());
            ps.setString(2, order.getName());
            ps.setString(3, Double.toString(order.getPrice()));
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public ArrayList<Order> retrieveOrders(String searchString) {
        ArrayList<Order> list = new ArrayList<>();
        try {

            sql = "SELECT * FROM orders";
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Order order = new Order(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name"),
                        rs.getDouble("price")
                );
                list.add(order);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return list;
    }

    public void deleteOrder(int id) {
        try {
            
            sql = "DELETE FROM `orders` WHERE id = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
