package com.api.senai.entities;

public class Endereco {

   private String id;
   private String rua;
   private String numero;
   private String cep;
   private String bairro;
   
public Endereco(String id, String rua, String numero, String cep, String bairro) {
    this.id = id;
    this.rua = rua;
    this.numero = numero;
    this.cep = cep;
    this.bairro = bairro;
}

public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getRua() {
    return rua;
}
public void setRua(String rua) {
    this.rua = rua;
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

    //implementar o via cep aqui 

    
}
