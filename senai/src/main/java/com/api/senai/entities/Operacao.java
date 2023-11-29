package com.api.senai.entities;

import java.sql.Timestamp;

public class Operacao {
    
    private String OperacaoId;
    private String TipoOperacao;
    private String contaOrigem;
    private String contaDestino;
    private String valor;
    private Timestamp data;
    
    public Operacao(String operacaoId, String tipoOperacao, String contaOrigem, String contaDestino, String valor,
            Timestamp data) {
        OperacaoId = operacaoId;
        TipoOperacao = tipoOperacao;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.data = data;
    }
    
    public String getOperacaoId() {
        return OperacaoId;
    }
    public void setOperacaoId(String operacaoId) {
        OperacaoId = operacaoId;
    }
    public String getTipoOperacao() {
        return TipoOperacao;
    }
    public void setTipoOperacao(String tipoOperacao) {
        TipoOperacao = tipoOperacao;
    }
    public String getContaOrigem() {
        return contaOrigem;
    }
    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }
    public String getContaDestino() {
        return contaDestino;
    }
    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Timestamp getData() {
        return data;
    }
    public void setData(Timestamp data) {
        this.data = data;
    }

    
}
