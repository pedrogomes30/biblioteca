package com.mjvSchool.biblioteca.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Preco {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Double valor;

    @ManyToOne
    private Livro livro;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private TabelaPreco tabelaPreco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public TabelaPreco getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(TabelaPreco tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }
}
