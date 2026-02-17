package com.JPA.myJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "tabula")
public class Tabulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name" , length = 50)
    private String name;

    @Column(name = "email" , length = 50)
    private String email;


    public Tabulation() {}
    public Tabulation(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String tostring(){
        return this.id + "   " + this.name + "   " + this.email;
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setEmail(String s) {
        this.email = s;
    }
    public String toString(){
        return this.id + "   " + this.name + "   " + this.email;
    }
}
