package com.javaguides.springboot.model;


import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;



@Entity
@Table(name = "Employees")
public class Employee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    @Id
    private long id;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Email")
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
