package com.api.senai.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.api.senai.Enums.TipoTransacao;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Conta origem;

    private Conta Destino;

    private BigDecimal valor; 

    private LocalDateTime dataHora;

    private TipoTransacao tipo;

    public Long getId() {
        return id;
    }

    public Conta getOrigem() {
        return origem;
    }

    public void setOrigem(Conta origem) {
        this.origem = origem;
    }

    public Conta getDestino() {
        return Destino;
    }

    public void setDestino(Conta destino) {
        Destino = destino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public Transacao(Long id, Conta origem, Conta destino, BigDecimal valor, LocalDateTime dataHora,
            TipoTransacao tipo) {
        this.id = id;
        this.origem = origem;
        Destino = destino;
        this.valor = valor;
        this.dataHora = dataHora;
        this.tipo = tipo;
    }

    
}
