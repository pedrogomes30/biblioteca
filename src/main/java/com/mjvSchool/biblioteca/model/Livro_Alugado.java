package com.mjvSchool.biblioteca.model;

import javax.persistence.*;

@Entity
public class Livro_Alugado {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
//    @ManyToOne
//    private Locacao locacao;
    private Integer quantidade;   
    private Double  valor;
    @ManyToOne
    private Livro livro;


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

//    public Locacao getLocacao() {
//        return locacao;
//    }
//
//    public void setLocacao(Locacao locacao) {
//        this.locacao = locacao;
//    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }


}
