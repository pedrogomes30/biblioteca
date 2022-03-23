package com.mjvSchool.biblioteca.model;


import javax.persistence.*;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String quantidadeLivro;
    @ManyToOne
    private Livro livro;
    @ManyToOne
    private Entidade entidade;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantidadeLivro() {
        return quantidadeLivro;
    }

    public void setQuantidadeLivro(String quantidadeLivro) {
        this.quantidadeLivro = quantidadeLivro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }


    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }
}
