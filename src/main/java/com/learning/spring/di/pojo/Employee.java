package com.learning.spring.di.pojo;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private List<Technologies> tech;

    public Employee() {
    }

    public Employee(int id, String name, List<Technologies> tech) {
        this.id = id;
        this.name = name;
        this.tech = tech;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech=" + tech +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Technologies> getTech() {
        return tech;
    }

    public void setTech(List<Technologies> tech) {
        this.tech = tech;
    }
}
