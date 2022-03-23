package com.mjvSchool.biblioteca.dto;

import com.mjvSchool.biblioteca.model.Autor;
import com.mjvSchool.biblioteca.model.Categoria;
import com.mjvSchool.biblioteca.model.Livro;

public class LivroDto {
    private Integer id;
    private String nome;
    private String edicao;
    private Integer isbn;
    private Double preco;
    private Autor autor;
    private Categoria categoria;

    public LivroDto(){}

    public LivroDto(Livro entity){
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.edicao = entity.getEdicao();
        this.isbn = entity.getIsbn();
        this.preco = entity.getPreco();
        this.autor = entity.getAutor();
        this.categoria = entity.getCategoria();
    }

    public LivroDto(Integer id, String nome, String edicao, Integer isbn, Double preco, Autor autor, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.edicao = edicao;
        this.isbn = isbn;
        this.preco = preco;
        this.autor = autor;
        this.categoria = categoria;
    }

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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
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
}
