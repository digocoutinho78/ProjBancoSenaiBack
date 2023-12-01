package com.api.senai.entities;

import java.sql.Timestamp;

import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;
import lombok.Data;



// ERRO EM DATA E ONETOONE - PESQUISAR
// @Data
@MappedSuperclass
public abstract class Pessoa {
    private String nome; 
    private String cpf;
    private Endereco endereco;
    private Timestamp dataNasc;
    private String telefone;
    private String email;
    private Timestamp dataCad; // data cadastro

// @OneToOne

// Abaixo para alinhar com o ViaCep

// @JoinColumn (name = "endereco", foreignKey = @ForeignKey(name = "endereco_fkey"))
// private Endereco endereco;

 
}
