package com.mjvSchool.biblioteca.model;


import javax.persistence.*;

import java.sql.Date;

@Entity
public class Locacao {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private Date dtLocacao;
    private Date dtDevolucao;
    private Double valorTotal;
//    @OneToMany
//    private Entidade loja;
//    @OneToMany
//    private Entidade cliente;
//    @OneToMany
//    private Entidade Vendedor;

    
    public Date getDtLocacao() {
        return dtLocacao;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Date getDtDevolucao() {
        return dtDevolucao;
    }
    public void setDtDevolucao(Date dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }
    public void setDtLocacao(Date dtLocacao) {
        this.dtLocacao = dtLocacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
