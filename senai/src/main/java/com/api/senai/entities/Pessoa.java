package com.api.senai.entities;

import java.sql.Timestamp;

public class Pessoa {
    
private String nome; 
private String cpf;
private Endereco endereco;
private Timestamp dataNasc;
private String telefone;
private String email;
private Timestamp dataCad;



public Pessoa(String nome, String cpf, Endereco endereco, Timestamp dataNasc, String telefone, String email,
        Timestamp dataCad) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.dataNasc = dataNasc;
    this.telefone = telefone;
    this.email = email;
    this.dataCad = dataCad;
}

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}
public Endereco getEndereco() {
    return endereco;
}
public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
}
public Timestamp getDataNasc() {
    return dataNasc;
}
public void setDataNasc(Timestamp dataNasc) {
    this.dataNasc = dataNasc;
}
public String getTelefone() {
    return telefone;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public Timestamp getDataCad() {
    return dataCad;
}
public void setDataCad(Timestamp dataCad) {
    this.dataCad = dataCad;
}


 
}
