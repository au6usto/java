CREATE TABLE customers (
	id int auto_increment primary key,
	name varchar(200),
	lastName varchar(200),
	address varchar(200),
	birthday date,
	phoneNumber varchar(200),
	email varchar (200)
	);

INSERT INTO customers(name, lastName, address, birthday, phoneNumber, email)
VALUES('Juan', 'Perez', '742 Evergreen Terrace', '1989-8-2', '55878787', 'jperez@gmail.com');

INSERT INTO customers(name, lastName, address, birthday, phoneNumber, email)
VALUES('Pedro', 'Perez', '742 Evergreen Terrace', '1979-8-2', '22878787', 'pperez@gmail.com');

INSERT INTO customers(name, lastName, address, birthday, phoneNumber, email)
VALUES('Luis', 'Gonzalez', '742 Evergreen Terrace', '1969-8-2', '33878787', 'lgonzalez@gmail.com');

SELECT * FROM customers WHERE lastName = 'Perez';

UPDATE customers SET email = 'luis@gonzalez.com' WHERE id = 3;

DELETE FROM customers WHERE id = 1;

-----------------------------------------------------------
import java.sql.*;

public class PracticaControlDeLectura {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acme","root","");
			Statement command = con.createStatement();
			ResultSet res = command.executeQuery("select * from customers");
			while(res.next()){
				System.out.print("Name: " + res.getString("name") + "\t");
				System.out.print("LastName: " + res.getString("lastName") + "\t");
				System.out.print("Dirección: " + res.getString("address") + "\t");
				System.out.print("Birthday de Nacimiento: " + res.getString("birthday") + "\t");
				System.out.print("Teléfono: " + res.getString("phoneNumber") + "\t");
				System.out.println("Email: " + res.getString("email"));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
-----------------------------------------------------------
public class Customer {
	private int id;
	private String name;
	private String lastName;
	private String address;
	private String birthday;
	private String phoneNumber;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(int id, String name, String lastName, String address, String birthday, String phoneNumber, String email) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Customer(int id, String name, String lastName, String email) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.address = "no";
		this.birthday = "1900-1-1";
		this.phoneNumber = "no";
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", address=" + address + ", birthday=" + birthday + ", phoneNumber=" + phoneNumber + ", email=" + email + "}\n";
	}
}

import java.sql.*;
import java.util.ArrayList;

public class DB {
	Connection connection;
	Statement statement;
	public DB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/acme","root","");
			statement = connection.createStatement();
		} catch(Exception e){ System.err.println(e); }
	}

	public void add(Customer customer){
		try{
			String sql = "INSERT INTO customers(name, lastName, address, birthday, phoneNumber, email)"
			+ " VALUES ('%name', '%lastName', '%address', '%birthday', '%phoneNumber', '%email')";
			sql = sql.replace("%name", customer.getName());
			sql = sql.replace("%lastName", customer.getLastName());
			sql = sql.replace("%address", customer.getAddress());
			sql = sql.replace("%birthday", customer.getBirthday());
			sql = sql.replace("%phoneNumber", customer.getPhoneNumber());
			sql = sql.replace("%email", customer.getEmail());
			statement.execute(sql);
		} catch(Exception e){ System.err.println(e); }
	}

	public ArrayList<Customer> getCustomers(){
		ArrayList<Customer> al = new ArrayList<>();
		try{
			ResultSet res = statement.executeQuery("SELECT * FROM customers");
			while (res.next()){
				Customer customer = new Customer(
					res.getInt("id"),
					res.getString("name"),
					res.getString("lastName"),
					res.getString("address"),
					res.getString("birthday"),
					res.getString("phoneNumber"),
					res.getString("email")
					);
				al.add(customer);
				System.out.print(customer.toString());
			}
		} catch(Exception e){ System.err.println(e); }
		return al;
	}
}

public class Main {
	public static void main(String[] args) {
		Customer c1 = new Customer(4, "Roberto", "Dominguez", "25 de Mayo 90", "1959-3-3", "2329412", "rdominguez@gmail.com");
		DB db = new DB();
		db.add(c1);
		db.getCustomers();
	}
}

