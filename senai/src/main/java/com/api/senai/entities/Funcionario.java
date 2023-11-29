package com.api.senai.entities;

import java.sql.Timestamp;

import com.api.senai.entities.Pessoa;

public class Funcionario extends Pessoa{
    
    private String funcId ;
    private Agencia agencia;
    private String cargo;
    private Timestamp dataExclusao;
    private Boolean ativo;

    public Funcionario(String nome, String cpf, Endereco endereco, Timestamp dataNasc, String telefone, String email,
            Timestamp dataCad, String funcId, Agencia agencia, String cargo, Timestamp dataExclusao, Boolean ativo) {
        super(nome, cpf, endereco, dataNasc, telefone, email, dataCad);
        this.funcId = funcId;
        this.agencia = agencia;
        this.cargo = cargo;
        this.dataExclusao = dataExclusao;
        this.ativo = ativo;
    }
    
    public String getFuncId() {
        return funcId;
    }
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
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
