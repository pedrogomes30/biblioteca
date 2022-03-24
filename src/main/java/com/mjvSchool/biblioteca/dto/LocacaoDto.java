package com.mjvSchool.biblioteca.dto;

import com.mjvSchool.biblioteca.model.LivroAlugado;

import java.sql.Date;
import java.util.List;

public class LocacaoDto {
    private Integer id;
    private Integer clientId;
    private List<LivroAlugado> livros;
    private Double pagamento_id;
    private Double valorTotal;
    private Date dtLocacao;
    private Date dtDevolucao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public List<LivroAlugado> getLivros() {
        return livros;
    }

    public void setLivros(List<LivroAlugado> livros) {
        this.livros = livros;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDtLocacao() {
        return dtLocacao;
    }

    public void setDtLocacao(Date dtLocacao) {
        this.dtLocacao = dtLocacao;
    }

    public Date getDtDevolucao() {
        return dtDevolucao;
    }

    public void setDtDevolucao(Date dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public Double getPagamento_id() {
        return pagamento_id;
    }

    public void setPagamento_id(Double pagamento_id) {
        this.pagamento_id = pagamento_id;
    }
}
