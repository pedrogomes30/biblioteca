package com.mjvSchool.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = true)
    private String email;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = true)
    private String telefoneTipo;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefoneTipo() {
        return telefoneTipo;
    }
    public void setTelefoneTipo(String telefoneTipo) {
        this.telefoneTipo = telefoneTipo;
    }
    @Override
    public String toString() {
        return "Contato [email=" + email + ", id=" + id + ", telefone=" + telefone + ", telefoneTipo=" + telefoneTipo
                + "]";
    }
}
