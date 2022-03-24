package com.mjvSchool.biblioteca.model;


import javax.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Locacao {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private Date dtLocacao;
    private Date dtDevolucao;
    private Double valorTotal;

    @ManyToOne
    private Entidade cliente;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "livro_alugado")
    private List<Livro_Alugado> livro_alugado;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pagamento")
    private List<Pagamentos> pagamentos = new ArrayList<>();



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

    public Date getDtLocacao() {
        return dtLocacao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public Entidade getCliente() {
        return cliente;
    }

    public void setCliente(Entidade cliente) {
        this.cliente = cliente;
    }

    public List<Livro_Alugado> getLivro_alugado() {
        return livro_alugado;
    }

    public void setLivro_alugado(List<Livro_Alugado> livro_alugado) {
        this.livro_alugado = livro_alugado;
    }

    public List<Pagamentos> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamentos> pagamentos) {
        this.pagamentos = pagamentos;
    }
}
