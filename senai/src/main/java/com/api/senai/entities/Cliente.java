package com.api.senai.entities;

import java.sql.Timestamp;

import com.api.senai.entities.Pessoa;

public class Cliente extends Pessoa{
    
    private Conta conta;
    private String clienteId;
    private Timestamp dataExclusao;
    private  Boolean ativo;
    
    public Cliente(String nome, String cpf, Endereco endereco, Timestamp dataNasc, String telefone, String email,
            Timestamp dataCad, Conta conta, String clienteId, Timestamp dataExclusao, Boolean ativo) {
        super(nome, cpf, endereco, dataNasc, telefone, email, dataCad);
        this.conta = conta;
        this.clienteId = clienteId;
        this.dataExclusao = dataExclusao;
        this.ativo = ativo;
    }
    
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public String getClienteId() {
        return clienteId;
    }
    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }
    public Timestamp getDataExclusao() {
        return dataExclusao;
    }
    public void setDataExclusao(Timestamp dataExclusao) {
        this.dataExclusao = dataExclusao;
    }
    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    
}
