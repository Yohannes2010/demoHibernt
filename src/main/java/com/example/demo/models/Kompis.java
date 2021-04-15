package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Kompis {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;
    private String telefonnummer;

    public Kompis(){}

    public Kompis(long id, String name, String email,String telefonnummer) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telefonnummer=telefonnummer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString() {
        return String.format("Kompis[id=%d, name='%s', email='%s', telefonnummer='%s']",
        id, name, email, telefonnummer);
    }
}
