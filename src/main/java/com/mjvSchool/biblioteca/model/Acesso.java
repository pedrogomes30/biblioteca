package com.mjvSchool.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Acesso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_entidade")
    Entidade entidade;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String senha;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Entidade getEntidade() {
        return entidade;
    }
    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String toString() {
        return "Acesso [entidade=" + entidade + ", id=" + id + ", login=" + login + ", senha=" + senha + "]";
    }
}
