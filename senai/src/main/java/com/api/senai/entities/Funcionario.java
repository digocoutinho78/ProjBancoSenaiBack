package com.api.senai.entities;

import java.sql.Timestamp;

import com.api.senai.entities.Pessoa;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "funcionario")


public class Funcionario extends Pessoa{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long funcId ;
    private Agencia agencia;
    private String cargo;
    private Timestamp dataExclusao;
    private Boolean ativo;
    private String senha;



    }


    

