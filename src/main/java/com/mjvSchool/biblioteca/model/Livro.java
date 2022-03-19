package com.mjvSchool.biblioteca.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 20,nullable = false)
    private String nome;
    @Column(length = 20)
    private String edicao;
    @Column(length = 13)
    private Integer isbn;
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "id_preco")
    private List<Preco> precos = new ArrayList<>();

//    @OneToMany(mappedBy = "livro")
//    private List<Estoque> estoque = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public List<Preco> getPrecos() {
        return precos;
    }

    public void setPrecos(List<Preco> precos) {
        this.precos = precos;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //    public List<Estoque> getEstoque() {
//        return estoque;
//    }
//
//    public void setEstoque(List<Estoque> estoque) {
//        this.estoque = estoque;
//    }
}
