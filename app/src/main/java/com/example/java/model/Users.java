package com.example.java.model;

import java.io.Serializable;

public class Users implements Serializable {
    private int age;
    private String name;

    public Users(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
