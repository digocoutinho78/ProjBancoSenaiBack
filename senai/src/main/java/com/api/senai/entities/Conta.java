package com.api.senai.entities;

import java.sql.Timestamp;

public class Conta {
     
    private String conta;
    private Agencia agenciaId;
    private String tipo;
    private String saldo;
    private Timestamp dataAbertura;
    private Timestamp dataEncerr;

    
    public Conta(String conta, Agencia agenciaId, String tipo, String saldo, Timestamp dataAbertura,
            Timestamp dataEncerr) {
        this.conta = conta;
        this.agenciaId = agenciaId;
        this.tipo = tipo;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.dataEncerr = dataEncerr;
    }
    
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public Agencia getAgenciaId() {
        return agenciaId;
    }
    public void setAgenciaId(Agencia agenciaId) {
        this.agenciaId = agenciaId;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getSaldo() {
        return saldo;
    }
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    public Timestamp getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(Timestamp dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public Timestamp getDataEncerr() {
        return dataEncerr;
    }
    public void setDataEncerr(Timestamp dataEncerr) {
        this.dataEncerr = dataEncerr;
    }

    
}
