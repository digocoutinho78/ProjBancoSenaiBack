package com.api.senai.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.convert.DataSizeUnit;



import com.api.senai.entities.Pessoa;

import lombok.Data;
import lombok.EqualsAndHashCode;




@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "cliente")

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
    
    
}
