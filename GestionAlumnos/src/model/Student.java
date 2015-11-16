
package model;

import java.util.Date;

/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class Student {
    private int id;
    private String dni;
    private String docket;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String email;
    private Date birthday;
    private Date createdAt;
    private Date updatedAt;

    public Student(int id, String dni, String docket, String name, String lastName, String phoneNumber, String address, String email, Date birthday, Date createdAt, Date updatedAt) {
        this.id = id;
        this.dni = dni;
        this.docket = docket;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.birthday = birthday;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public Student(String dni, String docket, String name, String lastName, String phoneNumber, String address, String email, Date birthday) {
        this.id = 1;
        this.dni = dni;
        this.docket = docket;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.birthday = birthday;
        this.createdAt =  new Date();
        this.updatedAt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDocket() {
        return docket;
    }

    public void setDocket(String docket) {
        this.docket = docket;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", dni=" + dni + ", docket=" + docket + ", name=" + name + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", address=" + address + ", email=" + email + ", birthday=" + birthday + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
}
