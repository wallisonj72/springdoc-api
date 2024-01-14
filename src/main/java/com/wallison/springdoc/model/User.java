package com.wallison.springdoc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb-user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String job;
    private int age;

    public User() {}

    public User(Long id, String name, String job, int age) {
        this.id = id;
        this.name = name;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}