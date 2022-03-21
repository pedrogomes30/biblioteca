package com.mjvSchool.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String quantidadeLivro;
    private Livro livro;
    private Locacao locacao;
    private Entidade entidade;
    
}
