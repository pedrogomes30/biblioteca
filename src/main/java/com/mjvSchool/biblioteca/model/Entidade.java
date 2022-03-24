package com.mjvSchool.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String documento;
    @Column(nullable = true)
    private String email;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private EntidadeTipo entidadeTipo;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "contato")
    private List<Contato> contatos = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EntidadeTipo getEntidadeTipo() {
        return entidadeTipo;
    }

    public void setEntidadeTipo(EntidadeTipo entidadeTipo) {
        this.entidadeTipo = entidadeTipo;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
}
