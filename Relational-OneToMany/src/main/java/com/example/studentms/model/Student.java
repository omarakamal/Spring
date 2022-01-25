package com.example.studentms.model;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    private int id;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "bootcamp_id",referencedColumnName="bootcampId")
    private Bootcamp bootcamp;

    public Student(int id, String name, String email, Bootcamp bootcamp) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bootcamp = bootcamp;
    }

    public Student() {
    }

    public Student(int i, String tahir, String s) {
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
