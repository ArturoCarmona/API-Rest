package com.example.apirest.Models;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class UsuarioModel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id", unique=true, nullable=false)
    private Long id;

    @Column(name="first_name", length = 150)
    private String firstName;
    @Column(name="last_name", length = 150)
    private String lastName;
    @Column(name="age", length = 150)
    private Long age;
    @Column(name="email", length = 150)
    private String email;
    @Column(name="status")
    private Boolean status;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
    public Long getAge() {
        return age;
    }
    public void setAge(Long age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}
