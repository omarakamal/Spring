package com.example.studentms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Bootcamp {
@Id
    @Column(name = "bootcampId")
    private int bootcampId;
    private String location;

    @OneToMany(mappedBy = "bootcamp")
    @JsonIgnore
    private List<Student> items = new ArrayList<>();

    public Bootcamp() {
    }

    public Bootcamp(int bootcampId, String location) {
        this.bootcampId = bootcampId;
        this.location = location;
    }

    public List<Student> getItems() {
        return items;
    }

    public void setItems(List<Student> items) {
        this.items = items;
    }

    public int getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(int bootcampId) {
        this.bootcampId = bootcampId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}