--------------------------------------------------------------------------

import java.sql.*;
import java.util.ArrayList;

public class DB {
	Connection connection;
	PreparedStatement statement;
	public DB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/acme","root","");
			statement = connection.createStatement();
		} catch(Exception e){ System.err.println(e); }
	}
	public void agregar(Customer customer){
		try{
			String sql = "INSERT INTO customers(name, lastName, address, birthday, phoneNumber, email)"
			+ " VALUES ('%name', '%lastName', '%address', '%fecha', '%phoneNumber', '%email')";
			sql = sql.replace("%name", customer.getName());
			sql = sql.replace("%lastName", customer.getLastName());
			sql = sql.replace("%address", customer.getAddress());
			sql = sql.replace("%fecha", customer.getBirthday());
			sql = sql.replace("%phoneNumber", customer.getPhoneNumber());
			sql = sql.replace("%email", customer.getEmail());
            // System.out.println(sql);
			statement.execute(sql);
		} catch(Exception e){ System.err.println(e); }
	}

	public ArrayList<Customer> getCustomers(String lastName){
		ArrayList<Customer> al = new ArrayList<>();
		try{
			if (lastName.equals("") || lastName.isEmpty() ||  apellido.length() > 200) {
				ResultSet res = statement.executeQuery("SELECT * FROM customers");
			} else {
				ResultSet res = statement.executeQuery("SELECT * FROM customers WHERE lastName='" + lastName + "'");
			}
			while (res.next()){
				Customer customer = new Customer(
					res.getInt("id"),
					res.getString("name"),
					res.getString("lastName"),
					res.getString("address"),
					res.getString("birthday"),
					res.getString("phoneNumber"),
					res.getString("email")
					);
				al.add(customer);
                // System.out.print(customer.toString());
			}
		} catch(Exception e){ System.err.println(e); }
		return al;
	}
}


import javax.swing.table.DefaultTableModel;

public class CustomersController {

	static CustomersView customersView = new CustomersView();
	static DB db = new DB();

	public static void showWindow(String lastName) {
		customersView.setVisible(true);
		DefaultTableModel table = new DefaultTableModel();
		table.addColumn("Id");
		table.addColumn("Nombre");
		table.addColumn("Apellido");
		table.addColumn("Dirección");
		table.addColumn("Fecha de Nacimiento");
		table.addColumn("Teléfono");
		table.addColumn("Email");
		if (lastName.equals("")) {
			for (Customer customer : db.getCustomers("")) {
				Object[] row = new Object[7];
				row[0] = customer.getId();
				row[1] = customer.getName();
				row[2] = customer.getLastName();
				row[3] = customer.getAddress();
				row[4] = customer.getBirthday();
				row[5] = customer.getPhoneNumber();
				row[6] = customer.getEmail();
				table.addRow(row);
			}
		} else {
			for (Customer customer : db.getCustomers(lastName)) {
				Object[] row = new Object[7];
				row[0] = customer.getId();
				row[1] = customer.getName();
				row[2] = customer.getLastName();
				row[3] = customer.getAddress();
				row[4] = customer.getBirthday();
				row[5] = customer.getPhoneNumber();
				row[6] = customer.getEmail();
				table.addRow(row);
			}
		}
		customersView.getjTable1().setModel(table);
	}

	public static void buttonSearchCustomer() {
		String lastName = customersView.getjTextField1().getText();
		showWindow(lastName);
	}
}

------------------------------------------------------

public static void buttonCreateCustomer() {
	String name = customersView.getjTextField2().getText();
	String lastName = customersView.getjTextField3().getText();
	String email = customersView.getjTextField4().getText();

	if (name.length() == 0 || lastName.length() == 0 || email.length() == 0) {
		JOptionPane.showMessageDialog(customersView, "Ocurrió un error al ingresar los datos. Por lo menos debes ingresar nombre, apellido y email");
	} else {
		Customer customerObj = new Customer(1, name, lastName, email);
		db.add(customerObj);
		showWindow("");
	}
}