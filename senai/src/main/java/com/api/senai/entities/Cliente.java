package com.api.senai.entities;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.convert.DataSizeUnit;

import com.api.senai.entities.Pessoa;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner;

@AllArgsConstructor // cria automaticamente um construtor com todos atributos da classe
@NoArgsConstructor // cria automaticamente um construtor vazio

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "cliente")

// unique constraint?

public class Cliente extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    private String login;
    private String senha;
    private boolean ativo;
    private Timestamp dataExclusao;

    @OneToOne(mappedBy = "cliente")
    private Conta conta;

    // public Cliente(String nome, String cpf, Endereco endereco, Timestamp
    // dataNasc, String telefone, String email,
    // Timestamp dataCad, Conta conta, String clienteId, Timestamp dataExclusao,
    // Boolean ativo) {
    // super(nome, cpf, endereco, dataNasc, telefone, email, dataCad);
    // this.conta = conta;
    // this.clienteId = clienteId;
    // this.dataExclusao = dataExclusao;
    // this.ativo = ativo;
    // }

}
