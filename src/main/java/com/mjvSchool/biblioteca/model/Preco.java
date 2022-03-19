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
    @JoinColumn(name = "id_livro")
    private Livro livros;
    @ManyToOne
    @JoinColumn(name = "id_tabelapreco")
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

    public Livro getLivros() {
        return livros;
    }

    public void setLivros(Livro livros) {
        this.livros = livros;
    }

    public TabelaPreco getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(TabelaPreco tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }
}
