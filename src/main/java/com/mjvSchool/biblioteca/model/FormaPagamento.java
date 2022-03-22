package com.mjvSchool.biblioteca.model;


import javax.persistence.*;

@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    @OneToMany
    @JoinColumn(name = "id_formapagamento")
    private Pagamentos pagamentos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
