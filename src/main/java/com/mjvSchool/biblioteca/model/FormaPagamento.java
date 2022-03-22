package com.mjvSchool.biblioteca.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_cadastro")
    private List<Pagamentos> pagamentos;

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
