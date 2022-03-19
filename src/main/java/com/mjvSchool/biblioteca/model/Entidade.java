package com.mjvSchool.biblioteca.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String documento;
    @ManyToOne
    @JoinColumn(name = "id_entidadeTipo")
    EntidadeTipo entidadeTipo;
    @OneToMany
    @JoinColumn(name = "id_contato")
    Contato contato;
    
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
    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    @Override
    public String toString() {
        return "Entidade [contato=" + contato + ", documento=" + documento + ", entidade=" + entidadeTipo + ", id=" + id
                + ", nome=" + nome + "]";
    }
}
