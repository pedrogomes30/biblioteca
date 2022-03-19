package com.mjvSchool.biblioteca.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = true)
    private String logradouro;
    @Column(nullable = true)
    private String bairro;
    @Column(nullable = false)
    private String cep;
    @Column(nullable = true)
    private int cidade;
    @ManyToOne
    @JoinColumn(name = "id_entidade")
    Entidade entidade;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public int getCidade() {
        return cidade;
    }
    public void setCidade(int cidade) {
        this.cidade = cidade;
    }
    public Entidade getEntidade() {
        return entidade;
    }
    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }
    @Override
    public String toString() {
        return "Endereco [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", entidade=" + entidade + ", id="
                + id + ", logradouro=" + logradouro + "]";
    } 
}
