package com.example.java.model;

import java.io.Serializable;

public class Member implements Serializable {
    private int id;
    private String xabar;

    public Member(int id, String xabar){
        this.id = id;
        this.xabar = xabar;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", xabar='" + xabar + '\'' +
                '}';
    }
}
