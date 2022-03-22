package com.mjvSchool.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.sql.Date;

@Entity
public class Locacao {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private Date dtLocacao;
    private Date dtDevolucao;
    
}
