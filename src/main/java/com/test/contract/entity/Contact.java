package com.test.contract.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Contact implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String email;

    @Column
    private String age;

    public Contact() {
    }

    public Contact(String name, String phone, String email, String age) {


        try {
            Integer.parseInt(age);
        } catch (NumberFormatException e) {
            age = null;
        }
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
