package com.example.demo.model;

import java.util.UUID;

public class User {

    private String name;
    private int age;
    private String mail;
    private UUID id;

    public User(String name,int age,String mail){
        this.id= UUID.randomUUID();
        this.name = name;
        this.age =age;
        this.mail=mail;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}