package com.api.senai.entities;

public class Agencia {
    
    private String agenciaId;
    private Endereco endereco;

    public Agencia(String agenciaId, Endereco endereco) {
        this.agenciaId = agenciaId;
        this.endereco = endereco;
    }
    
    public String getAgenciaId() {
        return agenciaId;
    }
    public void setAgenciaId(String agenciaId) {
        this.agenciaId = agenciaId;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
