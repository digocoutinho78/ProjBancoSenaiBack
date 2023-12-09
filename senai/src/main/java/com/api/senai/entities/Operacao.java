package com.api.senai.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.api.senai.repositories.enums.TipoOperacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Operacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OperacaoId;
    private TipoOperacao TipoOperacao; // saque deposito ou transferencia
    private BigDecimal valor;
    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn
    private Conta origem; // mapeado de conta

    @ManyToOne
    @JoinColumn
    private Conta destino; // mapeado de conta

    

}
