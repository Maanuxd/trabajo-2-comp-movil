package com.example.trabajo2_comp_movil.models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {
    public String name;
    public String email;
    public String password;
    public String role;

    public User(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
