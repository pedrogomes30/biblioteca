package com.mjvSchool.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
    EntidadeTipo entidadeTipo;


    @JsonIgnore
    @OneToMany(mappedBy = "entidade")
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
    public EntidadeTipo getEntidadeTipo() {
        return entidadeTipo;
    }
    public void setEntidade(EntidadeTipo entidadeTipo) {
        this.entidadeTipo = entidadeTipo;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
