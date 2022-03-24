package com.mjvSchool.biblioteca.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Entidade{
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
    @JoinColumn(name = "id_endereco")
    private List<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contatos")
    private List<Contato> contatos;

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

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
}
