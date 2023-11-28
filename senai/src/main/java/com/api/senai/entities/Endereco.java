package com.api.senai.entities;

public class Endereco {

    private String id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String localidade; // cidade
    private String cep;
    private String uf;
    private String bairro;

    public Endereco(String id, String logradouro, String numero, String complemento, String localidade, String cep,
            String uf, String bairro) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.localidade = localidade;
        this.cep = cep;
        this.uf = uf;
        this.bairro = bairro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getlogradouro() {
        return logradouro;
    }

    public void setlogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    // implementar o via cep aqui

}
