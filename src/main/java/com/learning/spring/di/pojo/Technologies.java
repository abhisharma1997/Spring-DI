package com.learning.spring.di.pojo;

public class Technologies {
    private String name;

    public Technologies() {
    }

    public Technologies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Technologies{" +
                "name='" + name + '\'' +
                '}';
    }
}
