package com.mjvSchool.biblioteca.model;

import javax.persistence.*;

@Entity
public class LivroAlugado {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private Integer quantidade;   
    private Double  valor;

    @Column(name = "id_livro")
    private Integer livro;


    public Integer getId(){
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLivro() {
        return livro;
    }

    public void setLivro(Integer livro) {
        this.livro = livro;
    }
}
