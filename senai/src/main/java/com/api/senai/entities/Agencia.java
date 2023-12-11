package com.api.senai.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Data
@Entity
public class Agencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String agenciaId;
    
    @OneToOne
    @JoinColumn (name = "endereco", foreignKey = @ForeignKey(name =
    "endereco_fkey"))
    private Endereco endereco;

    @OneToMany(mappedBy = "agencia") // Especifica o relacionamento com a entidade "Conta".
    public List<Conta> contas;

    public Agencia(String agenciaId, Endereco endereco, List<Conta> contas) {
        this.agenciaId = agenciaId;
        this.endereco = endereco;
        this.contas = contas;
    }
}

/*A propriedade  contas  representa a coleção de entidades  Conta  associadas à entidade  Agencia . 
O atributo  mappedBy  é definido como "agencia" para indicar que o relacionamento é de propriedade da entidade  Conta  e 
a propriedade "agencia" na entidade  Conta  é o lado inverso do relacionamento. */
