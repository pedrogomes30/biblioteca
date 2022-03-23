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
    @ManyToOne
    private Entidade loja;
    @ManyToOne
    private Entidade cliente;
    @ManyToOne
    private Entidade vendedor;

    
    public Date getDtLocacao() {
        return dtLocacao;
    }
    public Entidade getLoja() {
        return loja;
    }
    public void setLoja(Entidade loja) {
        this.loja = loja;
    }
    public Entidade getCliente(){
        return cliente;
    }
    public void setCliente(Entidade cliente) {
        this.cliente = cliente;
    }
    public Entidade getVendedor() {
        return vendedor;
    }
    public void setVendedor(Entidade vendedor) {
        this.vendedor = vendedor;
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
    
}
