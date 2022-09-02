package com.learning.spring.di.pojo;

import java.util.Map;

public class Technologies {
    private String name;

    private Map<String,String> exp;

    public Technologies() {
    }

    public Technologies(String name, Map<String,String> exp) {
        this.name = name;
        this.exp=exp;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getExp() {
        return exp;
    }

    public void setExp(Map<String, String> exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Technologies{" +
                "name='" + name + '\'' +
                ", exp=" + exp +
                '}';
    }
}
